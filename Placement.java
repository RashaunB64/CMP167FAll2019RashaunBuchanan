/*
 * Rashaun Buchanan
 */
import java.util.Scanner;
public class Placement {
public static void main(String[] args) {
	String str = "Peace and Education for All!";
	int lengthSTR = str.length();
	int distance = str.indexOf("Education");
	System.out.println("String str has " + lengthSTR + " characters");
	System.out.println(distance);
	System.out.println(str.substring(10, 19));
	String str2= str.replace("and", "Justice and");
	System.out.println(str2);
	System.out.println(str = str + " Now!!!");
}

}
