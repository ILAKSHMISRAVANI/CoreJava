package packagedemo;

import com.coforge.training.microsoftproj.OperatingSystem;
import com.coforge.training.oracleproj.Database;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 8, 2025
 * Time :10:37:22 AM
 * Project :CoreJava
*/

public class SoftwareList {

	public static void main(String[] args) {

		OperatingSystem o1=new OperatingSystem();
		Database d1=new Database();
		
		System.out.println("********** List of Operating System from Microsoft *************");
		o1.listSoftware();
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("********** List of Databases from Oracle **************");
		d1.printSoftware();

	}

}
