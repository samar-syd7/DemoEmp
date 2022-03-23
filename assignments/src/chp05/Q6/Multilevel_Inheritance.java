package chp05.Q6;

class D {
	void message() {
		System.out.println("This is class D");
	}
}

class E extends D {
	void message1() {
		System.out.println("This is class E");
	}
}

class F extends E {
	void message2() {
		System.out.println("This is class F");
	}
}
//In Multilevel Inheritance One super class has one child class and further that child class has another sub class
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		F f = new F();
		f.message();
		f.message1();
		f.message2();
	}
}
