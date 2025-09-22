package oopsdemo1;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 3, 2025
 * Time :10:52:49 AM
 * Project :CoreJava
 */
class Faculty
{
	int empId;
	String name;

	public void setData(int c,String d){
		this.empId=c;
		this.name=d;
	}

	public void showData(){
		System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
		System.out.println();
	}
}
public class ArrrayOfObjectsDemo {

	public static void main(String[] args) {
		// Create array of Faculty Object
		Faculty[] obj=new Faculty[5];
		
		//create actual Faculty Object
		for(int i=0;i<5;i++)
		{
			obj[i]=new Faculty();
		}
		
		//Assign data to Faculty objects
		obj[0].setData(100, "Nandhu");
		obj[1].setData(101, "Sravani");
		obj[2].setData(102, "Poojitha");
		obj[3].setData(103, "Loukya");
		obj[4].setData(104, "Moksha");
		
		// display employ Object data
		System.out.println("********** Faculty Data ***********");
		for(int i=0;i<5;i++) {
			obj[i].showData();
		}
		System.out.println("**************************************");
	}

}
