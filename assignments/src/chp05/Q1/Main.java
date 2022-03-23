package chp05.Q1;

class A {
	final void meth1() {// final method
		System.out.println("Hello");
	}

	void meth2() {

	}
}

class B extends A {
	// meth1....Final method can't be override

	@Override
	void meth2() {
		System.out.println("World");

	}
}

public class Main {
	public static void main(String[] args) {
		B b = new B();
		b.meth1();
		b.meth2();
	}
}
