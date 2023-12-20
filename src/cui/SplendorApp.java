package cui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;
import domein.Edele;
import domein.EdelsteenAantal;
import domein.Ontwikkelingskaart;
import domein.Speler;
import dtos.EdeleDTO;
import dtos.OntwikkelingskaartDTO;
import dtos.SpelerDTO;


public class SplendorApp {
	private DomeinController dc;
	private Scanner input = new Scanner(System.in);
	private int keuzeKeuzeMenu;
	private List<SpelerDTO> spelersDTO;
	private int aantalSpelersAangemeld = 0;
	
	public SplendorApp(DomeinController dc) {
		this.dc = dc;
		spelersDTO = new ArrayList<>();
	}
	
	public void start() {
		keuzeKeuzeMenu = toonKeuzeMenu();
		while(keuzeKeuzeMenu != 3) {
			switch(keuzeKeuzeMenu) {
				case 1 -> {
					valideerGegevensInput();
					keuzeKeuzeMenu = 0;
				}
				case 2 -> {
					if(controleerAantalSpelers()) {
						dc.startSpel();
						System.out.println("\n-- Spel gestart --");
						System.out.println("\n-- Overzicht spelers --");
						toonOverzichtSpelers();
						System.out.println("\n-- Overzicht spel --");
						toonOverzichtSpel();
					}else {
						keuzeKeuzeMenu = 0;	
					}
				}
				default	-> {
					System.out.println();
					keuzeKeuzeMenu = toonKeuzeMenu();
				}
			}
			if(keuzeKeuzeMenu == 2)
				break;	
			if(aantalSpelersAangemeld == 4)
				keuzeKeuzeMenu = 2;
			else
				keuzeKeuzeMenu = toonKeuzeMenu();
		}
	}	
	
