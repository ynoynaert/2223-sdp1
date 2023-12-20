package domein;

import javafx.scene.image.Image;

public class Edele extends Prestige {

	private String naam;
	
	public Edele(int prestigepunten, Image image,String naam) {
		super(prestigepunten, image);
		this.naam=naam;
	}	
	
	public String getNaam() {
		return naam;
	}
}