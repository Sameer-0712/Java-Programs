package constructorAssigments;

public class Rectangle {

	double length;
	double width;
	
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length*width;
	}
	
}
