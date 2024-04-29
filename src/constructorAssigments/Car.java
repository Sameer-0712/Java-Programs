package constructorAssigments;

public class Car {
	
	String make;
	String model;
	String year;
	
	
	public Car() {
		make = "Unknown";
		model = "Unknown";
		year = "Unknown";
	}


	public Car(String make, String model, String year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	

}
