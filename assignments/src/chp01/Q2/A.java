package chp01.Q2;

public class A {
	// variable declaration
	String name;
	int id;
	static String deptname = "ABC";
	static String deptsal = "25000";

	public A(String name, int id) {

		this.name = name;
		this.id = id;
	}

	public void meth1() {// non-static method
		System.out.println("Name:" + name + ", Id:" + id);

	}

	public static void meth2() {// static method
		System.out.println("deptname:" + deptname + ", deptsal:" + deptsal);

	}

	public static void main(String[] args) {
		A a = new A("Ameen", 01);
		a.meth1();// accessing through object name
		A.meth2();// accessing through class name
	}

}
