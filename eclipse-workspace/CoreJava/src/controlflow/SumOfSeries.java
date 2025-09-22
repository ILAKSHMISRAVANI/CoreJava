package controlflow;
import java.util.*;
/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :12:39:32 PM
 * Project :CoreJava
 * Program to find Sum of Series . 1+2+3+ .....+n
*/

public class SumOfSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Value of N : ");
        n=scanner.nextInt();
        scanner.close();
        
        while (i <= n) {
			sum += i;
			i += 1;
		}
        System.out.println("The sum of series of : "+n+" is :"+sum);

	}

}
