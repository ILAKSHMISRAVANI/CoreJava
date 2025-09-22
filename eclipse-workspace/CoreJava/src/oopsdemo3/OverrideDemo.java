package oopsdemo3;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 4, 2025
 * Time :3:15:25 PM
 * Project :CoreJava
 * Overriding is a feature that allows a subclass or
 * child class to provide a specific implementation of a method
 * that is already provided by one of its super-classes or parent classes.
 */
class Bank{

	private String name;

	public Bank(String name) {
		this.name = name;
	}

	int getRateOfInterest(){
		return 0;
	}
	
	void display(){
		System.out.println("Welcome to "+name+" Bank");
	}
}

class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		
		return 5;
	}
	
}

class ICICI extends Bank{

	ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 7;
	}
	
}

class Axis extends Bank{

	Axis(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 6;
	}
	
}
public class OverrideDemo  {
    
  public static void main(String[] args) {
	
	  SBI sbi=new SBI("SBI");
	  ICICI icici=new ICICI("ICICI");
	  Axis axis=new Axis("Axis");
	  
	  sbi.display();
	  System.out.println("The Interest Rate of SBI is : "+sbi.getRateOfInterest());
      
	  icici.display();
	  System.out.println("The Interest Rate of ICICI is : "+icici.getRateOfInterest());
      
	  axis.display();
	  System.out.println("The Interest Rate of Axis is : "+axis.getRateOfInterest());
      
}

}
