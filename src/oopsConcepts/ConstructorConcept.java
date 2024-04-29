package oopsConcepts;

public class ConstructorConcept {
	
	String id;
	String name;
	String dept;
	
	public ConstructorConcept() {
		name = "Admin";
		id = "001";
		dept = "Admin";
	}
	 
	public ConstructorConcept(String id, String name, String dept) {
		this();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public ConstructorConcept(String id, String name) {
		this("id005", "Test", "Testing");
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept c1 = new ConstructorConcept("id01", "Sameer", "IT");
		ConstructorConcept c2 = new ConstructorConcept("id02", "Tom", "Finance");
		ConstructorConcept c3 = new ConstructorConcept("id03", "Peter", "Admin");
		ConstructorConcept c4 = new ConstructorConcept("id04", "Victor", "HR");
		ConstructorConcept c5 = new ConstructorConcept();
		
		System.out.println(c1.id+" "+c2.id+" "+c3.id+" "+c4.id+" "+c5.id);
		System.out.println(c1.name+" "+c2.name+" "+c3.name+" "+c4.name+" "+c5.name);
		System.out.println(c1.dept+" "+c2.dept+" "+c3.dept+" "+c4.dept+" "+c5.dept);
		
		ConstructorConcept c6 = new ConstructorConcept("id004","Krish");
		System.out.println(c6.id+" "+c6.name+" "+c6.dept);

		
	}

}
