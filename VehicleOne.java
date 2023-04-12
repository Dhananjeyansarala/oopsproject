package oops2test;

public class VehicleOne {
	public void vehicleDetail(int noOfPassengers) {
		if(noOfPassengers<=2 && noOfPassengers>=1) {
			System.out.println("Use Bike");
		}
		else if(noOfPassengers<5&&noOfPassengers>2) {
			System.out.println("Use Car");
		}
		else if(noOfPassengers<50&&noOfPassengers>5) {
			System.out.println("Use Bus");
		}
		else if(noOfPassengers>50) {
			System.out.println("Use Train");
		}
		else {
			System.out.println("Invalid Data");
			
			
		}
	}

}
