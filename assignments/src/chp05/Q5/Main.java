package chp05.Q5;

class Staff {
	String name = "Vishal";
	int id = 12;
}

class Details extends Staff {
	String address = "Virar";

	public void studDet() {
		System.out.println("Name:" + super.name + ", Id:" + super.id + ", Address:" + address);// super
																								// keyword
																								// is
																								// used
																								// to
																								// invoke
																								// super
																								// class
																								// variable
	}
}

public class Main {
	public static void main(String[] args) {
		Details details = new Details();
		details.studDet();
	}
}
