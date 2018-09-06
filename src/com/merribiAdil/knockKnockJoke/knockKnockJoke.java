package com.merribiAdil.knockKnockJoke;

import java.util.Scanner;
import static org.junit.Assert.*;



public class knockKnockJoke {

	public static void main(String[] args) {
		
		String responce;
		
		// Create Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Ask the user if he want to hear a knock knock joke
		System.out.println("Would you like to hear a knock knock joke");
		
		//Wait for string input
		String answer = scanner.nextLine();
		
		//is the string 'yes' or 'no'  
		if (answer.equalsIgnoreCase("yes")) {
			
			System.out.println("Knock Knock.");
			
			String userReply1 = scanner.nextLine();
			
			if (userReply1.equalsIgnoreCase("who's there?")) {
				
				System.out.println("Spell.");
				
				String userReply2 = scanner.nextLine();
				
				if (userReply2.equalsIgnoreCase("Spell who?")) {
					System.out.println("Okay, okay: W. H. O.");
				}
			}
			else {
				System.out.println("you should reply with 'who's there?'");
			}
			
			
		}
		else if (answer.equalsIgnoreCase("no")) { 
			
             System.out.println("Ok");
		
		
	}
		else {
			System.out.println("Please answer with a 'yes' or 'no'.");
		}
		
		scanner.close();
		
	}
}