	private boolean controleerAantalSpelers() {
		try {
			return dc.controleerAantalSpelers();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return false;		
	}
	
	private void toonOverzichtSpelers() {
		dc.isStartSpeler();
		spelersDTO = dc.geefSpelerDTO();
		String uitvoerGeg = "";
		uitvoerGeg+=String.format("%30s", "");
		for(SpelerDTO speler: spelersDTO)
			uitvoerGeg += String.format("%15s", speler.gebruikersnaam());
		uitvoerGeg += String.format("\nTotaal aantal prestigepunten: ");
		
		for(SpelerDTO speler: spelersDTO)
			uitvoerGeg += String.format("%15s", speler.totaalAantalPrestigepunten());
		uitvoerGeg += String.format("\nIs aan de beurt:%14s","");
		
		for(SpelerDTO speler: spelersDTO)
			uitvoerGeg += String.format("%15s", speler.isAanDeBeurt()==true?"ja":"nee");
		uitvoerGeg += String.format("\nIs startspeler:%15s","");	
		
		for(SpelerDTO speler: spelersDTO)
			uitvoerGeg += String.format("%15s", speler.isStartspeler()==true?"ja":"nee");
		uitvoerGeg += String.format("\nOntwikkelingskaarten in bezit:");
		
		for(SpelerDTO speler: spelersDTO)
			uitvoerGeg += String.format("%15s", speler.ontwikkelingskaartenInBezit()==null?0: speler.ontwikkelingskaartenInBezit());
		uitvoerGeg += String.format("\nEdesteenfiche in bezit:%7s","");
		
		for(SpelerDTO speler: spelersDTO) {
			uitvoerGeg += String.format("%15s", speler.edelsteenfichesInBezit().isEmpty()==true?0: speler.edelsteenfichesInBezit());
		}
		uitvoerGeg += String.format("\nEdelen in bezit:%14s","");
		
		for(SpelerDTO speler: spelersDTO)
			uitvoerGeg += String.format("%15s", speler.edelenInBezit()==null?0:speler.edelenInBezit());
		uitvoerGeg += String.format("\n");
		
		System.out.printf("%s%n", uitvoerGeg);
	}

	private void toonOverzichtSpel() {
		//Edele
		String uitvoerSpel="";
		uitvoerSpel+= "-- De Beschikbare edele:\n";
		List<EdeleDTO> beschikbareEdelen = dc.geefEdeleDTO();
		for(EdeleDTO eDTO:beschikbareEdelen) {
			List<EdelsteenAantal> kost = eDTO.kosten();
			uitvoerSpel += String.format("Prestigepunten: %d%nKost: ",eDTO.prestigepunten());
			for(EdelsteenAantal k: kost) {
				
				uitvoerSpel += String.format("%dx %s %n",k.getAantal(),k.getSoort().toString());
			}
			uitvoerSpel += String.format("\n\n");
		}
		
		//Ontwikkelingskaarten:
		uitvoerSpel+= String.format("-- Overzicht ontwikkelingskaarten:%n");
		uitvoerSpel+= String.format("-- niveau 1:%n");
		
		List<OntwikkelingskaartDTO> niveau1 = dc.getNiveau1Zichtbaar();
		int i=1;
		for(OntwikkelingskaartDTO okDTO1 : niveau1) {
			uitvoerSpel += String.format("Prestigepunten:%d%nBonus: %s%n",okDTO1.prestigepunten(),okDTO1.bonus().toString());
			List<EdelsteenAantal> kost = okDTO1.kosten();
			for(EdelsteenAantal k: kost) {
				uitvoerSpel += String.format("Kost: %dx %s %n",k.getAantal(),k.getSoort().toString());
			}
			uitvoerSpel += String.format("\n\n");
		}
		
		uitvoerSpel+= String.format("-- niveau 2:\n");
		List<OntwikkelingskaartDTO> niveau2 = dc.getNiveau2Zichtbaar();
		int j=1;
		for(OntwikkelingskaartDTO okDTO2 : niveau1) {
			uitvoerSpel += String.format("Prestigepunten:%d%nBonus: %s%n",okDTO2.prestigepunten(),okDTO2.bonus().toString());
			List<EdelsteenAantal> kost = okDTO2.kosten();
			for(EdelsteenAantal k: kost) {
				uitvoerSpel += String.format("%dx %s %n",k.getAantal(),k.getSoort().toString());
			}
			uitvoerSpel += String.format("\n\n");
		}
		
		uitvoerSpel+= String.format("-- niveau 3:\n");
		List<OntwikkelingskaartDTO> niveau3 = dc.getNiveau3Zichtbaar();
		int x=1;
		for(OntwikkelingskaartDTO okDTO3 : niveau1) {
			uitvoerSpel += String.format("Prestigepunten:%d%nBonus: %s%n",okDTO3.prestigepunten(),okDTO3.bonus().toString());
			List<EdelsteenAantal> kost = okDTO3.kosten();
			for(EdelsteenAantal k: kost) {
				uitvoerSpel += String.format("%dx %s %n",k.getAantal(),k.getSoort().toString());
			}
			uitvoerSpel += String.format("\n\n");
		}
		
		//Edelsteenfiches:
		
		uitvoerSpel+= String.format("-- Voorraad Smaragden:");
		uitvoerSpel += String.format("%d",dc.getSmaragdAantal().getAantal());
		uitvoerSpel += String.format("\n");
		
		uitvoerSpel += String.format("\n");
		uitvoerSpel+= String.format("-- Voorraad Saffieren:");
		uitvoerSpel += String.format("%d",dc.getSaffierAantal().getAantal());
		uitvoerSpel += String.format("\n");
		
		uitvoerSpel += String.format("\n");
		uitvoerSpel+= String.format("-- Voorraad Robijnen:");
		uitvoerSpel += String.format("%d",dc.getRobijnAantal().getAantal());
		uitvoerSpel += String.format("\n");
		
		uitvoerSpel += String.format("\n");
		uitvoerSpel+= String.format("-- Voorraad Onyxen:");
		uitvoerSpel += String.format("%d",dc.getOnyxAantal().getAantal());
		uitvoerSpel += String.format("\n");
		
		uitvoerSpel += String.format("\n");
		uitvoerSpel+= String.format("-- Voorraad Diamanten:");
		uitvoerSpel += String.format("%d",dc.getDiamantAantal().getAantal());
		uitvoerSpel += String.format("\n");
		
		System.out.printf("%s%n", uitvoerSpel);
	}
	
	private int toonKeuzeMenu() {
		do {
			try {
				System.out.println("-- Keuzemenu --");
				System.out.println("1. Een speler aanmelden");
				System.out.println("2. Stoppen met aanmelden en het spel starten");
				System.out.println("3. De applicatie stoppen");
				System.out.print("Maak je keuze (1-3): ");
				keuzeKeuzeMenu = input.nextInt();
			}catch(InputMismatchException exc) {
				System.out.println("Keuze moet een nummer zijn!\n");
			}finally {
				input.nextLine();
			}
		}while(keuzeKeuzeMenu < 1 || keuzeKeuzeMenu > 3);
		return keuzeKeuzeMenu;
	}
	
	private void valideerGegevensInput() {
		String gebruikersnaam = "";
		int geboortejaar = 0;
		boolean finished = false;
		
		do {
			try {
				System.out.print("Geef je gebruikersnaam in: ");
				gebruikersnaam = input.nextLine();
				
				System.out.print("Geef je geboortejaar in: ");
				geboortejaar = input.nextInt();
				
				Speler sp = new Speler(gebruikersnaam, geboortejaar);
				if(dc.spelerAlAangemeld(sp)) {
					if(dc.meldAan(sp)) {
						aantalSpelersAangemeld++;
						System.out.printf("Je bent aangemeld als %s geboren in %d%n%n", sp.getGebruikersnaam(), sp.getGeboortejaar());
					}
					else{
						String antwoord;
						do {
						System.out.print("De speler is nog niet geregistreerd, wil je dit doen?");
						input.nextLine();
						antwoord = input.nextLine().toLowerCase();
						}while(!(antwoord.equals("ja")||antwoord.equals("nee"))); // testen of dit werkt
						if(antwoord.equals("ja")) {
							dc.voegToe(sp);
							dc.meldAan(sp);
							aantalSpelersAangemeld++;
							System.out.printf("Je hebt een nieuwe speler geregistreerd met gebruikersnaam %s geboren in %d%n%n", sp.getGebruikersnaam(), sp.getGeboortejaar());	
						}else {
							valideerGegevensInput();
						}
					}
				}else {
					input.nextLine();
					throw new IllegalArgumentException("Deze speler is al aangemeld!\n");
				}
				finished = true;
			}catch(InputMismatchException e) {
				System.out.println("Verkeerde invoer, geboortejaar moet een getal zijn");
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}while(!finished);
	} 
}