package oopsdemo2;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 4, 2025
 * Time :10:40:36 AM
 * Project :CoreJava
 * Java program to implement Hierarchical Inheritance
 * 
 * 				Doctor
 *     Specialist	 NonSpecialist
*/

public class HierarchicalDemo1 {

	public static void main(String[] args) {
		
		//invoke child class Specialist constructor
		Specialist spObj=new Specialist(1001,"Mary","New York","Cardiologist");
		Specialist spObj1=new Specialist(1002,"Sravani","Noida","Dermatalogist");
		
		
		spObj.display(); // invoke child class Specialist display() method
		spObj1.display();
		
		//invoke child class NonSpecialist constructor
		NonSpecialist nspObj=new NonSpecialist(1005,"John","Sydney");
		
		nspObj.display();

	}

}
