package controlflow;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :12:27:05 PM
 * Project :CoreJava
 * Program to display ur name 10 times & nos from 1-10
*/

public class WhileDemo {

	public static void main(String[] args) {
		
		int i=1;
		
	    while (i <= 10) {
			System.out.println(i+".James");
			i+=1;
		}
	    System.out.println("Exit loop");
	    
	    System.out.println("******************Reverse loop********************");
	    int j=10;
	    while (j > 0) {
				System.out.println(j+"\t");
				j-=1;
		}

	}

}
