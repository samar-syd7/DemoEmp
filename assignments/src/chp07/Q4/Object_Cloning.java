package chp07.Q4;

class Emp implements Cloneable {
	String name;
	int id;
	String address;

	public Emp(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [Name=" + name + ", Id=" + id + ", Address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Object_Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp1 = new Emp("Ameen", 45, "Vasai");
		Emp emp2 = new Emp("Vijay", 56, "Thane");

		Emp empclone = (Emp) emp1.clone();// creating a clone of object of emp1

		System.out.println(emp2);// calling emp2
		System.out.println(empclone);// emp1 is cloned to empclone
	}
}
