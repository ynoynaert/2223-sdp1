package util;

public enum EdelsteenSoort {
	SMARAGD,
	DIAMANT,
	SAFFIER,
	ONYX,
	ROBIJN;
	
	public String toString() {
		String resultaat = this.name();
		resultaat=resultaat.toLowerCase();
		
		return resultaat;
	}
}