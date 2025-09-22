package oopsdemo1;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :3:08:56 PM
 * Project :CoreJava
*/
class Test{
	public void finalize() {
		System.out.println("Object destroyed & garbage collected");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		
		// Initialize object -- invokes default constructor
		/*		Test t1=new Test();
		Test t2=new Test();
	Test t3=new Test();
//		Test t4=new Test();
//		
		t1=null; 
		//deallocate memory of objects
		t2=null;
//		t3=null;
//		t4=null;
		
//		System.gc(); //invoke service gc() method --> invoke finalize()
		
		System.out.println("In main method");*/
	}

}
