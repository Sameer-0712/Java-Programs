package inheritanceAssignment;

public class Max extends Hospital {

	@Override
	public void prescribe() {
		System.out.println("Max -- prescribe");
	}

	@Override
	public void fullBodyTest() {
		System.out.println("Max -- fullBodyTest");
	}
	
	public void pathServices() {
		System.out.println("Max -- pathServices");
	}

}
