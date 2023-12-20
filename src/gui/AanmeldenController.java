package gui;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import domein.DomeinController;
import domein.Speler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AanmeldenController extends StackPane{

	private DomeinController dc;
	private MenuController preMenuScreen;
	private int aantalSpelersInSpel;
	
	@FXML
	private Button btnLogIn;

	@FXML
	private Button btnStartSpel;

	@FXML
	private Button btnTerug;

	@FXML
	private Rectangle kader;

	@FXML
	private Label lblGeboortejaar;

	@FXML
	private Label lblGebruikersnaam;
	
	@FXML
	private TextField txfGeboortjaar;
	
	@FXML
	private TextField txfGebruikersnaam;

	public AanmeldenController(MenuController preMenuScreen, DomeinController dc) {
		this.preMenuScreen = preMenuScreen;
		this.dc = dc;
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Aanmelden.fxml"));
		loader.setRoot(this);
		loader.setController(this);
		
		
		try {
			loader.load();
			setAantalSpelersInSpel(dc.spelersInSpel);
			knoppenDisable();
			
			btnLogIn.setText(DomeinController.getText("btnLogIn"));
			btnTerug.setText(DomeinController.getText("btnTerug"));
			btnStartSpel.setText(DomeinController.getText("btnStartSpel"));
			lblGebruikersnaam.setText(DomeinController.getText("lblGebruikersnaam"));
			lblGeboortejaar.setText(DomeinController.getText("lblGeboortejaar"));
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@FXML
	void btnLogInClicked(ActionEvent event) {
		try {
			String gebruikersnaam = txfGebruikersnaam.getText();
			int geboortejaar = Integer.parseInt(txfGeboortjaar.getText());
			
			Speler sp = new Speler(gebruikersnaam, geboortejaar);
			if(dc.spelerAlAangemeld(sp)) {
				if(dc.meldAan(sp)) {
					aanmeldAlert(gebruikersnaam, geboortejaar);
				}
				else{
					Alert alert = new Alert(AlertType.CONFIRMATION);
					alert.setTitle(DomeinController.getText("btnLogInClicked1"));
					alert.setContentText(DomeinController.getText("btnLogInClicked2"));
					Optional<ButtonType> result = alert.showAndWait();
					if(result.get() == ButtonType.OK) {
						dc.voegToe(sp);
						dc.meldAan(sp);
						aanmeldAlert(gebruikersnaam, geboortejaar);
					}
				}
			}else {
				throw new IllegalArgumentException(DomeinController.getText("btnLogInClicked3"));
			}
			
			knoppenDisable();
			txfGeboortjaar.setStyle("-fx-text-box-border: white");
			txfGeboortjaar.setPromptText("");
		}catch(NumberFormatException ex) {
			txfGeboortjaar.setText("");
			txfGeboortjaar.setPromptText(DomeinController.getText("AanmeldenMislukt2"));
			txfGeboortjaar.setStyle("-fx-text-box-border: red");
		}catch(IllegalArgumentException ex) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle(DomeinController.getText("AanmeldenMislukt1"));
			alert.setContentText(ex.getMessage());
			alert.show();
		}
	}
	
	private void aanmeldAlert(String gebruikersnaam, int geboortejaar) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(DomeinController.getText("AanmeldenGelukt1"));
		alert.setContentText(String.format(DomeinController.getText("AanmeldenGelukt2"), gebruikersnaam, geboortejaar));
		alert.show();
		aantalSpelersInSpel = dc.spelersInSpel.size();
		
		txfGeboortjaar.clear();
		txfGebruikersnaam.clear();
	}
	
	@FXML
    void btnTerugClicked(ActionEvent event) {
		Stage stage = (Stage) (getScene().getWindow());
		stage.setScene(preMenuScreen.getScene());
    }
	
	@FXML
	void btnStartSpelClicked(ActionEvent event) {
		try {
			if(dc.controleerAantalSpelers()) {
				dc.startSpel();
				dc.isStartSpeler();
				
				StartSpelController ssc = new StartSpelController(this, dc);
				Scene scene1 = new Scene(ssc);
				Stage stage1 = (Stage) this.getScene().getWindow();
				stage1.setScene(scene1);
				stage1.setMinWidth(1200);
			    stage1.setMinHeight(800);
				stage1.setMaximized(true);
				stage1.show();
			}
		}catch(IllegalArgumentException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Aantal spelers incorrect");
			alert.setContentText(e.getMessage());
			alert.show();
		}
	}
	
	private void setAantalSpelersInSpel(List<Speler> aantalSpelersInSpelLijst) {
		if(aantalSpelersInSpelLijst == null)
			this.aantalSpelersInSpel = 0;
		else
		 this.aantalSpelersInSpel = aantalSpelersInSpelLijst.size();
	}
	
	private void knoppenDisable() {
		if(aantalSpelersInSpel > 1)
			btnStartSpel.setDisable(false);
		if(aantalSpelersInSpel == 4)
			btnLogIn.setDisable(true);
	}
}