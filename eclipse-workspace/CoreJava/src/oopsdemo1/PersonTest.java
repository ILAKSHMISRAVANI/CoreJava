package oopsdemo1;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :2:22:31 PM
 * Project :CoreJava
*/

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person();
		p1.input();
		p1.print();
		
		System.out.println("----------------------------------");
		Person p2=new Person("Sravani",22);
		p2.print();
		
		
		System.out.println("----------------------------------");
		Person p3=new Person("Nandhusha","Hyd",13);
		p3.print();
		
		System.out.println("----------------------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur name, constituency and age : ");
		String name=s.next();
		String c=s.next();
		int a=s.nextInt();
		
		Person p4=new Person(name,c,a);
		p4.print();
		
		s.close();
	}

}
