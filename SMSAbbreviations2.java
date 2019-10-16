/**
 * 
 * @author Rashaun Buchanan
 *  
 **/
import java.util.Scanner;
public class SMSAbbreviations2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abreviation");
		String abbreviation = scnr.nextLine();
		
		if (abbreviation.equals("LOL")) {
				String translation = "Laughing Out Loud";
				System.out.println(abbreviation + " means " + translation);
		}
		else if(abbreviation.equals("TTYL"))
		{
			String translation = "Talk To You Later";
			System.out.println(abbreviation + " means " + translation);
		}
		else if(abbreviation.equals("IDC"))
		{
			String translation = "I Dont Care";
			System.out.println(abbreviation + " means " + translation);
		}
		else if(abbreviation.equals("GMT"))
		{
			String translation = "Get Me Tight";
			System.out.println(abbreviation + " means " + translation);
		}
		else
		System.out.println("Unknown Abreviation"); 
		return;
	
	}
}

