package inheritanceConcept;

public class IIM extends University {

	@Override
	public void getAffiliation() {
		System.out.println("Get Management affiliated");
	}

	@Override
	public void doPlacements() {
		System.out.println("Managerial job placements");
	}
	
	public void getInternship() {
		System.out.println("Managerial Internships");
	}

}
