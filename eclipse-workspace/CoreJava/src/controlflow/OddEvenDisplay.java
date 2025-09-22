package controlflow;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :12:51:03 PM
 * Project :CoreJava
 *  Program to display Odd & Even Numbers between 1-10
 *
 * ODD  EVEN
 * ---  ----
 * 1    2
 * 3    4
 * 5    6
 * 7    8
 * 9    10
*/

public class OddEvenDisplay {

	public static void main(String[] args) {
		
     int num=1;
     
     System.out.println("ODD\tEVEN");
     System.out.println("****\t*****");
     while (num<10) {
    	
		if (num % 2 != 0) {
			System.out.print(num+"\t");
		} 
		else {
			System.out.println(num+"\t");
		}
		num++;
		
	}
  }
}
	
