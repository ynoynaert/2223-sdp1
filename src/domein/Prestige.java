package domein;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import util.EdelsteenSoort;

public class Prestige {

	private int prestigepunten;
	private List<EdelsteenAantal> kosten;
	@FXML
	private Image image;
	
	public Prestige(int prestigepunten, Image image) {
		this.prestigepunten=prestigepunten;
		this.image = image;
		kosten = new ArrayList<>();
	}

	public void voegKostToe(int aantal, EdelsteenSoort soort) {
		kosten.add(new EdelsteenAantal(aantal, soort));
	}
	
	public int getPrestigepunten() {
		return this.prestigepunten;
	}
	
	public List<EdelsteenAantal> getKosten() {
		return kosten;
	}
	
	public Image getImage() {
		return image;
	}
}