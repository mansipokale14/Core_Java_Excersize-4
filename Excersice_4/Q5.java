package Excersice_4;

import java.util.Scanner;

public class Q5 {

 public static void main(String[] args) {
		/*5. Switch Case for Meal Suggestions
 Create a program that suggests meals based on dietary preferences.
Use a switch statement to suggest:
1: "Vegetarian: Grilled Vegetable Salad"
2: "Vegan: Quinoa and Black Bean Bowl"
3: "Gluten-Free: Grilled Chicken with Rice"
4: "Keto: Zucchini Noodles with Pesto"
If the number is not between 1 and 4, print "Invalid dietary preference."*/
		
		  Scanner scanner = new Scanner(System.in);

	        // Display dietary preference options
	        System.out.println("Select your dietary preference:");
	        System.out.println("1: Vegetarian");
	        System.out.println("2: Vegan");
	        System.out.println("3: Gluten-Free");
	        System.out.println("4: Keto");
	        System.out.print("Enter the number corresponding to your preference (1-4): ");

	        // Input for dietary preference
	        int preference = scanner.nextInt();

	        // Switch-case for meal suggestions
	        switch (preference) {
	            case 1:
	                System.out.println("Vegetarian: Grilled Vegetable Salad");
	                break;
	            case 2:
	                System.out.println("Vegan: Quinoa and Black Bean Bowl");
	                break;
	            case 3:
	                System.out.println("Gluten-Free: Grilled Chicken with Rice");
	                break;
	            case 4:
	                System.out.println("Keto: Zucchini Noodles with Pesto");
	                break;
	            default:
	                System.out.println("Invalid dietary preference.");
	                break;
	        }

	        
	    }

	}


