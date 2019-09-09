/**
 * 
 * @author Rashaun Buchanan
 *
 */
import java.util.Scanner;
public class MathProgram {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out("Enter two int values");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int result = num1 + num2;
	Scanner.out.print(result);
	
	System.out("Enter three int values");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int result = num1 + num2 + num3;
	Scanner.out.print(result);
	
	System.out("Enter four int values");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();
	int result = num1 * num2 * num3 * num4;
	Scanner.out.print(result);
	
	}}