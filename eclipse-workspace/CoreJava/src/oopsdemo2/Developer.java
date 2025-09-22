package oopsdemo2;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :4:21:36 PM
 * Project :CoreJava
 * Java program for single inheritance
*/

public class Developer extends Employee{

	private String skillSet;
	private String projectName;
	
	
	// Parameterized Constructor using fields
	public Developer(int empId, String name, String skillSet, String projectName) {
		super(empId, name); // Invoke parent class constructor
		this.skillSet = skillSet;
		this.projectName = projectName;
	}

	// method to display developer details
	public void displayDeveloperDetails() {
		// call parent class method
		System.out.println("Skill Set: " + skillSet);
		System.out.println("Project Name: " + projectName);
	}

}
