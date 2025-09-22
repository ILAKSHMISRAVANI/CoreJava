package oopsdemo1;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :12:14:36 PM
 * Project :CoreJava
*/

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Candidate cd1=new Candidate(101,"James",5000.00f);
		
		Candidate cd2 = new Candidate(102, "Sravani", 6000.00f);
		
		cd1.calculateDA();
		cd1.display();
		
		cd2.calculateDA();
		cd2.display();
	}

}
