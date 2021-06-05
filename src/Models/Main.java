package Models;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Basic object
		BasicClass basicObject = new BasicClass("kalema","shango",'M',23,true);
		
		// printing object's details
		System.out.print(basicObject.toString());
		
		// printing object's hashcode
		System.out.print(basicObject.hashCode());
	}

}
