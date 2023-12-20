package domein;

import util.EdelsteenSoort;

public class EdelsteenAantal {
	private int aantal;
	private final EdelsteenSoort soort;
	
	public EdelsteenAantal(int aantal, EdelsteenSoort soort) {
		setAantal(aantal);
		this.soort = soort;
	}
	
	public int getAantal() {
		return aantal;
	}
	
	public EdelsteenSoort getSoort() {
		return soort;
	}
	
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
}