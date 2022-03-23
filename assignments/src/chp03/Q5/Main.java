package chp03.Q5;

class Emp {
	String name = "Ameen";// global variable
	int id = 36;
	static String deptname = "Mahindra";// static variable

	public void showInfo() {
		double sal = 38255.6;// local variable
		System.out.println("Name:" + name + ", ID:" + id + ", Salary:" + sal);
	}

	public static void deptName() {
		System.out.println("Department Name:" + deptname);
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("Information of an employee:");
		Emp emp = new Emp();
		emp.showInfo();
		Emp.deptName();
	}
}
