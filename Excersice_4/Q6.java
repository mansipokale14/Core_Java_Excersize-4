package Excersice_4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input: Account balance and withdrawal amount
        System.out.print("Enter account balance: $");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = sc.nextDouble();

        // Check if balance is less than withdrawal amount
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            // Check if withdrawal amount is greater than $1000
            if (withdrawalAmount > 1000) {
                System.out.println("A transaction fee of $10 will be applied.");
                withdrawalAmount += 10; // Add transaction fee
            } else {
                System.out.println("No transaction fee.");
            }

            // Deduct withdrawal amount from balance
            balance -= withdrawalAmount;
            System.out.printf("Withdrawal successful. New balance: $%.2f\n", balance);

            // Check if balance is less than $100 after withdrawal
            if (balance < 100) {
                System.out.println("Warning: Low balance.");
            }
        }

        sc.close(); // Close scanner
	}


	}


