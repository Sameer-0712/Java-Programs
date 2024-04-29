package inheritanceConcept;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Kia k1 = new Kia("Sonet", "HTX", "Petrol", "IMT");
		System.out.println(k1.name+" "+k1.model+" "+k1.fuel+" "+k1.transmission+" "+Car.maxSpeed+Kia.maxSpeed);
		k1.start();
		k1.accelerate();
		k1.brake();
		k1.reverse();
		k1.hillAssist();
		
		Car c = new Kia("Seltos","HTK","Diesel","Manual");
		System.out.println(c.name+" "+c.model+" "+c.fuel+" "+c.transmission+" "+Car.maxSpeed+Kia.maxSpeed);
		c.start();
		c.accelerate();
		c.brake();
		c.reverse();
		
		
		System.out.println("-----------");
		
		BMW b = new BMW("X1", "A6", "Petrol", "AMT");
		System.out.println(b.name+" "+b.model+" "+b.fuel+" "+b.transmission+" "+Car.maxSpeed+" "+BMW.maxSpeed);		
		
		
		Car c1 = new BMW("X2", "A7", "Petrol", "CVT"); 
		System.out.println(c1.name+" "+c1.model+" "+c1.fuel+" "+c1.transmission+" "+Car.maxSpeed+" "+BMW.maxSpeed);		

	}

}
