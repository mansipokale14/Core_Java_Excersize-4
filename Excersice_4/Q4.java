package Excersice_4;

import java.util.Scanner;

public class Q4 {
	
public static void main(String[] args) {
			
	/*
	Q4. ATM with Multiple Account Types
	 	Simulate an ATM that handles different account types (savings, checking).

	a. If the account type is "savings" and the balance is less than $100, print "Minimum balance required."
	b. If the account type is "checking" and the balance is below $50, print "Low balance warning."
	c. If the account type is valid and the balance is sufficient, allow withdrawal and print the new balance.
	 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Account type (saving/checking) : ");
			String AccountType = sc.next();
			
			System.out.println("Enter Account Balence : $");
			double balence = sc.nextDouble();
			
			System.out.println("Enter withdrawal amount : $");
			double withdrawalAmount = sc.nextDouble();
			
			// process and checking the condition 
			
			if (AccountType.equals("saving"))
			{
				if(balence <= 100)
				{
					System.out.println("Minimun balance required...");
				}
				else if (balence > withdrawalAmount )
				{
					balence -= withdrawalAmount; 
					System.out.println("Withdrawal is Successfull. Remainig balence is : "+ balence);
				}
				else
				{
					System.out.println("Insuffiecient balence for withdrawal.");
				}
			}
			else if (AccountType.equals("checking"))
			{
				if(balence < 50)	
				{
					System.out.println("Your balence is low.");
				}
				else if(balence > withdrawalAmount)
				{
					balence -= withdrawalAmount;
					System.out.println("Withdrawal successfull. Remaing balence is :"+ balence);
				}
				else 
				{
					System.out.println("Insuffiecient balence for withdrawal...");
				}
			}
			else
			{
				System.out.println("Invalid account type.");
			}
				
			sc.close();
			
		}

	}


