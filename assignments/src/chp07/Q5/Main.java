package chp07.Q5;

import java.util.Objects;

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
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" + add + ", sal=" + sal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(add, id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {// making objects equal in the heap area
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(add, other.add) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}

}

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("Raj", 1, "vashi", 25568.89);
		Student st2 = new Student("Jai", 2, "andheri", 26596.36);
		Student st3 = new Student("Raj", 1, "vashi", 25568.89);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3.equals(st1));// st3 and st1 is stated equal in the memory
	}
}
