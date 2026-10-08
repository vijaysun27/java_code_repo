package Assignments.Assignment_1;

/* Write a Java program that creates an array of integers and performs the following operations: 
 - Assign values to the array
- Find the sum and average of the array elements
- Find the largest and smallest element in the array
*/

public class Array_operations {
	public static void main(String[] args) {
		int numbers[] = new int[6];
		int sum=0;
		double average=0;
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]= (i+1)*10;
		}
		int largest_num = numbers[0];
		int smallest_num = numbers[0];
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
			average = sum/numbers.length;
			if(numbers[i]>largest_num) {
				largest_num=numbers[i];
			}
			if(numbers[i]<smallest_num) {
				smallest_num=numbers[i];
			}
		}
		System.out.println("Sum of the integers in the array is "+sum);
		System.out.println("Average of the integers in the array is "+average);
		System.out.println("Largest number in the array is "+largest_num);
		System.out.println("Smallest number in the array is "+smallest_num);
		
		
	}

}
