package domein;

import javafx.scene.image.Image;
import util.EdelsteenSoort;

public class Ontwikkelingskaart extends Prestige {
	private final int niveau;
	private EdelsteenSoort bonus;

	public Ontwikkelingskaart(int niveau, int prestigepunten, EdelsteenSoort bonus, Image image) {
		super(prestigepunten, image);
		this.niveau = niveau;
		this.bonus = bonus;
	}
	
	public int getNiveau() {
		return niveau;
	}
	
	public EdelsteenSoort getBonus() {
		return bonus;
	}
}