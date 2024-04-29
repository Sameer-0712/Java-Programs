package inheritanceConcept;

public class IIT extends University {

	
	@Override
	public void getAffiliation() {
		System.out.println("Get technical affiliation");
	}

	public void conductTechnicalPracticals() {
		System.out.println("Technical Practicals");
	}

	@Override
	public void doPlacements() {
		System.out.println("Technical job placements");
	}

	
}
