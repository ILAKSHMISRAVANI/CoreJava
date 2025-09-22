package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 2, 2025
 * Time :10:01:26 AM
 * Project :CoreJava
 * 
 * Program to read & display Array 
*/

public class ArraysInputOutput {

	public static void main(String[] args) {
		
		int[] marks= {78,56,23,44,90,98,67,55,35,84}; //declare &initialize Array
		
		System.out.println("********** Array of Marks ************");
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+"\t");
		}
		System.out.println();
		System.out.println("The Size of Array: "+marks.length);
		System.out.println("First Element of Array is : "+marks[0]);
		System.out.println("Last Element of Array is : "+marks[marks.length-1]);
		
		//Enter values to Array at Run-time
		System.out.println("*********************************");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Total no.of Students :");
		int n=scanner.nextInt();
		
		int marks2[]=new int[n]; //declare array & allocate memory of size n
		
		System.out.println("Enter Marks2 array Element : ");
		for(int i=0;i<marks2.length;i++) {
			marks2[i]=scanner.nextInt();
		}
		
		System.out.println("********* Marks2 Array Contents ********");
		for(int i=0;i<marks2.length;i++) {
			System.out.print(marks2[i]+" ");
		}
		System.out.println();
		System.out.println("Display Marks Array without Loop");
		System.out.println(Arrays.toString(marks));
		
		scanner.close();
		

	}

}
