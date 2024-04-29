package oopsConcepts;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderPattern app = new BuilderPattern();
		app.login("Sameer", "Sam123").searchProduct("Macbook").addToCart().makePayment("UPI").checkOrder().logout();
		System.out.println("----------");
		app.login("Sameer", "Sam123").addToCart();
	}

}
