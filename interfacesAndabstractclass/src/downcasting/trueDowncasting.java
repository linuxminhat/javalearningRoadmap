package downcasting;
class Vehicle {
//	public void run();
	public void run() {
		System.out.println("Vehicle is running ");
	}
	
}
class Car extends Vehicle{
	public void run() {
		System.out.println("My car is running");
	}
}
public class trueDowncasting {
	public static void main(String[] args) {
		Vehicle myVehicle = new Car();
		if(myVehicle instanceof Car) //checking safety
		{
			Car myCar = (Car)myVehicle;
			myCar.run();
			//-> downcasting 
		}
	}

}
