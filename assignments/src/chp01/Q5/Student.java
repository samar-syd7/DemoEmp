package chp01.Q5;

class Fee {

	public double getFee(double fee) {
		return fee;
	}

}

class Student extends Fee {
	String name;
	int id;

	@Override
	public double getFee(double fee) {// method overriding
		// TODO Auto-generated method stub
		return super.getFee(fee);
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		Student student = new Student("abc", 24);
		System.out.println(student.getFee(45888));
	}
}