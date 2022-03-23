package chp01.Q6;

class Address {
	String address = "Vasai";
}

class Student {
	String name; // composition
	int id;
	String hobby;// aggregation
	Address add;

	public Student(String name, int id, String hobby, Address add) {
		this.name = name;
		this.id = id;
		this.hobby = hobby;
		this.add = add;
	}

	public void showDetails() {
		System.out.println("name:" + name + " id:" + id + " hobby: " + hobby + " Address:" + add.address);

	}

	public static void main(String[] args) {
		Student student = new Student("Ameen", 01, "cricket", new Address());
		student.showDetails();
	}

}
