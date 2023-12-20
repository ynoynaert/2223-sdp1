package domein;

import persistentie.SpelerMapper;

public class SpelerRepository {
	private final SpelerMapper sm;

	public SpelerRepository() {
		sm = new SpelerMapper();
	}
	
	public Speler geefSpeler(String gebruikersnaam, int geboortejaar) {
		Speler sp = sm.geefSpeler(gebruikersnaam,geboortejaar);
		return sp;
	}
	public void voegToe(Speler sp) {
		sm.voegToe(sp);
	}
}