package onlineshopping;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 6, 2025
 * Time :12:05:39 PM
 * Project :CoreJava
*/

public interface OnlinePayment {
	void payOnline(double amount);
}

interface Discount {
    double applyDiscount(double amount);
}
