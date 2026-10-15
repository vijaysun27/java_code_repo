package Assignments.Assignment_2;

/*
 * Question 1:
Write a Java program to demonstrate the usage of return types and arguments. 
Create a method that takes two integers as arguments and returns their sum. 
Then, call this method from the main method and display the result.
Clarifications:
1. Define a method that takes two integer arguments and returns their sum.
2. In the main method, call the method with appropriate arguments and display the returned result.
3. Ensure the correct return type and arguments are used for the method.

Expected Output:
Sum of 5 and 10: 15

 */

public class math_operation {
	public static void main(String[] args) {
		
		int sum_of_integers = arithmetic_operations.sum_operation(5,10);
		System.out.println("Sum of Two integers is "+sum_of_integers);
	}

}
