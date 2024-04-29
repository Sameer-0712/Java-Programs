package inheritanceConcept;

public class Kia extends Car {
	
//	public static int maxSpeed = 100;
	
	public Kia(String name, String model, String fuel, String transmission) {
		super.name = name;
		super.model = model;
		super.fuel = fuel;
		super.transmission = transmission;
	}
	
	@Override
	public void start() {
		System.out.println(this.name+ "Kia -- push start");
	}
		
	public void hillAssist() {
		System.out.println(this.name+"Kia-- Hill Assist");
	}

}
