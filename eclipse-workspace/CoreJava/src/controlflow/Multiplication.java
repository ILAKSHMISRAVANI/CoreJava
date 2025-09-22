package controlflow;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 1, 2025
 * Time :3:09:11 PM
 * Project :CoreJava
 * Program to display multiplication table of a number
*/

public class Multiplication {

	public static void main(String[] args) {
		
        int num;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number : ");
        num = sc.nextInt();
        sc.close();
        
        System.out.println("Multiplication table is :");
        for(int i=1;i<=10;i++) {
        	System.out.println(num+" * "+i+" = "+num*i);
        }
	}

}
