package encapsulationConcept;

public class Car {

	private String name;
	private String model;
	private String transmission;
	private double price;
	private boolean hasApplePlay;
	private boolean hasCarplay;
	
	public Car(String name, String model, String transmission, double price, boolean hasApplePlay, boolean hasCarplay) {
		this.name = name;
		this.model = model;
		this.transmission = transmission;
		this.price = price;
		this.hasApplePlay = hasApplePlay;
		this.hasCarplay = hasCarplay;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean HasApplePlay() {
		return hasApplePlay;
	}
	public void setHasApplePlay(boolean hasApplePlay) {
		this.hasApplePlay = hasApplePlay;
	}
	public boolean HasCarplay() {
		return hasCarplay;
	}
	public void setHasCarplay(boolean hasCarplay) {
		this.hasCarplay = hasCarplay;
	}
		
	
}
