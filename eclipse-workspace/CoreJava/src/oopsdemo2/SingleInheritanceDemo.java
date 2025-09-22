package oopsdemo2;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :4:30:20 PM
 * Project :CoreJava
*/

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Developer d1=new Developer(101, "Sravani","JavaFullStack", "BankingSystem");
		Developer d2=new Developer(102, "Poojitha","UnitTesting", "Medical");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1=new Employee(105, "Tony");
		e1.display();


	}

}
