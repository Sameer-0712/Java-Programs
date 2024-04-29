package inheritanceConcept;

public class University extends WEO{

	@Override
	public void doTeaching() {
		System.out.println("University -- teaching");
	}

	@Override
	public void enrollStudents() {
		System.out.println("University -- enrollment");
	}
	
	public void getAffiliation() {
		System.out.println("University -- Affiliated");
	}
	
	public void conductExams() {
		System.out.println("University--conduct exams");
	}
	
	public void checkExams() {
		System.out.println("University--check exams");
	}
	
	public void publishResults() {
		System.out.println("University -- publish results");
	}
	
	public void doPlacements() {
		System.out.println("University -- placements");
	}
}
