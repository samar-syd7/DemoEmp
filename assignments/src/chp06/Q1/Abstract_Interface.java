package chp06.Q1;

interface Patient {
	void patientDetails();
}

abstract class PatientInfo {
	/*
	 * when we know some kind of information, but to perform that we depend on
	 * other To reduce complexity of domain we use abstract
	 * 
	 */

	void disease() {// non-abstract method
		System.out.println("Disease:" + " " + "Affected with High Fever");
	}

	abstract void patientFood();// abstract method doesn't have body not even a
	// curly braces
}

class Patient_Details extends PatientInfo implements Patient {
	String name;
	int id;

	public Patient_Details(String name, int id) {

		this.name = name;
		this.id = id;
	}

	@Override
	void patientFood() {// abstract class enforce child class to override
						// abstract
		// method
		System.out.println("Food:" + " " + "Very Light Food");
	}

	@Override
	public void patientDetails() {
		System.out.println("Name:" + "" + name + "  ID:" + id);
	}

}

class Abstract_Interface {
	public static void main(String[] args) {
		Patient_Details det = new Patient_Details("Jai", 05);
		System.out.println("Patient Details:-");
		det.patientDetails();
		det.disease();
		det.patientFood();
	}
}