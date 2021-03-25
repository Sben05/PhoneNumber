/**
 * 
 * @author Shreeniket Bendre
 * Project: PhoneNumber
 * File: PhoneNumberMain.java
 *
 */

import java.util.Scanner;

public class PhoneNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String usersName = scan.nextLine();
		
		System.out.print("Enter your phone number in the format xxxxxxxxxx: ");
		String usersNumber = scan.nextLine();
		
		String formattedNumber = ("("+usersNumber.substring(0, 3)+") "+ usersNumber.substring(3, 6)+"-"+usersNumber.substring(6));
		
		
		System.out.printf("%-20s%s", usersName, formattedNumber);
		
	}

}
