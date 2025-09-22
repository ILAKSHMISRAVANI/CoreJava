package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author :Indraganti.Sravani
 * Date :Aug 30, 2025
 * Time :10:35:24 AM
 * Project :CoreJava
 * Java Program to specify employee details by run time using BufferedReader Class.
 */

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException{ // To handle runtime errors

		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

		// Read the values from user
		System.out.println("Enter Your Name :");
		String name=bufferedReader.readLine();
		System.out.println("Enter your age :");
		int age=Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter Your Salary :");
		float salary=Float.parseFloat(bufferedReader.readLine());

		// Print the result
		System.out.println("Welcome "+name+", your age is :"+age+" and salary worth "+salary);


	}

}
