package inheritanceAssignment;

public class Patient {

	public static void main(String[] args) {

		System.out.println("Parent Class Reference, Parent Class Object:-");
		Hospital h = new Hospital();
		h.admitPatients(); //Hospital -- admitPatients
		h.fullBodyTest(); //Hospital -- fullBodyTest
		h.prescribe();//Hospital -- prescribe
		System.out.println("---");
		Apollo a = new Apollo();
		a.admitPatients();//Apollo - admitPatients
		a.fullBodyTest();//Apollo - fullBodyTest
		a.prescribe();//Hospital -- prescribe
		a.provideCashlessTreatment();//Apollo -- cashlessTreatment
		System.out.println("---");
		Max m = new Max();
		m.admitPatients();//Hospital -- admitPatients
		m.fullBodyTest();//Max -- fullBodyTest
		m.prescribe();//Max -- prescribe
		m.pathServices();//Max -- pathServices
		System.out.println("---");
		Fortis f = new Fortis();
		f.admitPatients();//Fortis -- admitPatients
		f.fullBodyTest();//Hospital -- fullBodyTest
		f.prescribe();//Fortis -- prescribe
		f.getVaccination();//Fortis -- vaccination
		
		System.out.println("Parent Class Reference, Child Class Object:-");
		Hospital h2 = new Apollo();
		h2.admitPatients();//Apollo - admitPatients
		h2.fullBodyTest();//Apollo - fullBodyTest
		h2.prescribe();//Hospital -- prescribe
		System.out.println("---");
		Hospital h3 = new Max();
		h3.admitPatients();//Hospital -- admitPatients
		h3.fullBodyTest();//Max -- fullBodyTest
		h3.prescribe();//Max -- prescribe
		System.out.println("---");
		Hospital h4 = new Fortis();
		h4.admitPatients();//Fortis -- admitPatients
		h4.fullBodyTest();//Hospital -- fullBodyTest
		h4.prescribe();//Fortis -- prescribe
		
		
		
	}

}
