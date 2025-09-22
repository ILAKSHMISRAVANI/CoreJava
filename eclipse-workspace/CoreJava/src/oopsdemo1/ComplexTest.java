package oopsdemo1;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :12:31:05 PM
 * Project :CoreJava
*/

public class ComplexTest {

	public static void main(String[] args) {
		
		Complex c1=new Complex(10.3, 67.4);
		Complex c2=new Complex(0.7, 3.6);
		Complex c3=new Complex(1.0, 1.0);
		
		c1.add(c2);
		System.out.println("The addition of two complex numbers is : ");
		c1.display();
		
		c1.add(c3);
		System.out.println("The addition of two complex numbers is : ");
		c1.display();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter real and Imaginary part of complex number : ");
		double r=sc.nextDouble();
		double i=sc.nextDouble();
		
		Complex c4=new Complex(r, i);
		
		c2.add(c4);
		System.out.println("The addition of two complex numbers is : ");
		c2.display();
		
		sc.close();
		
		
	}

}
