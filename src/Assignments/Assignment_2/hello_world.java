package Assignments.Assignment_2;

/*
 * Explain the concept of 'public static void main' in Java. 
 * Write a program that demonstrates the execution of a simple 'public static void main' method, and explain its components: 'public', 'static', 'void', and 'main'.
Clarifications:
1. Define the 'public static void main' method in your program.
2. Explain the purpose of 'public', 'static', 'void', and 'main' in the method declaration.
3. Implement a simple program that outputs 'Hello, World!' using the main method.

 */

public class hello_world {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}

// public - Access Modifier, it allows a method can be accessed by any class
// static - Allows the method to be invoked without creating an object
// void - Its a return type which indicates the method does not return a value
// main - Its a method name, a method name is an entry point to execute the method
