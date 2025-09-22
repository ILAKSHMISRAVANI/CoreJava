package collectionsdemo;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 8, 2025
 * Time :4:02:41 PM
 * Project :CoreJava
*/

public class GenericClassDemo {
    
	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<String>("Java Generics");
		
		System.out.println("Display from Generic class by passing String Object "+s1.getData());
		
		Sample<Integer> s2=new Sample<Integer>(200);
		
		System.out.println("Display from Generic class by passing Integer Object "+s2.getData());
		
		Sample<Double> s3=new Sample<Double>(555.50);
		
		System.out.println("Display from Generic class by passing Double Object "+s3.getData());
	}
}
