package chp05.Q6;

class A {
	void message() {
		System.out.println("This is class A");
	}
}

class B extends A {
	void message1() {
		System.out.println("This is class B");
	}
}

// In single inheritance super class has only one sub class
public class Single_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.message();
		b.message1();
	}
}
