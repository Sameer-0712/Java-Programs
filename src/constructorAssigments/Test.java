package constructorAssigments;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Sameer", 33, 'M', 6.2);		
		Person p2 = new Person("Tom", 30, 'M', 6);
		
		System.out.println("P1 Info: -->"+p1.name+" "+p1.age+" "+p1.gender+" "+p1.height);
		System.out.println("P2 Info: -->"+p2.name+" "+p2.age+" "+p2.gender+" "+p2.height);
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.calculateArea());
		
		Rectangle r2 = new Rectangle(2.1,2.8);
		System.out.println(r2.calculateArea());
		
		Employee e1 = new Employee(1, "James", 10);
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		e1.setSalary(e1.getSalary());
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		
		Car c1 = new Car();
		System.out.println(c1.make+" "+c1.year+" "+c1.model);
		
		Car c2 = new Car("BMW","X5","2015");
		System.out.println(c2.make+" "+c2.year+" "+c2.model);
		
		Car c3 = new Car("Audi","A6","2010");
		System.out.println(c3.make+" "+c3.year+" "+c3.model);
		
		System.out.println("------------");
		
		BankAccount a1 = new BankAccount("001A", 50000);
		a1.deposit(2000);
		System.out.println(a1.balance);
		a1.deposit(3000);
		System.out.println(a1.balance);
		a1.deposit(1000);
		System.out.println(a1.balance);
		a1.deposit(5000);
		System.out.println(a1.balance);
		a1.withdraw(2000);
		System.out.println(a1.balance);
		a1.deposit(2000);
		System.out.println(a1.balance);
		a1.withdraw(7000);
		System.out.println(a1.balance);
	}

}
