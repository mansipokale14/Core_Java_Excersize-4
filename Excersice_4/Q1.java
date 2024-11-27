package Excersice_4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/* 1. Nested If-Else for Travel Budget
		 Determine travel options based on budget and destination.

		 a. If the budget is above $3000 and the destination is "Europe", print "Book a luxury package.
		 b. If the budget is between $1500 and $3000 and the destination is "Asia", print "Consider a mid-range package."
		 c. If the budget is below $1500, print "Look for budget-friendly option*/
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Input for budget
		        System.out.print("Enter your travel budget in USD: ");
		        double budget = scanner.nextDouble();

		     
		        scanner.nextLine();

		        // Input for destination
		        System.out.print("Enter your travel destination: ");
		        String destination = scanner.nextLine();

		        // Nested If-Else for Travel Budget
		        if (budget > 3000) {
		            if (destination.equalsIgnoreCase("Europe")) { // Nested condition
		                System.out.println("Book a luxury package.");
		            } else {
		                System.out.println("Your budget is high. Consider luxury options elsewhere.");
		            }
		        } else if (budget >= 1500) {
		            if (destination.equalsIgnoreCase("Asia")) { // Nested condition
		                System.out.println("Consider a mid-range package.");
		            } else {
		                System.out.println("Explore mid-range packages for other destinations.");
		            }
		        } else { // budget < 1500
		            System.out.println("Look for budget-friendly options.");
		        }

		        scanner.close();
		    }
		

		
		
				 
				 
			 
		


	

}
