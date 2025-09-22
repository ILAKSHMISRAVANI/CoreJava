package controlflow;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :10:09:58 AM
 * Project :CoreJava
 * Program to check entered number is single digit or not.
*/

public class SingleDigit {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		num = scanner.nextInt();
		scanner.close();
		
		if (num < 10 && num > -10) {
			System.out.println(num+" is a single digit");
		} else {
            System.out.println(num+" is not a single digit");
		}

	}

}
