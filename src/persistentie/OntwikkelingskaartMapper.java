package persistentie;

import java.util.ArrayList;
import java.util.List;

import domein.Ontwikkelingskaart;
import javafx.scene.image.Image;
import util.EdelsteenSoort;

public class OntwikkelingskaartMapper {

	public List<Ontwikkelingskaart> lijstKaartenNiveau1() {
		List<Ontwikkelingskaart> lijstKaartenNiveau1 = new ArrayList<>();
	
		// Kaart parameters -> niveau, prestige, edelsteensoort bonus
		// kaart aanmaken, kost toevoegen, kaart in lijst steken
		
		// niveau 1 -> a
		Ontwikkelingskaart a1 = new Ontwikkelingskaart(1, 1, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a1.png")));
		a1.voegKostToe(4, EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau1.add(a1);
		
		Ontwikkelingskaart a2 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a2.png")));
		a2.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a2.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a2.voegKostToe(2, EdelsteenSoort.ROBIJN);
		a2.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a2);
		
		Ontwikkelingskaart a3 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a3.png")));
		a3.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a3.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a3);
		
		Ontwikkelingskaart a4 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a4.png")));
		a4.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a4.voegKostToe(3, EdelsteenSoort.ROBIJN);
		a4.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a4);
		
		Ontwikkelingskaart a5 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a5.png")));
		a5.voegKostToe(3, EdelsteenSoort.DIAMANT);
		lijstKaartenNiveau1.add(a5);
		
