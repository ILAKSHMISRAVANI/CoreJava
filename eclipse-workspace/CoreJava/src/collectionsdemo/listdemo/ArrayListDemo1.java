package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 9, 2025
 * Time :10:21:12 AM
 * Project :CoreJava
*/
// Java program to manipulate data in collection

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//Create a Generic ArrayList of string
		ArrayList<String> arr=new ArrayList<>();
		
		//Add elements to array list
		arr.add("java");
		arr.add("Perl");
		arr.add("C++");
		arr.add("C# 5.0");
		arr.add("java");
		arr.add("Python");
		
		//Display the array list
		System.out.println("Programming Languages ArrayList : "+arr);
		
		//Access elements using get method
		System.out.println("Element at Index 1 :"+arr.get(1));
		System.out.println("Does ArrayList contains element Java ? :"+arr.contains("Java"));
		
		//Add elements at specific index
		arr.add(2,"Oracle");
		System.out.println("Prgramming Languages ArrayList : "+arr);
		
		// Manipulations
		System.out.println("Is ArrayList Empty ? : "+arr.isEmpty());
		System.out.println("The position of python is : "+arr.indexOf("Python"));
		System.out.println("The size of ArrayList is :"+arr.size());
		
		//Create ArrayList to store marks
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(89);
		marks.add(45);
		marks.add(68);
		marks.add(94);
		marks.add(95);
		
		// marks.add("Hello"); //Compiler Error - Type Safety

        System.out.println("The Marks ArrayList is :"+marks);
        System.out.println("The Size of Marks ArrayList is : "+marks.size());
        System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

        Collections.sort(marks);
        System.out.println("Marks ArrayList after Sorting :"+marks);
		
	}
}
