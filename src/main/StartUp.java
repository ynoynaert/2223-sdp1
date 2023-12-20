package main;

import cui.SplendorApp;
import domein.DomeinController;

public class StartUp {

	public static void main(String[] args) {
		DomeinController dc = new DomeinController();
		SplendorApp apl= new SplendorApp(dc);
		apl.start();
	}
}