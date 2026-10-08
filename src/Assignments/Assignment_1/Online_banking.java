package Assignments.Assignment_1;
/*
 * Question 1:
Write a Java program that demonstrates the use of variables and data types. 
The program should use variables of different data types (int, double, char, boolean, String) 
and perform basic operations such as addition, subtraction, multiplication, and string concatenation.
Clarifications:
1. Declare variables of different data types (e.g., int, double, char, boolean, String).
2. Perform basic arithmetic operations using numeric data types (int and double).
3. Concatenate strings using the String variable and display the result.
4. Display the results of all operations.

 */

public class Online_banking {
	public static void main(String[] args) {
		int pin = 1234;
		double deposit = 12445.44*3;
		double balance = 20000.32;
		int withdrawal = 11000;
		char initial = 'A';
		String name = "John";
		boolean accountStatus = true;
		
		if(pin==1234) {
			if (accountStatus) {
				System.out.println("Hello "+initial+". "+name+", "+"Your Account status is active.");
				System.out.println("Your account balance: "+(deposit+balance-withdrawal));
			}
			else {
				System.out.println("Hello "+initial+". "+name+", "+"Your Account status is in-active.");
				System.out.println("Please contact your bank to activate.");
			}
		}		
		else{
			System.out.println("Invalid Pin");
		}		
	}

}
