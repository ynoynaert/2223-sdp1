package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Edele;
import javafx.scene.image.Image;
import util.EdelsteenSoort;

public class EdeleMapper {
	public List<Edele> lijstEdelen(){
		List<Edele> lijstEdelen = new ArrayList<>();
		
		Edele e1 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart1.png")),"Rihanna");
		e1.voegKostToe(4, EdelsteenSoort.ONYX);
		e1.voegKostToe(4, EdelsteenSoort.DIAMANT);
		lijstEdelen.add(e1);
		
		Edele e2 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart2.png")),"Blake");
		e2.voegKostToe(3, EdelsteenSoort.ONYX);
		e2.voegKostToe(3, EdelsteenSoort.ROBIJN);
		e2.voegKostToe(3, EdelsteenSoort.DIAMANT);
		lijstEdelen.add(e2);
		
		Edele e3 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart3.png")),"Katy");
		e3.voegKostToe(3, EdelsteenSoort.ONYX);
		e3.voegKostToe(3, EdelsteenSoort.SAFFIER);
		e3.voegKostToe(3, EdelsteenSoort.DIAMANT);
		lijstEdelen.add(e3);
		
		Edele e4 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart4.png")),"Nicki");
		e4.voegKostToe(3, EdelsteenSoort.SMARAGD);
		e4.voegKostToe(3, EdelsteenSoort.SAFFIER);
		e4.voegKostToe(3, EdelsteenSoort.DIAMANT);
		lijstEdelen.add(e4);
		
		Edele e5 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart5.png")),"Lady Gaga");
		e5.voegKostToe(3, EdelsteenSoort.ONYX);
		e5.voegKostToe(3, EdelsteenSoort.ROBIJN);
		e5.voegKostToe(3, EdelsteenSoort.SMARAGD);
		lijstEdelen.add(e5);
		
		Edele e6 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart6.png")),"Zendaya");
		e6.voegKostToe(3, EdelsteenSoort.SMARAGD);
		e6.voegKostToe(3, EdelsteenSoort.SAFFIER);
		e6.voegKostToe(3, EdelsteenSoort.ROBIJN);
		lijstEdelen.add(e6);
		
		Edele e7 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart7.png")),"Taylor");
		e7.voegKostToe(4, EdelsteenSoort.SAFFIER);
		e7.voegKostToe(4, EdelsteenSoort.SMARAGD);
		lijstEdelen.add(e7);
		
		Edele e8 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart8.png")),"Conan");
		e8.voegKostToe(4, EdelsteenSoort.ONYX);
		e8.voegKostToe(4, EdelsteenSoort.ROBIJN);
		lijstEdelen.add(e8);
		
		Edele e9 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart9.png")),"Megan");
		e9.voegKostToe(4, EdelsteenSoort.SAFFIER);
		e9.voegKostToe(4, EdelsteenSoort.DIAMANT);
		lijstEdelen.add(e9);
		
		Edele e10 = new Edele(3, new Image(getClass().getResourceAsStream("/images/Edelekaart10.png")),"Gigi");
		e10.voegKostToe(4, EdelsteenSoort.ROBIJN);
		e10.voegKostToe(4, EdelsteenSoort.SMARAGD);
		lijstEdelen.add(e10);
		
		return lijstEdelen;
	}
}