package oopsdemo4;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 6, 2025
 * Time :9:52:25 AM
 * Project :CoreJava
*/

public class Circle implements Shape{
  private double radius;

  public Circle(double radius) {
	this.radius = radius;
  }

  @Override
  public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Drawing Circle");
  }

  @Override
  public double getArea() {
	// TODO Auto-generated method stub
	return Math.PI*this.radius*this.radius;
  }

  public double getRadius() {
	return radius;
  }
  
  
  
  
  
}
