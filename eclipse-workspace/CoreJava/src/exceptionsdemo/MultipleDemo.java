package exceptionsdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 6, 2025
 * Time :2:55:31 PM
 * Project :CoreJava
*/
// Java Program to demonstrate multiple catch blocks 
public class MultipleDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int a, b, c;
		try
		{
			System.out.println ("Enter Any 2 Numbers");
			a = Integer.parseInt (br.readLine ());
			b = Integer.parseInt (br.readLine ());
			System.out.println("Enter your Name : ");
			String name=br.readLine();
			
			c = a / b;
			
			System.out.println ("C VALUE = " + c);
			System.out.println("Thank You "+name);
		
	}
		catch(NumberFormatException nfe) {
			System.out.println("Please pass only Integer values "+nfe);
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Please donot pass the second value as 0 "+ae);
		}
		finally {
			br.close();
			System.out.println("Inside Finally Block");
		}
		
		System.out.println("End of Main Method");	
	}

}
