package oopsdemo1;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :12:42:53 PM
 * Project :CoreJava
 * Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented by 1 & sec -60,,
 *   if min> 60  ... hrs should be incremented by 1 & min -60
*/

public class Time {
	
	private int hrs,min,sec;

	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	
	public void addTime(int hrs, int min, int sec) {
		
		this.hrs += hrs;
		this.min += min;
		this.sec += sec;
		
		if(this.sec > 60) {
			this.sec -= 60;
			this.min += 1;
		}
		if(this.min > 60){
			this.min -= 60;
			this.hrs += 1;
		}
		System.out.println("Time for time 1 is : "+hrs+" : "+min+" : "+sec);
		System.out.println("Time for time 2 is : "+this.hrs+" : "+this.min+" : "+this.sec);
	}
	
	public void display() {
		System.out.println("The resultant of times are : ");
		System.out.println(hrs+" : "+min +" : "+sec);
	}
}
