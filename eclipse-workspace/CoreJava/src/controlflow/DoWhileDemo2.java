package controlflow;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :2:22:38 PM
 * Project :CoreJava
 * Program to enter a Positive Number & display it
 */

public class DoWhileDemo2 {

	public static void main(String[] args) {
		int i=20;

		do {
			System.out.println(i+"\t");
			i+=1;
		} while (i <= 50);
		
		System.out.println("*************** Guess Names ***********************");
		String guess;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println();
		
		do {
			System.out.println("Guess My Name : ");
			guess=scanner.next();
		} while (!"James".equals(guess));
		System.out.println("Congratulations You Guessed Name Correctly!!! " +guess);
		scanner.close();

	}

}
