package oopsConcepts;

public class Car {

	String name;
	char transmission;
	String colour;
	double topSpeed;
	char fuel;
	
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "Audi";
		c1.transmission = 'M';
		c1.colour = "Red";
		c1.topSpeed = 180.25;
		c1.fuel = 'P';
		
		Car c2 = new Car();
		c2.name = "BMW";
		c2.transmission = 'A';
		c2.colour = "Black";
		c2.topSpeed = 200;
		c2.fuel = 'P';
		
		Car c3 = new Car();
		c3.name = "Kia";
		c3.transmission = 'I';
		c3.colour = "White";
		c3.topSpeed = 150.75;
		c3.fuel = 'D';
		
		System.out.println(c1.name+" "+c1.transmission+" "+c1.colour+" "+c1.topSpeed+" "+c1.fuel);
		System.out.println(c2.name+" "+c2.transmission+" "+c2.colour+" "+c2.topSpeed+" "+c2.fuel);
		System.out.println(c3.name+" "+c3.transmission+" "+c3.colour+" "+c3.topSpeed+" "+c3.fuel);
		
		System.out.println("---------------");
		
		c2 = c1;
		
		System.out.println(c1.name+" "+c1.transmission+" "+c1.colour+" "+c1.topSpeed+" "+c1.fuel);
		System.out.println(c2.name+" "+c2.transmission+" "+c2.colour+" "+c2.topSpeed+" "+c2.fuel);
		System.out.println(c3.name+" "+c3.transmission+" "+c3.colour+" "+c3.topSpeed+" "+c3.fuel);
		
		System.out.println("---------------");
		
		c1 = c3;
		
		System.out.println(c1.name+" "+c1.transmission+" "+c1.colour+" "+c1.topSpeed+" "+c1.fuel);
		System.out.println(c2.name+" "+c2.transmission+" "+c2.colour+" "+c2.topSpeed+" "+c2.fuel);
		System.out.println(c3.name+" "+c3.transmission+" "+c3.colour+" "+c3.topSpeed+" "+c3.fuel);
		
		System.out.println("---------------");
		
		c3 = c2;
		
		System.out.println(c1.name+" "+c1.transmission+" "+c1.colour+" "+c1.topSpeed+" "+c1.fuel);
		System.out.println(c2.name+" "+c2.transmission+" "+c2.colour+" "+c2.topSpeed+" "+c2.fuel);
		System.out.println(c3.name+" "+c3.transmission+" "+c3.colour+" "+c3.topSpeed+" "+c3.fuel);
		
		System.out.println("---------------");
		
	}

}
