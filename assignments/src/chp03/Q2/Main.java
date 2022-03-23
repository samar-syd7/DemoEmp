package chp03.Q2;

class Worker {
	String name;
	int id;
	double sal;

	public Worker(String name, int id, double sal) {// parameterised constructor

		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		System.out.println("Details of a single worker:");
		Worker worker = new Worker("Sahil", 45, 8000);
		System.out.println(worker);
	}
}
