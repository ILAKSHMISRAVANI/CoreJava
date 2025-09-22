package oopsdemo2;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :4:54:31 PM
 * Project :CoreJava
 * 
*/

public class SingleInheritanceAirLine {

	public static void main(String[] args) {
		
		AirLineBooking a1=new AirLineBooking("Sravani Indraganti", 21, "P10908568");
		
		a1.bookTicket();
		a1.displayPassengerDetails();
		a1.displayBookingDetails();
		
		AirLineBooking a2=new AirLineBooking("Suseela Indraganti", 19, "F89076543");
		
		
		a2.bookTicket();
		a2.displayPassengerDetails();
		a2.displayBookingDetails();

	}

}
