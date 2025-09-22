package oopsdemo2;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 4, 2025
 * Time :9:58:19 AM
 * Project :CoreJava
*/

public class Multilevel1 {  // Multilevel Inheritance

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Account Details of Customer(Cust No,Name, Balance):");
		int custNo=scanner.nextInt();
		scanner.nextLine();
		String name=scanner.nextLine();
		int balance=scanner.nextInt();
		final int MIN_BAL=1000;
		System.out.println("Enter Amount to Deposit:");
		int deposit=scanner.nextInt();
		System.out.println("Enter Amount to Withdraw:");
		int withdraw=scanner.nextInt();
		
		AccountDetails ac1=new AccountDetails(custNo,name,MIN_BAL,balance,withdraw,deposit);
		
		ac1.display();
		scanner.close();

	}

}
