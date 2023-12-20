package domein;

import java.util.List;

import persistentie.OntwikkelingskaartMapper;

public class OntwikkelingskaartRepository {
	private final OntwikkelingskaartMapper mapper;
	
	public OntwikkelingskaartRepository() {
		mapper = new OntwikkelingskaartMapper();
	}
	
	public List<Ontwikkelingskaart> geefKaartenNiveau1(){
		List<Ontwikkelingskaart>lijstKaartenNiveau1 = mapper.lijstKaartenNiveau1();
		return lijstKaartenNiveau1;
	}
	
	public List<Ontwikkelingskaart> geefKaartenNiveau2(){
		List<Ontwikkelingskaart>lijstKaartenNiveau2 = mapper.lijstKaartenNiveau2();
		return lijstKaartenNiveau2;
	}
	
	public List<Ontwikkelingskaart> geefKaartenNiveau3(){
		List<Ontwikkelingskaart>lijstKaartenNiveau3 = mapper.lijstKaartenNiveau3();
		return lijstKaartenNiveau3;
	}
}