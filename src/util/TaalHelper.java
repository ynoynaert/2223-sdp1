package util;

import java.util.Locale;
import java.util.ResourceBundle;

public class TaalHelper {

	private static Locale taal;
	private static ResourceBundle rb;
	
	public TaalHelper(String taal) {
		TaalHelper.taal=new Locale(taal);
    	rb = ResourceBundle.getBundle("languages.Messages",TaalHelper.taal);
	}
	
	public static String getText(String key) {
		return rb.getString(key);
	}
}
