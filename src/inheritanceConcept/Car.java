package inheritanceConcept;

public class Car {

	public String name;
	public String model;
	public String fuel;
	public String transmission;
	public static int maxSpeed = 200;
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void accelerate() {
		System.out.println("Car -- accelerate");
	}
	
	public void brake() {
		System.out.println("Car -- brake");
	}
	
	public void reverse() {
		System.out.println("Car -- reverse");
	}
	
	public static void refuel() {
		System.out.println("Car -- refueling");
	}
	
}
