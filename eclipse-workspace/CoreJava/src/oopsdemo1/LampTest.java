package oopsdemo1;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :10:33:06 AM
 * Project :CoreJava
 * 
 *Java Program to implement instance class & main class in a Single file
*/

//Instance Class
class Lamp
{
	//stores the value for light
	// true if light is on
	// false if light is off 
	boolean isOn;
	
	//method to turn On the light
	void turnOn()
	{
		isOn = true;
		System.out.println("Light On? "+isOn);
	}
	
	//method to turn Off the light
	void turnOff()
	{
		isOn = false;
		System.out.println("Light On? "+isOn);
	}
}
public class LampTest {

	public static void main(String[] args) {
		
		// create object led & halogen
		Lamp led=new Lamp();
		Lamp halogen = new Lamp();
		
		//switch on led & halogen
		led.turnOn();
		halogen.turnOn();
		
		//Switch off led & halogen
		led.turnOff();
		halogen.turnOff();

	}

}
