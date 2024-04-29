package encapsulationAssignment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		p1.setName("Sameer");
		p1.setAge(33);
		p1.setGender("Male");
		p1.printInfo();
		
		System.out.println("-----------");
		
		Bankaccount a1 = new Bankaccount();
		a1.setAccountNumber("01A001");
		a1.setBalance(100000);
		a1.setOwner("Tom");
		
		a1.printStatement();
		
		a1.withdraw(2000);
		a1.printStatement();
		System.out.println("-----------");
		a1.deposit(1000);
		a1.printStatement();
		System.out.println("-----------");

		
	}

}
