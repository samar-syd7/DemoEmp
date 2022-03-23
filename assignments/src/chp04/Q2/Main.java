package chp04.Q2;

class Student {
	String name;
	int id;
	String address;

	void display() {
		System.out.println("name:" + name + ", id" + id + ", address" + address);
	}

	@Override
	protected void finalize() throws Throwable {// finalize method is called to
												// clean up the space
		System.out.println("Student Info is deleted");
	}

}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student = null;// removing object
		System.gc();// garbage collector collects the null reference
	}
}
