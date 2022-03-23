package chp04.Q3;

class A {
	void meth1() {
		System.out.println("This is class A");
	}
}

class B {
	void meth2(A a) { // class as a parameter
		a.meth1();
		System.out.println("This is class B");
	}
}

public class Main {
	public static void main(String[] args) {
		B b = new B();
		b.meth2(new A());
	}
}
