package chp01.Q4;

public class Overloading {
	String name;
	int id;

	public Overloading(String name, int id) {

		this.name = name;
		this.id = id;
	}

	public void displayInfo() {
		System.out.println("Name:" + name + ", Id:" + id);

	}

	public double getSalary(double sal) {
		return sal;
	}

	public double getSalary(double sal, double tax) {// method overloading
		return (sal + tax);
	}

	public static void main(String[] args) {
		Overloading overloading = new Overloading("abc", 01);
		overloading.displayInfo();
		System.out.println("Salary:" + "" + overloading.getSalary(25000, 650));
	}

}
