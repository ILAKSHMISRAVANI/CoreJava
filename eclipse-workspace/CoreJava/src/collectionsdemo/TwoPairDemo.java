package collectionsdemo;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 9, 2025
 * Time :9:31:42 AM
 * Project :CoreJava
*/
//Testing Generic Class Pair with 2 Parameters
public class TwoPairDemo {

	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new Pair<String, Integer>("The car Guys",8);
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Our Current Rating for "+p1.getFirst() +" is : "+p1.getSecond());
		
		Pair<String,Float> p2=new Pair<String,Float>("TROY",8.5f);
		
		System.out.println("Our Current Rating for "+p1.getFirst() + " is : "+p1.getSecond());
		
		System.out.println("How would you rate them ?:");
		
		float score1 =sc.nextFloat();
		
		p2.setSecond(score1);
		

		System.out.println("Our New Rating for "+p2.getFirst() + " is : "+p2.getSecond());

	}

}
