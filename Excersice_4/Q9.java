package Excersice_4;

import java.util.Scanner;

public class Q9 {
	 /*9. Nested If-Else for Discounts with Conditions
	 Write a program that calculates the discount based on the membership level and the total purchase amount.

	a. If the membership level is "Gold" and the purchase amount is over $500, apply a 25% discount.
	b. If the membership level is "Silver" and the purchase amount is over $300, apply a 15% discount.
	c. If the membership level is "Bronze", apply a 5% discount regardless of the amount.
	d. If the membership level is not recognized, print "No discount available."*/

	 
			Scanner sc = new Scanner(System.in);

	        // Input membership level and purchase amount
	        System.out.print("Enter membership level (Gold/Silver/Bronze): ");
	        String membership = sc.nextLine();

	        System.out.print("Enter total purchase amount: $");
	        double purchaseAmount = sc.nextDouble();

	        // Initialize discount
	        double discount = 0;

	        // Calculate discount using nested if-else
	        if (membership.equalsIgnoreCase("Gold")) 
	        {
	            	if (purchaseAmount > 500) {
	                discount = 0.25 * purchaseAmount; // 25% discount
	        }
	            	
	        } 
	        else if (membersrship.equalsIgnoreCase("Silver")) 
	        {
	            if (purchaseAmount > 300) 
	            {
	                discount = 0.15 * purchaseAmount; // 15% discount
	            }
	        } else if (membership.equalsIgnoreCase("Bronze")) 
	        {
	            discount = 0.05 * purchaseAmount; // 5% discount
	        } 
	        else
	        {
	            System.out.println("No discount available.");
	        }

	        // Calculate and display final amount
	        if (discount > 0) {
	            double finalAmount = purchaseAmount - discount;
	            System.out.printf("Discount: $%.2f\n", discount);
	            System.out.printf("Final amount to pay: $"+ finalAmount);
	        }

	        sc.close(); // Close scanner
	    }


}
