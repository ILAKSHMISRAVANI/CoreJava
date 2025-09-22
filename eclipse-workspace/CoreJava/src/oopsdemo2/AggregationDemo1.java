package oopsdemo2;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 4, 2025
 * Time :11:53:23 AM
 * Project :CoreJava
*/

public class AggregationDemo1 {

	public static void main(String[] args) {
		
		Address ad1=new Address("Vizag", "AndhraPradesh", "India", 523271);
		Address ad2=new Address("Chennai", "TamilNadu", "India", 623001);
		
		Student st1=new Student(123, "Sravani", ad1);
		Student st2=new Student(141, "Nandhusha", ad2);
		
		st1.display();
		st2.display();
		
	}

}
