package controlflow;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :4:16:09 PM
 * Project :CoreJava
*/

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		
		int weeks=3,days=7, i=1;
		
		while (i <= weeks) {
			System.out.println("Week :"+i);
			for (int j=1;j <= days;j++) {
				System.out.println("\t"+"Day :"+j);
			}
			i+=1;
		}

	}

}
