package chp03.Q4;

public class Main {// POJO class
	private String name;
	private double salary;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.setName("Ameen");
		main.setSalary(25000);
		main.setId(45);
		System.out.println(main.getName());
		System.out.println(main.getSalary());
		System.out.println(main.getId());
	}
}
