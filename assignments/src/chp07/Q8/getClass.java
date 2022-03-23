package chp07.Q8;

class Emp {
	String name;
	int id;

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	void displayInfo() {
		System.out.println("Name :" + name + ", Id:" + id);
	}

}

public class getClass {
	public static void main(String[] args) {
		Emp a = new Emp("Rohit", 12);
		System.out.println("Class of Emp a is : " + a.getClass().getSimpleName());// getting the class simple name from
																					// getClass
	}

}
