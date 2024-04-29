package encapsulationConcept;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Kia","Sonet","imt",15.25,true,true);	
		System.out.println(c1.getName()+" "+c1.getModel()+" "+c1.getPrice()+" "+c1.getTransmission()+" "+c1.HasCarplay()+" "+c1.HasApplePlay());
		c1.setModel("Seltos");
		c1.setPrice(18.75);
		System.out.println(c1.getName()+" "+c1.getModel()+" "+c1.getPrice()+" "+c1.getTransmission()+" "+c1.HasCarplay()+" "+c1.HasApplePlay());
		
	}

}
