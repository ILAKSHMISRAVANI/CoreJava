package oopsdemo1;

import java.util.Scanner;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 2, 2025
 * Time :4:11:23 PM
 * Project :CoreJava
 * Java Class to define blue print of a student
*/
// Instance Class
public class Student {
  //Attributes
  //Private variables can be accessed only within the class
  private int rollNumber;
  private String name,course;
  private float m1,m2,m3,total;
  
  Scanner sc=new Scanner(System.in);
  
  //instance methods 
  //JVM will invoke default constructor for initialization of Object
  
  public void input() {
	  System.out.println("Enter RollNo,Name,Course:");
	  rollNumber = sc.nextInt();
	  name = sc.next();
	  course = sc.next();
	  
	  System.out.println("Enter marks of 3 subjects:");
	  m1=sc.nextFloat();
	  m2=sc.nextFloat();
	  m3=sc.nextFloat();
  }
  
  public float calculate(){ // method with return type float
	  total=m1+m2+m3;
	  return total;
  }
  
  public void display()
  {
	  System.out.println("******* Student Details ***********");
	  System.out.println("Roll No        :"+rollNumber);
	  System.out.println("Name           :"+name);
	  System.out.println("Course         :"+course);
	  System.out.println("Total Marks    :"+total);
	  System.out.println("***********************************");
  }
}
