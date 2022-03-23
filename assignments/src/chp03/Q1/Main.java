package chp03.Q1;

class Student {
	String name = "Ameen";
	int id = 02;
	static String schoolname = "St.Xaviours";// static variable

	void meth1() {
		System.out.println("Name:" + name + ", Id:" + id);
	}

	static void meth2() {// static method
		System.out.println("School name:" + schoolname);
	}
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.meth1();// calling by object reference
		Student.meth2();// calling by class name
	}
}
