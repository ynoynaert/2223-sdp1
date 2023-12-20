package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import util.EdelsteenSoort;
import util.TaalHelper;

public class Speler {
	private final String gebruikersnaam;
	private final int geboortejaar;
	private static final int HUIDIG_JAAR = 2023;
	private static final int MINIMUM_JAAR = HUIDIG_JAAR - 6;
	private static final int MAXIMUM_JAAR = HUIDIG_JAAR - 99;

	private int totaalAantalPrestigepunten;
	private boolean isAanDeBeurt;
	private boolean isStartspeler;
	private boolean isWinnaar;
	private List<Ontwikkelingskaart> ontwikkelingskaartenInBezit= new ArrayList<>();
	private List<EdelsteenAantal> edelsteenfichesInBezit = new ArrayList<>();
	private List<Edele> edelenInBezit = new ArrayList<>();
	private List<EdelsteenAantal> tmpFicheLijst = new ArrayList<>();
	private List<EdelsteenAantal> bonussen = new ArrayList<>();
	
	public Speler(String gebruikersnaam, int geboortejaar) {
		controleerGebruikersnaam(gebruikersnaam);
		controleerGeboortejaar(geboortejaar);
		ficheBegin();
		bonussenBegin();
		this.gebruikersnaam = gebruikersnaam;
		this.geboortejaar = geboortejaar;
	}
	
	private void ficheBegin() { // OPGEPAST AANGEPAST
		edelsteenfichesInBezit.add(new EdelsteenAantal(0,EdelsteenSoort.DIAMANT));//50
		edelsteenfichesInBezit.add(new EdelsteenAantal(0,EdelsteenSoort.ONYX));//50
		edelsteenfichesInBezit.add(new EdelsteenAantal(0,EdelsteenSoort.ROBIJN));//50
		edelsteenfichesInBezit.add(new EdelsteenAantal(0,EdelsteenSoort.SAFFIER));//50
		edelsteenfichesInBezit.add(new EdelsteenAantal(0,EdelsteenSoort.SMARAGD));//50
	}
	
	private void bonussenBegin() {
		bonussen.add(new EdelsteenAantal(0, EdelsteenSoort.DIAMANT));
		bonussen.add(new EdelsteenAantal(0, EdelsteenSoort.ONYX));
		bonussen.add(new EdelsteenAantal(0, EdelsteenSoort.ROBIJN));
		bonussen.add(new EdelsteenAantal(0, EdelsteenSoort.SAFFIER));
		bonussen.add(new EdelsteenAantal(0, EdelsteenSoort.SMARAGD));
	}
	
	private void controleerGebruikersnaam(String gebruikersnaam) {	
		if(gebruikersnaam == null || gebruikersnaam.isBlank())
			throw new IllegalArgumentException(TaalHelper.getText("controleerGebruikersnaam1"));
		if(!gebruikersnaam.matches("[a-zA-Z][\\w\\s]*"))
			throw new IllegalArgumentException(TaalHelper.getText("controleerGebruikersnaam2"));
	}
	
	private void controleerGeboortejaar(int geboortejaar) {
		if(geboortejaar < 0)
			throw new IllegalArgumentException(TaalHelper.getText("controleerGeboortejaar1"));
		if(geboortejaar > MINIMUM_JAAR || geboortejaar < MAXIMUM_JAAR)
			throw new IllegalArgumentException(TaalHelper.getText("controleerGeboortejaar2"));
	}
	
	public void voegEdeleToe(Edele edele) {
		edelenInBezit.add(edele);
		totaalAantalPrestigepunten += edele.getPrestigepunten();
	}
	
	public void voegEdelsteenficheToe(EdelsteenAantal fiche) {
		for(int i = 0; i < edelsteenfichesInBezit.size(); i++) {
			EdelsteenAantal huidige = edelsteenfichesInBezit.get(i);
			if(huidige.getSoort() == fiche.getSoort()) {
				huidige.setAantal(huidige.getAantal() + fiche.getAantal());
			}
		}
	}
	
	public void voegOntwikkelingskaartToe(Ontwikkelingskaart kaart) {
		ontwikkelingskaartenInBezit.add(kaart);
		totaalAantalPrestigepunten += kaart.getPrestigepunten();
		
		for(int i = 0; i < bonussen.size(); i++) {
			if(kaart.getBonus().equals(bonussen.get(i).getSoort())) {
				switch(kaart.getBonus()) {
				case DIAMANT -> bonussen.get(i).setAantal(bonussen.get(i).getAantal() + 1);
				case ONYX -> bonussen.get(i).setAantal(bonussen.get(i).getAantal() + 1);
				case ROBIJN -> bonussen.get(i).setAantal(bonussen.get(i).getAantal() + 1);
				case SAFFIER -> bonussen.get(i).setAantal(bonussen.get(i).getAantal() + 1);
				case SMARAGD -> bonussen.get(i).setAantal(bonussen.get(i).getAantal() + 1);
				}
			}	
		}	
	}
	
	public void verwijderEdelsteenfiches(EdelsteenSoort soort, int aantal) {
		for(int i = 0; i < edelsteenfichesInBezit.size(); i++) {
			if(edelsteenfichesInBezit.get(i).getSoort().equals(soort)) {
				edelsteenfichesInBezit.get(i).setAantal(edelsteenfichesInBezit.get(i).getAantal() - aantal);
			}
		}
	}
	
	public void voegTmpFicheToe(EdelsteenAantal fiche) {
		tmpFicheLijst.add(fiche);
	}
	
	public void voegTmpLijstFichesToeAanPermLijst() {
		for(int i = 0; i < tmpFicheLijst.size(); i++) {
			voegEdelsteenficheToe(new EdelsteenAantal(tmpFicheLijst.get(i).getAantal(), tmpFicheLijst.get(i).getSoort()));
		}
		tmpFicheLijst.clear();
	}
	
	public void verwijder1FicheUitTmpLijst(EdelsteenAantal fiche) {
		for(int i = 0; i < tmpFicheLijst.size(); i++) {
    		if(tmpFicheLijst.get(i).equals(fiche)) {
    			tmpFicheLijst.remove(i);
    		}
    	}
	}
	
	public void isStartspeler(boolean i) {
		isStartspeler = i;
	}
	
	public void isAanDeBeurt(boolean i) {
		isAanDeBeurt = i;
	}
	
	public boolean geefIsAanDeBeurt() {
		return isAanDeBeurt;
	}
	
	public boolean geefisStartSpeler() {
		return isStartspeler;
	}
	
	public List<Edele> getEdelenInBezit() {
		return edelenInBezit;
	}
	
	public List<EdelsteenAantal> getTmpFicheLijst() {
		return tmpFicheLijst;
	}
	
	public List<EdelsteenAantal> getEdelsteenfichesInBezit() {
		return edelsteenfichesInBezit;
	}
	
	public List<Ontwikkelingskaart> getOntwikkelingskaartenInBezit() {
		return ontwikkelingskaartenInBezit;
	}
	
	public int getTotaalAantalPrestigePunten() {
		return totaalAantalPrestigepunten;
	}
	
	public String getGebruikersnaam() {
		return this.gebruikersnaam;
	}

	public int getGeboortejaar() {
		return this.geboortejaar;
	}
	
	public List<EdelsteenAantal> getBonussen(){
		return this.bonussen;
	}
}