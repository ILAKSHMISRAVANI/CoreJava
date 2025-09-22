package collectionsdemo.banking;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 8, 2025
 * Time :4:37:42 PM
 * Project :CoreJava
*/

// Utility class with Generic Method
public class BankingUtil {
     
	// Generic method to print any type of transaction
    public static <T> void printTransaction(T transaction) {
        System.out.println("Transaction: " + transaction);
    }
	
}
