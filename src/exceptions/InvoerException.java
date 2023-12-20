package exceptions;

public class InvoerException extends RuntimeException{

		public InvoerException() {
		super("foute invoer");
		  //this kan hier ook 
		}
		public InvoerException(String message) {
			super(message);
		}
		public InvoerException(Throwable cause) {
			super(cause);
		}
		public InvoerException(String message, Throwable cause) {
			super(message,cause);
		}
}