/*
 * Rashaun Buchanan
 */
import java.util.Scanner;
public class Names {
	private static Scanner scnr;

	public static void main(String[] args) {
		scnr = new Scanner(System.in);
	    String Name;
		String Petname;
		System.out.println("What is your name and the name of your favorite pet");
		Name = scnr.next();
		Petname = scnr.next();
		int lengthname = Petname.length();
		System.out.println( Name + ", " + Petname + " has " + lengthname + " characters");
		
		
}
}
