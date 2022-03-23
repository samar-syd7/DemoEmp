package chp05.Q6;

class Parent {
	void message() {
		System.out.println("Parent has two childs:");
	}
}

class Child1 extends Parent {
	void message1() {
		System.out.println("Child 1");
	}
}

class Child2 extends Parent {
	void message2() {
		System.out.println("Child 2");
	}
}

// When One parent class has two child class then it is defined as hierarchical
// inheritance
public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.message();
		child1.message1();
		Child2 child2 = new Child2();
		child2.message2();
	}
}
