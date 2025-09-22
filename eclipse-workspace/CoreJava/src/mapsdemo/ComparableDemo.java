package mapsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 9, 2025
 * Time :4:19:35 PM
 * Project :CoreJava
*/

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> s1=new ArrayList<Student>();
		
		s1.add(new Student(111, "John", 29));
		s1.add(new Student(222, "Sravani", 8));
		s1.add(new Student(555, "Nandhusha", 26));
		s1.add(new Student(312, "Suseela", 4));
		s1.add(new Student(417, "Karthik", 30));
		
		Collections.sort(s1);
		
		for(Student s:s1) {
			System.out.println(s.getRollno()+" "+s.getName()+" "+s.getAge());
		}
		
	}

}
