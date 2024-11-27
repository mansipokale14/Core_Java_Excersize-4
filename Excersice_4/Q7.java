7package Excersice_4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/*
7. Switch Case for Days and Activities
 Create a program that suggests an activity based on the day of the week.
Use a switch statement to suggest:
1: "Go to work"
2: "Attend a meeting"
3: "Work from home"
4: "Go to the gym"
5: "Have a family dinner"
6: "Relax and watch a movie"
7: "Prepare for the upcoming week"
If the number is not between 1 and 7, print "Invalid day."*/
		
		 Scanner scanner = new Scanner(System.in);

	        // Display days of the week options
	        System.out.println("Enter the number corresponding to the day of the week:");
	        System.out.println("1: Monday");
	        System.out.println("2: Tuesday");
	        System.out.println("3: Wednesday");
	        System.out.println("4: Thursday");
	        System.out.println("5: Friday");
	        System.out.println("6: Saturday");
	        System.out.println("7: Sunday");

	        // Input for day of the week
	        System.out.print("Enter the number (1-7): ");
	        int day = scanner.nextInt();

	        // Switch-case for activity suggestion
	        switch (day) {
	            case 1:
	                System.out.println("Go to work.");
	                break;
	            case 2:
	                System.out.println("Attend a meeting.");
	                break;
	            case 3:
	                System.out.println("Work from home.");
	                break;
	            case 4:
	                System.out.println("Go to the gym.");
	                break;
	            case 5:
	                System.out.println("Have a family dinner.");
	                break;
	            case 6:
	                System.out.println("Relax and watch a movie.");
	                break;
	            case 7:
	                System.out.println("Prepare for the upcoming week.");
	                break;
	            default:
	                System.out.println("Invalid day.");
	                break;
	        }

	        
	   
	}

}
