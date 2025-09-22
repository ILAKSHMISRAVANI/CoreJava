package onlineshopping;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 6, 2025
 * Time :11:59:55 AM
 * Project :CoreJava
*/

public abstract class Product {
	    protected String productName;
	    protected double price;
	    

		public Product(String productName, double price) {
			this.productName = productName;
			this.price = price;
		}
		
		public abstract void showProductDetails();
}
	    
	 
