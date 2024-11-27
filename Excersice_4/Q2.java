package Excersice_4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*2. Nested If-Else for Job Offer Evaluation
 Evaluate a job offer based on salary and benefits.

a. If the salary is above $80,000 and benefits include health insurance, print "Accept the offer."
b. If the salary is between $60,000 and $80,000, print "Consider negotiating."
c. If the salary is below $60,000, print "Decline the offer."*/
		

		Scanner sc = new Scanner(System.in);

        // Input: salary and health insurance benefit
        System.out.print("Enter the offered salary: $");    // entering the offered salary 
        double salary = sc.nextDouble();
        
        System.out.print("Does the offer include health insurance? (true/false): "); 	// checking it include health insurance is available or not 
        boolean HealthInsurance = sc.nextBoolean();		// Output is either true or false thats why we choose boolean here 

        // Evaluate the job offer
        if (salary > 80000) {
            if (HealthInsurance) {
                System.out.println("Accept the offer.");
            } else {
                System.out.println("Consider negotiating for better benefits.");
            }
        } else if (salary >= 60000) {
            System.out.println("Consider negotiating.");
        } else {
            System.out.println("Decline the offer.");
        }

        sc.close(); // Close the scanner
		
		

	}

}
