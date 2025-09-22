package oopsdemo3;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 5, 2025
 * Time :9:47:53 AM
 * Project :CoreJava
*/

public class UpCastingDemo {

	public static void main(String[] args) {
		Product product;
		
		// Product obj refers to Book object
		product = new Book ("Electronics",500,"Nandhu");//Upcasting
		System.out.println("---------- Book Details -----------");
		product.display();
		
		 //Switching from one implementation to another is easy
        product=new Laptop("IdeaPad",60000.00,"Lenova"); //Upcasting
        System.out.println("------------- Laptop Details --------------");
        product.display();//Dynamic Binding

        product =new Book("Python Made Easy",650,"Balaguruswamy"); //Upcasting
        System.out.println("------------- Book Details --------------");
        product.display(); //Dynamic Binding
        
        //Access default variable from Test class
        Test t1=new Test(100,200,45,600);
        Test2 t2=new Test2(200,400,65,650);
        System.out.println("Default variable form Test Class : "+t1.a);
        t2.print(); //Invoke Default method of Test2 class
	}
}
