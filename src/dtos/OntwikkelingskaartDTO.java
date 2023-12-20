package dtos;

import java.util.List;

import domein.EdelsteenAantal;
import util.EdelsteenSoort;

public record OntwikkelingskaartDTO(int prestigepunten,List<EdelsteenAantal> kosten,int niveau,EdelsteenSoort bonus) {

}
