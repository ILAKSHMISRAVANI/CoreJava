package oopsdemo3;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 5, 2025
 * Time :11:54:49 AM
 * Project :CoreJava
 */
/*
Final Variable - Variable’s content cannot be modified
Final Method - A final method cannot be overridden. 
Final Class - Cannot extend a Final class
 */

class Hello
{
	final void display()
	{
		System.out.println("This is a final Method");
	}
}

/*class World extends Hello {
	final void display()
	{
		System.out.println("This is a final Method");
	}
}
*/
public class FinalDemo {

	public static void main(String[] args) {
		final int AGE=20;
		final float PI=3.142f;
		
		//AGE =30; // Compilation error - final variable cannot be changed
	}

}
