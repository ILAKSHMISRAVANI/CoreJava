package controlflow;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :9:37:03 AM
 * Project :CoreJava
 * Program to find the greatest of two numbers
 */
public class Greatest2 {

	public static void main(String[] args) {
		int a,b;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 2 Numbers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();

		if (a > b) {
			System.out.println(a+" is Greatest ");
		} else {
			System.out.println(b+" is Greatest ");
		}

	}

}
