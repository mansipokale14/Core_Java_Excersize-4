package Excersice_4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
/*
 * 10. Nested If-Else for Loan Eligibility
 Determine if a person is eligible for a loan based on their credit score and income.

a. If the credit score is above 700 and the income is above $50,000, print "Eligible for a loan.
b. "If the credit score is between 600 and 700 and the income is above $30,000, print "Conditional eligibility.
c. "If the credit score is below 600, print "Not eligible for a loan."
 */
		 Scanner sc = new Scanner(System.in);

	        // Input credit score and income
	        System.out.print("Enter your credit score: ");
	        int creditScore = sc.nextInt();

	        System.out.print("Enter your annual income: $");
	        double income = sc.nextDouble();

	        // Determine loan eligibility using nested if-else
	        if (creditScore > 700) {
	            if (income > 50000) {
	                System.out.println("Eligible for a loan.");
	            } else {
	                System.out.println("Income insufficient for loan eligibility.");
	            }
	        } else if (creditScore >= 600 && creditScore <= 700) {
	            if (income > 30000) {
	                System.out.println("Conditionally eligible for a loan.");
	            } else {
	                System.out.println("Income insufficient for conditional eligibility.");
	            }
	        } else {
	            System.out.println("Not eligible for a loan.");
	        }

	        sc.close(); // Close scanner
	    }

	}