package Excersice_4;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		/*8. Advanced Grading System
		 Create a grading system that considers attendance and participation along with the score.
		 Use a ladder if-else-if statement to assign grades based on the following criteria:
		 Score >= 90 and attendance >= 75%: Grade A
		 Score >= 80 and attendance >= 70%: Grade B
		 Score >= 70 and attendance >= 65%: Grade C
		 Score >= 60 and attendance >= 60%: Grade D
		 Otherwise: Grade F*/
		int score;
		int attendance;
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("*******  Advanced Grading System *********");
			
			 System.out.println("Enter the score (0-100): ");
		       score = sc.nextInt();

		      System.out.println("Enter the attendance percentage (0-100): ");
		         attendance = sc.nextInt();

		        // Advanced grading system with if-else-if ladder
		        if (score >= 90 && attendance >= 75)
		        {
		            System.out.println("Grade: A");
		        }
		        else if (score >= 80 && attendance >= 70)
		        {
		            System.out.println("Grade: B");
		        }
		        else if (score >= 70 && attendance >= 65)
		        {
		            System.out.println("Grade: C");
		        }
		        else if (score >= 60 && attendance >= 60)
		        {
		            System.out.println("Grade: D");
		        } 
		        else
		        {
		            System.out.println("Grade: F");
		        }
	

		
		 
	

	}

}
