package oopsdemo3;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 4, 2025
 * Time :2:36:09 PM
 * Project :CoreJava
 * Program to demonstrate Method Overloading. - Static Polymorphism
 *
 * Overload add() method with different type/no. of Arguments
*/
class Addition{
	
	public void add() {
		System.out.println("Method Overloading demo");
	}
	public void add(int a,int b) {
		System.out.println("The addition of two numbers is : "+(a+b));
	}
	public void add(double a,double b) {
		System.out.println("The addition of two float numbers is : "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("The addition of 3 numbers is : "+(a+b+c));
	}
	public void add(String s1,String s2) {
		System.out.println("The addition of two strings is : "+(s1+s2));
	}
}

public class OverLoadDemo {

	public static void main(String[] args) {
		
		Addition a1=new Addition();
		
		// Method Overloading
		a1.add();
		a1.add(30, 89);
		a1.add(71.50f, 43.90f);
		a1.add(23, 67, 200);
		a1.add("Sravani", " Indraganti");
		

	}

}
