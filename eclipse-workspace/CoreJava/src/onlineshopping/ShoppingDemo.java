package onlineshopping;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 6, 2025
 * Time :12:08:38 PM
 * Project :CoreJava
*/

public class ShoppingDemo {
	public static void main(String[] args) {
		// Customer's Shopping Cart
        ShoppingCart cart = new ShoppingCart("Sravani");

        // Adding Products
        cart.addProduct(new Laptop("Dell XPS 15", 85000));
        cart.addProduct(new Mobile("iPhone 15", 120000));

        // Show cart
        cart.showCartDetails();

        // Apply discount
        double finalAmount = cart.applyDiscount(cart.getTotalAmount());

        //Make Payment
        cart.payOnline(finalAmount);
        
        System.out.println("*****************************");
        
        ShoppingCart cart1 = new ShoppingCart("Nandhu");
        cart1.addProduct(new Laptop("HP 15S", 90000));
        cart1.addProduct(new Mobile("MOTOROLA", 50000));
        cart1.showCartDetails();

        double finalAmount1 = cart1.applyDiscount(cart1
        		
        		.getTotalAmount());

        cart1.payOnline(finalAmount1);
    }
}

