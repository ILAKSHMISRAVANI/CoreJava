package basics;
/**
 * This program calculates the area of a circle.
 * It demonstrates the use of variables, arithmetic operations,
 * and console output in Java.
 * @version 1.0
 */
public class Area {

	public static void main(String[] args) {
      
		double radius = 7.5;  // Radius of a circle
		double area;  // Variable to store the area
		final double PI = 3.14159; // Constant value for Pi
		
		// Calculate the area of the circle
		area = PI * radius * radius;
		
		// Print the area to the console
		System.out.println("The area of the circle with radius " + radius +" is: " + area);
		

	}

}
