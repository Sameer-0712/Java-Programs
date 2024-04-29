package oopsConcepts;

public class BuilderPattern {

	public BuilderPattern login(String user, String password) {
		System.out.println("User: "+user+", password: "+password);
		return this;
	}
	
	public BuilderPattern searchProduct(String name) {
		System.out.println("Search Product: "+name);
		return this;
	}
	
	public BuilderPattern addToCart() {
		System.out.println("Product Added to Cart");
		return this;
	}
	
	public BuilderPattern makePayment(String method) {
		System.out.println("Payment is done via: "+method);
		return this;
	}
	
	public BuilderPattern getOrderId(int orderId) {
		System.out.println("Order ID: "+orderId);
		return this;
	}
	
	public BuilderPattern checkOrder() {
		System.out.println("Order is present");
		return this;
	}
	
	public void logout() {
		System.out.println("Logged Out");
	}
	
}
