package controlflow;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Aug 30, 2025
 * Time :9:34:14 AM
 * Project :CoreJava
 * 
 * This program calculates the sum and average of a set of numbers using Scanner input.
 */

public class SumAverage {

	public static void main(String[] args) {

		int number1,number2,number3,sum;
		float avg;

		Scanner scanner=new Scanner(System.in);

	
		//Take inputs from user
		System.out.println("Enter 3 Numbers : ");
		number1=scanner.nextInt();
		number2=scanner.nextInt();
		number3=scanner.nextInt();

		if ((number1 > 100) && (number2 > 100) && (number3 > 100)) {
			// To Perform sum and average
			sum=number1+number2+number3;
			avg=(float)sum/3;

			// Printing the sum and average
			System.out.println("*******************************************");
			System.out.println("The sum of 3 Numbers is : "+ sum);
			System.out.println("The Average of 3 Numbers is : "+ avg);
			System.out.println("The Average of 3 Numbers is : "+String.format("%.2f", avg));
			System.out.println("*******************************************");
		}else {
			System.out.println("Please Enter Numbers Greater than 100");
		}
		scanner.close();



	}
}
