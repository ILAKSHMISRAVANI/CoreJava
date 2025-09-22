package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author :Indraganti.Sravani
 * Date :Aug 30, 2025
 * Time :11:26:01 AM
 * Project :CoreJava
 * Java Program to perform aArithmetic operations using BufferedReader Input.
*/

public class Arithmetic {

	public static void main(String[] args) throws IOException{
		
		// Declaration of variables
		int a, b, sum, sub, mul;
		float div;
		String name;
		
		// Taking the inputs through BufferedReader Class
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 2 Numbers :");
		a = Integer.parseInt(bufferedReader.readLine());
		b = Integer.parseInt(bufferedReader.readLine());
		
		name = bufferedReader.readLine();
		
		// Arithmetic Operations
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = (float)a / b;
		
		// Printing the results
        System.out.println("The results of user "+name);
        System.out.println("-------------------------------");
		System.out.println("Sum of 2 Numbers is : "+sum);
		System.out.println("Difference of 2 Numbers is "+sub);
		System.out.println("Product of 2 Numbers is "+mul);
		System.out.println("Division of 2 Numbers is "+div);
	    System.out.println("-------------------------------");
		
	}

}
