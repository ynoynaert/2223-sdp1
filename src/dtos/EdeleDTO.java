package dtos;

import java.util.List;

import domein.EdelsteenAantal;
import javafx.scene.image.Image;

public record EdeleDTO(int prestigepunten,List<EdelsteenAantal> kosten, Image image) {

}
