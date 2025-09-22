package controlflow;
import java.util.*;
/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :3:00:37 PM
 * Project :CoreJava
 * Program to find factorial of a number.
 */

public class Factorial {

	public static void main(String[] args) {
		int num, fact=1;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a Number : ");
		num=scanner.nextInt();
		scanner.close();

		for (int i = 1; i <=num; i++) {
			fact*=i;
		}
		System.out.println("The Factorial of "+num+" is: "+fact);

	}

}
