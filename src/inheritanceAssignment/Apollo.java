package inheritanceAssignment;

public class Apollo extends Hospital {

	@Override
	public void admitPatients() {
		System.out.println("Apollo - admitPatients");
	}

	@Override
	public void fullBodyTest() {
		System.out.println("Apollo - fullBodyTest");
	}
	
	public void provideCashlessTreatment() {
		System.out.println("Apollo -- cashlessTreatment");
	}

	
	
}
