package onlineshopping;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 6, 2025
 * Time :12:01:44 PM
 * Project :CoreJava
*/

public class Laptop extends Product {
	
	public Laptop(String productName, double price) {
        super(productName, price);
    }

	@Override
	public void showProductDetails() {
		// TODO Auto-generated method stub
		System.out.println("Laptop: " + productName + " | Price: ₹" + price);
	}
}
