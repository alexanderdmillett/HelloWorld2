package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hello {

	public static void main(String[] args) {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
	    Date dateobj = new Date();
	    
	    System.out.println("Current Date is " + dateobj);
	    System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
		System.out.println("Here ye : important announcement.");
		System.out.println("Hello World");
		System.out.println("Hi Alice!");
		System.out.println("Hi Bob!");
		System.out.println("Hi Charlie!");
		System.out.println("Hi Denise!");
		System.out.println("Hi Ester!");
		System.out.println("See you all in the future! Goodbye.");
	}

}
