package controlflow;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :4:08:15 PM
 * Project :CoreJava
*/

public class NestedLoopDemo1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}

	}

}
