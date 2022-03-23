package chp07.Q6;

class Client {
	String name;
	int id;

	public Client(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", id=" + id + "]";
	}

	@Override
	protected void finalize() throws Throwable {// finalize method is called before object is being garbage collected
		System.out.println("Object is deleted");
	}
}

public class Finalize_Exp {
	public static void main(String[] args) {
		Client c1 = new Client("Ram", 23);
		Client c2 = new Client("Joy", 28);
		Client c3 = new Client("Adam", 27);
		System.out.println(c1);
		System.out.println(c2);

		c3 = null;// removing object
		System.gc();// collects the null object

	}
}
