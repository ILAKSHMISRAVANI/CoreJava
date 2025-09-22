package exceptionsdemo;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 8, 2025
 * Time :9:46:07 AM
 * Project :CoreJava
*/

// User defined Exception
public class InSufficientFundsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	

}
