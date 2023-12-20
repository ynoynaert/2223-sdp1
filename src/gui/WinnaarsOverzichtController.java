package gui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import domein.DomeinController;
import domein.Speler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class WinnaarsOverzichtController extends StackPane{

	private DomeinController dc;
	private StartSpelController preStartSpelScreen;
	private List<Speler> winnaars;

    @FXML
    private Label lblPrestigepunten;

    @FXML
    private Label lblSpeler;

    @FXML
    private Label lblWinnaar;
	
	@FXML
    private Label prestSpeler1;

    @FXML
    private Label prestSpeler2;

    @FXML
    private Label prestSpeler3;

    @FXML
    private Label prestSpeler4;

    @FXML
    private Label speler1;

    @FXML
    private Label speler2;

    @FXML
    private Label speler3;

    @FXML
    private Label speler4;

    public WinnaarsOverzichtController(StartSpelController preStartSpelScreen, DomeinController dc) {
    	this.preStartSpelScreen = preStartSpelScreen;
    	this.dc = dc;
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("WinnaarsOverzicht.fxml"));
    	loader.setRoot(this);
    	loader.setController(this);
    	
    	MediaPlayer mp = StartController.mp;
    	mp.pause();
    	
    	String sound2 = "src/sounds/winnaarsmuziekje.mp3";
    	Media mediaSound2 = new Media(new File(sound2).toURI().toString());
    	MediaPlayer mp2 = new MediaPlayer(mediaSound2);
    	mp2.play();
    	
    	try {
    		loader.load();
    		lblSpeler.setText(DomeinController.getText("lblSpeler"));
    		lblPrestigepunten.setText(DomeinController.getText("lblPrestigepunten"));
    		lblWinnaar.setText(DomeinController.getText("lblWinnaar"));

    		toonWinnaars();
    	}catch (IOException ex) {
    		throw new RuntimeException(ex);
    	}
	}

	private void toonWinnaars() {
		List<Label> spelerLabels = new ArrayList<>();
		spelerLabels.add(speler1);	
		spelerLabels.add(speler2);
		spelerLabels.add(speler3);
		spelerLabels.add(speler4);
		
		List<Label> prestLabels = new ArrayList<>();
		prestLabels.add(prestSpeler1);	
		prestLabels.add(prestSpeler2);
		prestLabels.add(prestSpeler3);
		prestLabels.add(prestSpeler4);
		
		int i = 0;
		winnaars = dc.getWinnaars();
		for(Speler w: winnaars) {
			spelerLabels.get(i).setText(w.getGebruikersnaam());
			prestLabels.get(i++).setText(toString(w.getTotaalAantalPrestigePunten()));
		}
		
	}
	
	private String toString(int aantal) {
		return String.format("%d", aantal);
	}
	
}
