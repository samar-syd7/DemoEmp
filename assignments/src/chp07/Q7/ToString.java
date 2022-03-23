package chp07.Q7;

class Student {
	String name;
	int id;
	String add;
	double sal;

	public Student(String name, int id, String add, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
		this.sal = sal;
	}

	@Override
	public String toString() {// toString method is used to represent any object as string
		return "Student [name=" + name + ", id=" + id + ", add=" + add + ", sal=" + sal + "]";
	}
}

public class ToString {
	public static void main(String[] args) {
		Student st = new Student("Vishal", 72, "Virar", 20365.32);
		System.out.println(st);// If object is printed without toString method, then it will print hashcode
	}
}
