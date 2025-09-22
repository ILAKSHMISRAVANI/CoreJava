package oopsdemo3;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 5, 2025
 * Time :11:31:00 AM
 * Project :CoreJava
*/
class Count{
	private static int cnt; //static variable
	private int a; //instance variable
	Count() {
		cnt++;
		a=100;
	}
	// static method - It can use only static variables
	public static void display() {
		System.out.println("The Number of Objects Created : "+cnt);
		// a=a+10;
	}
	public void print(){
        System.out.println("Instance Method Variable : "+a);
    }	
}

public class StaticDemo {
	public static void main(String[] args) {
		Count c1 =new Count();	
		Count c2 =new Count();	
		Count c3 =new Count();	
		Count c4 =new Count();	
		
		c1.print(); // Invokes Instance methods
		
		Count.display(); //Invokes Static Methods
	}
}
