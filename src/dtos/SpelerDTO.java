package dtos;

import java.util.List;

import domein.Edele;
import domein.EdelsteenAantal;
import domein.Ontwikkelingskaart;

public record SpelerDTO(String gebruikersnaam, int geboortejaar, int totaalAantalPrestigepunten, boolean isAanDeBeurt, boolean isStartspeler, List<Ontwikkelingskaart> ontwikkelingskaartenInBezit, List<EdelsteenAantal> edelsteenfichesInBezit, List<Edele> edelenInBezit) {

}
