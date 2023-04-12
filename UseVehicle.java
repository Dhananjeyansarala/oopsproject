package oops2test;

public class UseVehicle {
	public static void main(String[] args) {
		int noOfPassengers=Integer.parseInt(args[0]);
		VehicleFour v=new VehicleFour();
		v.vehicleDetail(noOfPassengers);
	}

}
