package arraysdemo;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 2, 2025
 * Time :9:40:02 AM
 * Project :CoreJava
*/

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		String array[]= {"Ron","Harry","Hermonie","Sravani","Suseela","Nandusha"};
		
		//Enhanced for loop
		System.out.println("Enhanced for loop:");
		for(String a:array) {
			System.out.println(a);
		}
		
		
		System.out.println();
		
		//for loop
		System.out.println("Normal for loop:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}

	}

}
