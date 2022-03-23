package chp01.Q1;

public class Emp {
	// variable declaration
	String name;
	int id;
	double salary;
	String address;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}

	public Emp(String name, int id, double salary, String address) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name:" + name + ", Id:" + id + ", salary:" + salary + ", Address:" + address);

	}

	public static void main(String[] args) {
		Emp emp = new Emp("Ameen", 01, 25000, "Vasai"); // object initialization
		System.out.println(emp);// printing object
		emp.displayInfo();// calling method

	}

}