		Ontwikkelingskaart a6 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a6.png")));
		a6.voegKostToe(2, EdelsteenSoort.DIAMANT);
		a6.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a6.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a6);
		
		Ontwikkelingskaart a7 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a7.png")));
		a7.voegKostToe(2, EdelsteenSoort.DIAMANT);
		a7.voegKostToe(1, EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau1.add(a7);
		
		Ontwikkelingskaart a8 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a8.png")));
		a8.voegKostToe(3, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau1.add(a8);
		
		Ontwikkelingskaart a9 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a9.png")));
		a9.voegKostToe(2, EdelsteenSoort.SAFFIER);
		a9.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a9);
		
		Ontwikkelingskaart a10 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a10.png")));
		a10.voegKostToe(3, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a10);
		
		Ontwikkelingskaart a11 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a11.png")));
		a11.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a11.voegKostToe(1, EdelsteenSoort.ROBIJN);
		a11.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a11);
		
		Ontwikkelingskaart a12 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a12.png")));
		a12.voegKostToe(2, EdelsteenSoort.SAFFIER);
		a12.voegKostToe(1, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau1.add(a12);
		
		Ontwikkelingskaart a13 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a13.png")));
		a13.voegKostToe(2, EdelsteenSoort.DIAMANT);
		a13.voegKostToe(2, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau1.add(a13);
		
		Ontwikkelingskaart a14 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a14.png")));
		a14.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a14.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a14.voegKostToe(1, EdelsteenSoort.ROBIJN);
		a14.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a14);
		
		Ontwikkelingskaart a15 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a15.png")));
		a15.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a15.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a15.voegKostToe(1, EdelsteenSoort.ROBIJN);
		a15.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a15);
		
		Ontwikkelingskaart a16 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a16.png")));
		a16.voegKostToe(2, EdelsteenSoort.DIAMANT);
		a16.voegKostToe(2, EdelsteenSoort.SAFFIER);
		a16.voegKostToe(1, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a16);
		
		Ontwikkelingskaart a17 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a17.png")));
		a17.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a17.voegKostToe(3, EdelsteenSoort.SAFFIER);
		a17.voegKostToe(1, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau1.add(a17);
		
		Ontwikkelingskaart a18 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a18.png")));
		a18.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a18.voegKostToe(2, EdelsteenSoort.SMARAGD);
		a18.voegKostToe(1, EdelsteenSoort.ROBIJN);
		a18.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a18);
		
		Ontwikkelingskaart a19 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a19.png")));
		a19.voegKostToe(2, EdelsteenSoort.SAFFIER);
		a19.voegKostToe(2, EdelsteenSoort.SMARAGD);
		a19.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a19);
		
		Ontwikkelingskaart a20 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a20.png")));
		a20.voegKostToe(3, EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau1.add(a20);
		
		Ontwikkelingskaart a21 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a21.png")));
		a21.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a21.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a21.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a21.voegKostToe(1, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a21);
		
		Ontwikkelingskaart a22 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a22.png")));
		a22.voegKostToe(3, EdelsteenSoort.DIAMANT);
		a22.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a22.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a22);
		
		Ontwikkelingskaart a23 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a23.png")));
		a23.voegKostToe(2, EdelsteenSoort.SMARAGD);
		a23.voegKostToe(1, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a23);
		
		Ontwikkelingskaart a24 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a24.png")));
		a24.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a24.voegKostToe(2, EdelsteenSoort.ROBIJN);
		a24.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a24);
		
		Ontwikkelingskaart a25 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a25.png")));
		a25.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a25);
		
		Ontwikkelingskaart a26 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a26.png")));
		a26.voegKostToe(2, EdelsteenSoort.DIAMANT);
		a26.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a26.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a26.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a26);
		
		Ontwikkelingskaart a27 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a27.png")));
		a27.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a27.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a27.voegKostToe(1, EdelsteenSoort.ROBIJN);
		a27.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a27);
		
		Ontwikkelingskaart a28 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a28.png")));
		a28.voegKostToe(2, EdelsteenSoort.ROBIJN);
		a28.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a28);
		
		Ontwikkelingskaart a29 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a29.png")));
		a29.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a29.voegKostToe(3, EdelsteenSoort.SMARAGD);
		a29.voegKostToe(1, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a29);
		
		Ontwikkelingskaart a30 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a30.png")));
		a30.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a30.voegKostToe(2, EdelsteenSoort.SMARAGD);
		a30.voegKostToe(2, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a30);
		
		Ontwikkelingskaart a31 = new Ontwikkelingskaart(1, 1, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/a31.png")));
		a31.voegKostToe(4,  EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau1.add(a31);
		
		Ontwikkelingskaart a32 = new Ontwikkelingskaart(1, 1, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a32.png")));
		a32.voegKostToe(4, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a32);
		
		Ontwikkelingskaart a33 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/a33.png")));
		a33.voegKostToe(2, EdelsteenSoort.SAFFIER);
		a33.voegKostToe(2, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a33);
		
		Ontwikkelingskaart a34 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a34.png")));
		a34.voegKostToe(2, EdelsteenSoort.DIAMANT);
		a34.voegKostToe(2, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a34);
		
		Ontwikkelingskaart a35 = new Ontwikkelingskaart(1, 1, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a35.png")));
		a35.voegKostToe(4, EdelsteenSoort.DIAMANT);
		lijstKaartenNiveau1.add(a35);
		
		Ontwikkelingskaart a36 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a36.png")));
		a36.voegKostToe(2, EdelsteenSoort.SMARAGD);
		a36.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a36);
		
		Ontwikkelingskaart a37 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a37.png")));
		a37.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a37.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a37.voegKostToe(1, EdelsteenSoort.ROBIJN);
		a37.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a37);
		
		Ontwikkelingskaart a38 = new Ontwikkelingskaart(1, 1, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/a38.png")));
		a38.voegKostToe(1, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a38);
		
		Ontwikkelingskaart a39 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/a39.png")));
		a39.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a39.voegKostToe(1, EdelsteenSoort.SAFFIER);
		a39.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a39.voegKostToe(1, EdelsteenSoort.ONYX);
		lijstKaartenNiveau1.add(a39);
		
		Ontwikkelingskaart a40 = new Ontwikkelingskaart(1, 0, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/a40.png")));
		a40.voegKostToe(1, EdelsteenSoort.DIAMANT);
		a40.voegKostToe(2, EdelsteenSoort.SAFFIER);
		a40.voegKostToe(1, EdelsteenSoort.SMARAGD);
		a40.voegKostToe(1, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau1.add(a40);

		
		return lijstKaartenNiveau1;		
	}

	public List<Ontwikkelingskaart> lijstKaartenNiveau2(){
		List<Ontwikkelingskaart> lijstKaartenNiveau2 = new ArrayList<>();
		
		// niveau 2 -> b
		
		Ontwikkelingskaart b1 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/b1.png")));
		b1.voegKostToe(5, EdelsteenSoort.DIAMANT);
		lijstKaartenNiveau2.add(b1);
		
		Ontwikkelingskaart b2 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/b2.png")));
		b2.voegKostToe(3, EdelsteenSoort.DIAMANT);
		b2.voegKostToe(2, EdelsteenSoort.SAFFIER);
		b2.voegKostToe(2, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau2.add(b2);
		
		Ontwikkelingskaart b3 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/b3.png")));
		b3.voegKostToe(3, EdelsteenSoort.SAFFIER);
		b3.voegKostToe(2, EdelsteenSoort.ROBIJN);
		b3.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b3);
		
		Ontwikkelingskaart b4 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/b4.png")));
		b4.voegKostToe(2, EdelsteenSoort.DIAMANT);
		b4.voegKostToe(3, EdelsteenSoort.SAFFIER);
		b4.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b4);
		
		Ontwikkelingskaart b5 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/b5.png")));
		b5.voegKostToe(1, EdelsteenSoort.SMARAGD);
		b5.voegKostToe(4, EdelsteenSoort.ROBIJN);
		b5.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b5);
		
		Ontwikkelingskaart b6 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/b6.png")));
		b6.voegKostToe(2, EdelsteenSoort.DIAMANT);
		b6.voegKostToe(3, EdelsteenSoort.SAFFIER);
		b6.voegKostToe(3, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau2.add(b6);
		
		Ontwikkelingskaart b7 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/b7.png")));
		b7.voegKostToe(3,  EdelsteenSoort.DIAMANT);
		b7.voegKostToe(2,  EdelsteenSoort.SMARAGD);
		b7.voegKostToe(3,  EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau2.add(b7);
		
		Ontwikkelingskaart b8 = new Ontwikkelingskaart(2,  2, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/b8.png")));
		b8.voegKostToe(2, EdelsteenSoort.DIAMANT);
		b8.voegKostToe(1, EdelsteenSoort.ROBIJN);
		b8.voegKostToe(4, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b8);
		
		Ontwikkelingskaart b9 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/b9.png")));
		b9.voegKostToe(5, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b9);
		
		Ontwikkelingskaart b10 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/b10.png")));
		b10.voegKostToe(3, EdelsteenSoort.DIAMANT);
		b10.voegKostToe(5, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b10);
		
		Ontwikkelingskaart b11 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/b11.png")));
		b11.voegKostToe(2, EdelsteenSoort.SAFFIER);
		b11.voegKostToe(3, EdelsteenSoort.SMARAGD);
		b11.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b11);
		
		Ontwikkelingskaart b12 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/b12.png")));
		b12.voegKostToe(2,  EdelsteenSoort.DIAMANT);
		b12.voegKostToe(2, EdelsteenSoort.ROBIJN);
		b12.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b12);
		
		Ontwikkelingskaart b13 = new Ontwikkelingskaart(2, 3, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/b13.png")));
		b13.voegKostToe(6, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau2.add(b13);
		
		Ontwikkelingskaart b14 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/b14.png")));
		b14.voegKostToe(1, EdelsteenSoort.DIAMANT);
		b14.voegKostToe(4, EdelsteenSoort.SAFFIER);
		b14.voegKostToe(2, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau2.add(b14);
		
		Ontwikkelingskaart b15 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/b15.png")));
		b15.voegKostToe(5, EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau2.add(b15);
		
		Ontwikkelingskaart b16 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/b16.png")));
		b16.voegKostToe(5, EdelsteenSoort.SAFFIER);
		b16.voegKostToe(3, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau2.add(b16);
		
		Ontwikkelingskaart b17 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/b17.png")));
		b17.voegKostToe(4,  EdelsteenSoort.DIAMANT);
		b17.voegKostToe(2,  EdelsteenSoort.SAFFIER);
		b17.voegKostToe(1,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b17);
		
		Ontwikkelingskaart b18 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/b18.png")));
		b18.voegKostToe(5, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau2.add(b18);
		
		Ontwikkelingskaart b19 = new Ontwikkelingskaart(2, 3, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/b19.png")));
		b19.voegKostToe(6,  EdelsteenSoort.DIAMANT);
		lijstKaartenNiveau2.add(b19);
		
		Ontwikkelingskaart b20 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/b20.png")));
		b20.voegKostToe(1, EdelsteenSoort.SAFFIER);
		b20.voegKostToe(4, EdelsteenSoort.SMARAGD);
		b20.voegKostToe(2, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau2.add(b20);
		
		Ontwikkelingskaart b21 = new Ontwikkelingskaart(2, 3, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/b21.png")));
		b21.voegKostToe(6, EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau2.add(b21);
		
		Ontwikkelingskaart b22 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/b22.png")));
		b22.voegKostToe(5,  EdelsteenSoort.SMARAGD);
		b22.voegKostToe(3,  EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau2.add(b22);
		
		Ontwikkelingskaart b23 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/b23.png")));
		b23.voegKostToe(3, EdelsteenSoort.SMARAGD);
		b23.voegKostToe(2, EdelsteenSoort.ROBIJN);
		b23.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b23);
		
		Ontwikkelingskaart b24 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/b24.png")));
		b24.voegKostToe(2, EdelsteenSoort.SAFFIER);
		b24.voegKostToe(2, EdelsteenSoort.SMARAGD);
		b24.voegKostToe(3, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau2.add(b24);
		
		Ontwikkelingskaart b25 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/b25.png")));
		b25.voegKostToe(3, EdelsteenSoort.DIAMANT);
		b25.voegKostToe(3, EdelsteenSoort.SMARAGD);
		b25.voegKostToe(2, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b25);
		
		Ontwikkelingskaart b26 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/b26.png")));
		b26.voegKostToe(5, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau2.add(b26);
		
		Ontwikkelingskaart b27 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/b27.png")));
		b27.voegKostToe(5, EdelsteenSoort.ROBIJN);
		b27.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b27);
		
		Ontwikkelingskaart b28 = new Ontwikkelingskaart(2, 1, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/b28.png")));
		b28.voegKostToe(6, EdelsteenSoort.ONYX);
		lijstKaartenNiveau2.add(b28);
		
		Ontwikkelingskaart b29 = new Ontwikkelingskaart(2, 2, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/b29.png")));
		b29.voegKostToe(5, EdelsteenSoort.DIAMANT);
		b29.voegKostToe(3, EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau2.add(b29);
		
		Ontwikkelingskaart b30 = new Ontwikkelingskaart(2, 3, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/b30.png")));
		b30.voegKostToe(6, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau2.add(b30);
		
		
		return lijstKaartenNiveau2;
	}
	
	public List<Ontwikkelingskaart> lijstKaartenNiveau3(){
		List<Ontwikkelingskaart> lijstKaartenNiveau3 = new ArrayList<>();
		
		// niveau 3 -> c
		
		Ontwikkelingskaart c1 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/c1.png")));
		c1.voegKostToe(3, EdelsteenSoort.SAFFIER);
		c1.voegKostToe(6,  EdelsteenSoort.SMARAGD);
		c1.voegKostToe(3,  EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau3.add(c1);
		
		Ontwikkelingskaart c2 = new Ontwikkelingskaart(3, 5, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/c2.png")));
		c2.voegKostToe(7,  EdelsteenSoort.ROBIJN);
		c2.voegKostToe(3,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c2);

		
		Ontwikkelingskaart c3 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/c3.png")));
		c3.voegKostToe(3, EdelsteenSoort.SMARAGD);
		c3.voegKostToe(6, EdelsteenSoort.ROBIJN);
		c3.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c3);
		
		
		Ontwikkelingskaart c4 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/c4.png")));
		c4.voegKostToe(3, EdelsteenSoort.DIAMANT);
		c4.voegKostToe(6, EdelsteenSoort.SAFFIER);
		c4.voegKostToe(3, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau3.add(c4);
		
		
		Ontwikkelingskaart c5 = new Ontwikkelingskaart(3, 5, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/c5.png")));
		c5.voegKostToe(3,  EdelsteenSoort.DIAMANT);
		c5.voegKostToe(7, EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c5);
		
		Ontwikkelingskaart c6 = new Ontwikkelingskaart(3, 3, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/c6.png")));
		c6.voegKostToe(3, EdelsteenSoort.SAFFIER);
		c6.voegKostToe(3, EdelsteenSoort.SMARAGD);
		c6.voegKostToe(5, EdelsteenSoort.ROBIJN);
		c6.voegKostToe(3, EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c6);
		
		Ontwikkelingskaart c7 = new Ontwikkelingskaart(3, 5, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/c7.png")));
		c7.voegKostToe(7,  EdelsteenSoort.SMARAGD);
		c7.voegKostToe(3,  EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau3.add(c7);
		
		Ontwikkelingskaart c8 = new Ontwikkelingskaart(3, 3, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/c8.png")));
		c8.voegKostToe(3,  EdelsteenSoort.DIAMANT);
		c8.voegKostToe(3,  EdelsteenSoort.SMARAGD);
		c8.voegKostToe(3,  EdelsteenSoort.ROBIJN);
		c8.voegKostToe(5,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c8);
		
		Ontwikkelingskaart c9 = new Ontwikkelingskaart(3, 3, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/c9.png")));
		c9.voegKostToe(5,  EdelsteenSoort.DIAMANT);
		c9.voegKostToe(3,  EdelsteenSoort.SAFFIER);
		c9.voegKostToe(3,  EdelsteenSoort.ROBIJN);
		c9.voegKostToe(3,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c9);
		
		Ontwikkelingskaart c10 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/c10.png")));
		c10.voegKostToe(7, EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau3.add(c10);
		
		Ontwikkelingskaart c11 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/c11.png")));
		c11.voegKostToe(7, EdelsteenSoort.DIAMANT);
		lijstKaartenNiveau3.add(c11);
		
		Ontwikkelingskaart c12 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/c12.png")));
		c12.voegKostToe(7, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau3.add(c12);
		
		Ontwikkelingskaart c13 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/c13.png")));
		c13.voegKostToe(7,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c13);
		
		Ontwikkelingskaart c14 = new Ontwikkelingskaart(3, 5, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/c14.png")));
		c14.voegKostToe(7,  EdelsteenSoort.SAFFIER);
		c14.voegKostToe(3,  EdelsteenSoort.SMARAGD);
		lijstKaartenNiveau3.add(c14);
		
		Ontwikkelingskaart c15 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.DIAMANT, new Image(getClass().getResourceAsStream("/images/c15.png")));
		c15.voegKostToe(3,  EdelsteenSoort.DIAMANT);
		c15.voegKostToe(3,  EdelsteenSoort.ROBIJN);
		c15.voegKostToe(6,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c15);
		
		Ontwikkelingskaart c16 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/c16.png")));
		c16.voegKostToe(6,  EdelsteenSoort.DIAMANT);
		c16.voegKostToe(3,  EdelsteenSoort.SAFFIER);
		c16.voegKostToe(3,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c16);
		
		Ontwikkelingskaart c17 = new Ontwikkelingskaart(3, 4, EdelsteenSoort.SMARAGD, new Image(getClass().getResourceAsStream("/images/c17.png")));
		c17.voegKostToe(7,  EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau3.add(c17);
		
		Ontwikkelingskaart c18 = new Ontwikkelingskaart(3, 3, EdelsteenSoort.ONYX, new Image(getClass().getResourceAsStream("/images/c18.png")));
		c18.voegKostToe(3, EdelsteenSoort.DIAMANT);
		c18.voegKostToe(3, EdelsteenSoort.SAFFIER);
		c18.voegKostToe(5, EdelsteenSoort.SMARAGD);
		c18.voegKostToe(3, EdelsteenSoort.ROBIJN);
		lijstKaartenNiveau3.add(c18);
		
		Ontwikkelingskaart c19 = new Ontwikkelingskaart(1, 3, EdelsteenSoort.ROBIJN, new Image(getClass().getResourceAsStream("/images/c19.png")));
		c19.voegKostToe(3,  EdelsteenSoort.DIAMANT);
		c19.voegKostToe(5,  EdelsteenSoort.SAFFIER);
		c19.voegKostToe(3,  EdelsteenSoort.SMARAGD);
		c19.voegKostToe(3,  EdelsteenSoort.ONYX);
		lijstKaartenNiveau3.add(c19);
		
		Ontwikkelingskaart c20 = new Ontwikkelingskaart(1, 5, EdelsteenSoort.SAFFIER, new Image(getClass().getResourceAsStream("/images/c20.png")));
		c20.voegKostToe(7, EdelsteenSoort.DIAMANT);
		c20.voegKostToe(3, EdelsteenSoort.SAFFIER);
		lijstKaartenNiveau3.add(c20);
		
		return lijstKaartenNiveau3;
	}
}