package armstrong;
/*
 * Write Java program to check if a number is Armstrong number or not? 
 * (input 153 output true,  123 output false). An Armstrong number of 3 digit is a 
 * number for which sum of cube of its digits are equal to number e.g. 371 is an Armstrong
 * number because 3*3*3 + 7*7*7 + 1*1*1 = 371). See here for sample Java program to check
 * if a number is Armstrong number or not. 
 */
import java.util.Scanner;
import java.lang.NumberFormatException;

public class CheckArmstrong {

	public static void main(String[] args) {
		try {
		// Scanner Object
		Scanner myObj = new Scanner(System.in);
		// Prompt user
		System.out.println("Please enter number to be checked if it is Armstrong Number or not");
		String str = myObj.nextLine();
		myObj.close();
		// Checking mechanism if the input is number
		int n = Integer.parseInt(str); 
		// to avoid n is unused comment as a problem in the console
		n= n+0;
		ArmSum.display(str);
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter numeric digits");;
		}

		
	}

}
