package inheritanceAssignment;

public class Fortis extends Hospital{

	@Override
	public void admitPatients() {
		System.out.println("Fortis -- admitPatients");
	}

	@Override
	public void prescribe() {
		System.out.println("Fortis -- prescribe");
	}

	public void getVaccination() {
		System.out.println("Fortis -- vaccination");
	}
}
