package controlflow;
import java.util.*;
/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :10:04:47 AM
 * Project :CoreJava
 * Program to check entered number is even or odd.
 */

public class OddEven {

	public static void main(String[] args) {
		int num;

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = scanner.nextInt();
		scanner.close();

		if (num % 2 == 0) {
			System.out.println(num+" is a even number ");
		} else {
			System.out.println(num+" is an odd number ");
		}

	}

}
