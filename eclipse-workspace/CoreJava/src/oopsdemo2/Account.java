package oopsdemo2;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 4, 2025
 * Time :9:48:35 AM
 * Project :CoreJava
 * Multilevel Inheritance
 */

public class Account {

	int accNo;
	String name;

	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}

	void display()
	{
		System.out.println("************ Account Details ************");
		System.out.println("Account Number :"+accNo);
		System.out.println("Customer Name :"+name);
	}

}
