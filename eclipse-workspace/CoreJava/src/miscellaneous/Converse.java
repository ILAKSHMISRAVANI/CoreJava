package miscellaneous;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 8, 2025
 * Time :10:56:38 AM
 * Project :CoreJava
*/

public class Converse {
	
	void tobeConvert() {
        String binary, hex, octal;
        int num = 100;
        
        binary = Integer.toBinaryString(num);
        hex = Integer.toHexString(num);
        octal = Integer.toOctalString(num);

        System.out.println("Decimal value : " + num);
        System.out.println("Binary equivalent = " + binary);
        System.out.println("Hexadecimal equivalent = " + hex);
        System.out.println("Octal equivalent = " + octal);
    }
    

}
