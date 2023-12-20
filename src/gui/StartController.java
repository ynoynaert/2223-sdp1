package gui;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.ResourceBundle;

import domein.DomeinController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StartController extends StackPane{
	private DomeinController dc;
	public static MediaPlayer mp;
	
	private BigDecimal volume= new BigDecimal(0.70);
	
	@FXML
    private ImageView BGImage;
	
    @FXML
    private ImageView volumeImages;
	
	@FXML
	private Slider SLVolume;
	
    @FXML
    private Label LblVolume;

    @FXML
    private MenuItem MI_en;

    @FXML
    private MenuItem MI_nl;

    @FXML
    private Button btnSpelen;

    @FXML
    private Rectangle kader;

    @FXML
    private Text titelSpel;
    
    @FXML
    private MenuButton MBTaal;
    
	public StartController(DomeinController dc) {
		this.dc = dc;
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Start.fxml"));
		loader.setRoot(this);
		loader.setController(this);
		
		String sound = "src/sounds/achtergrondmuziekje.mp3";
    	Media mediaSound = new Media(new File(sound).toURI().toString());
    	mp = new MediaPlayer(mediaSound);
    	mp.play(); 
    	
		try {
			loader.load();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@FXML
    void btnSpelenClicked(ActionEvent event) {
		MenuController mc = new MenuController(this, dc);
		Scene scene = new Scene(mc);
		Stage stage = (Stage) this.getScene().getWindow();
		stage.setScene(scene);
		stage.setMinWidth(600);
	    stage.setMinHeight(586);
		stage.show();
    }
	
    @FXML
    void MI_en_action(ActionEvent event) {
    	btnSpelen.setDisable(false);
    	MBTaal.setText(MI_en.getText());
    	dc.setTaal2("en");
    	btnSpelen.setText(DomeinController.getText("btnSpelen"));    
    }

    @FXML
    void MI_nl_action(ActionEvent event) {
    	btnSpelen.setDisable(false);
    	MBTaal.setText(MI_nl.getText());
    	dc.setTaal2("nl");
    	btnSpelen.setText(DomeinController.getText("btnSpelen"));
    }
    
    private String percentToText(BigDecimal value) {
        return String.format("%.0f%%", value.multiply(new BigDecimal(100)));
    }
    
    @FXML
    void SLVolumeDrag(MouseEvent event) {
    	SLVolume.valueProperty().addListener((ov, oldValue, newValue) -> {
            volume = BigDecimal.valueOf(Math.ceil(newValue.doubleValue())/100);
            LblVolume.setText(percentToText(volume));
            mp.setVolume(volume.doubleValue());
            if(volume.multiply(new BigDecimal(100)).compareTo(BigDecimal.ZERO)==0) {
        		volumeImages.setImage(new Image(getClass().getResourceAsStream("/images/mute.png")));
        	}else {
        		volumeImages.setImage(new Image(getClass().getResourceAsStream("/images/luid.png")));
        	}
        }); 
    }
    
}