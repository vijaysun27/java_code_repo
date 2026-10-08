package Assignments.Assignment_1;
/* Write a Java program that uses If-Else and Nested If-Else statements to determine whether a person is eligible for voting. 
 * A person is eligible to vote if their age is greater than or equal to 18. 
 * Additionally, if the age is above 18, check whether the person has valid identification to vote. Use nested If-Else to handle these conditions.
 * Clarifications:
1. Use an If-Else statement to check if the person's age is 18 or greater.
2. If the person is eligible (age >= 18), use a nested If-Else to check if they have valid identification.
3. Display appropriate messages based on the conditions (eligible, not eligible, or missing ID). 
Use hardcoded input values and check all the cases of eligible, not eligible, and missing ID !

 */

public class Vote_eligibility {
	public static void main(String[] args) {
		int age=18;
		boolean id_status=true;
		
		if(age>=18) {
			if(id_status) {
				System.out.println("Identification successful");
				System.out.println("Eligible to Vote");
			}
			else {
				System.out.println("Valid Identification Missing");
				System.out.println("Not eligible to vote");
			}
		}
		else {
			System.out.println("Not eligible to vote. Age should be 18 and above.");
		}	
	}
}
