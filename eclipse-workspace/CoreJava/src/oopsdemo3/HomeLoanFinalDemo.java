package oopsdemo3;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 5, 2025
 * Time :12:10:11 PM
 * Project :CoreJava
*/

public class HomeLoanFinalDemo {

	public static void main(String[] args) {
		
		//Using RBI rules
		RBI rbi = new RBI();
		rbi.showRBIGuidelines();
		
		// Creating customer home loans
		HomeLoan loan1 = new HomeLoan("Nandhu",300000,10000);
		HomeLoan loan2 = new HomeLoan("Sravani",500000,20000);
		
		loan1.showLoanDetails();
		System.out.println("-------------");
		loan2.showLoanDetails();
		
		// ❌ ERROR if you try to modify final variable
        // RBI.MIN_HOME_LOAN_RATE = 7.0;  // Not allowed
        // loan1.PROCESSING_FEE = 20000;  // Not allowed
		                      

	}

}
