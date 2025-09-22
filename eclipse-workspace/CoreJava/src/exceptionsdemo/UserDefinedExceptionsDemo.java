package exceptionsdemo;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 8, 2025
 * Time :9:56:50 AM
 * Project :CoreJava
 */

public class UserDefinedExceptionsDemo {

	public static void main(String[] args) {
		CheckingAccount c1=new CheckingAccount(123478890);
		c1.deposit(20000);
		System.out.println("Deposited Successfully "+c1.getBalance());
		try {

			c1.withdraw(25000);
			System.out.println("Withdraw done successfully!!!! with avail balance is "+c1.getBalance());

		}
		catch(InSufficientFundsException e){
			System.out.println("Insufficient balance in the checking account !!! Retry with enough balance");
			e.printStackTrace();
		}

	}
}
