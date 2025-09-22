package controlflow;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :10:22:06 AM
 * Project :CoreJava
 * Program to find the greatest of 3 Numbers.
*/

public class Greatest3 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 3 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
        scanner.close();
        
        if (num1 > num2 && num1 > num3) {
			System.out.println(num1+" is the greatest ");
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+" is the greatest ");
		}else if (num2 == num1 && num2 == num3) {
			System.out.println(" All are equal ");
		}else {
			System.out.println(num3+" is the greatest ");
		}
	}

}
