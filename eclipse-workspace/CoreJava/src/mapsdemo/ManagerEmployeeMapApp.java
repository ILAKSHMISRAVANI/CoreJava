package mapsdemo;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 9, 2025
 * Time :3:38:16 PM
 * Project :CoreJava
 */

public class ManagerEmployeeMapApp {

	public static void main(String[] args) {

		 // Create company
        Company company = new Company();

        // Managers
        Manager m1 = new Manager(1, "Alice");
        Manager m2 = new Manager(2, "Bob");

        // Employees
        Employee e1 = new Employee(101, "John", "IT");
        Employee e2 = new Employee(102, "Sara", "IT");
        Employee e3 = new Employee(103, "Mike", "Finance");
        Employee e4 = new Employee(104, "Emma", "Finance");
        Employee e5 = new Employee(105, "Raj", "Sales");

        // Add managers
        company.addManager(m1);
        company.addManager(m2);

        // Assign employees
        company.addEmployeeToManager(m1, e1);
        company.addEmployeeToManager(m1, e2);
        company.addEmployeeToManager(m2, e3);
        company.addEmployeeToManager(m2, e4);
        company.addEmployeeToManager(m2, e5);

        // Display
        company.showAllManagersAndEmployees();
	}

}
