package chp05.Q2;

class A {
	A meth() {
		return this;
	}
}

class B extends A {
	B meth() {// Co-variant return type....return type may differ in sub class
		return this;
	}

	void show() {
		System.out.println("Hii");
	}
}

public class Main {
	public static void main(String[] args) {
		new B().meth().show();
	}
}
