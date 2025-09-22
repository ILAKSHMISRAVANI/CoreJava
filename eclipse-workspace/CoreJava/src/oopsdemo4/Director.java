package oopsdemo4;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 5, 2025
 * Time :2:37:32 PM
 * Project :CoreJava
 */

public class Director extends Employee {
	double transportAllownace;

	public Director(String name, double basic, String address, double transportAllownace) {
		super(name, basic, address);
		this.transportAllownace = transportAllownace;
	}

	@Override
	double totalPay() {
		double totalAmount = 0;
		double houseRentAllowance = (basic * 0.20);
		double dearnessAllowance = (basic * 0.5);
		double medicalAllowance = 4500;
		double entertainmentAllowance = 5000;

		totalAmount = basic + houseRentAllowance + dearnessAllowance
				+ medicalAllowance + entertainmentAllowance + transportAllownace;
		return totalAmount;
	}

	void show() {
		super.show();
			System.out.println("Transport Allowance: \t" + transportAllownace);
	    }

	}
