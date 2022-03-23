package chp03.Q3;

class Subject {
	String sub;

	public String showSubjects(String sub1, String sub2, String sub3) {
		return (sub1 + sub2 + sub3);
	}

	public String showSubjects(String sub1, String sub2, String sub3, String sub4) {// method
																					// overloading
		return (sub1 + sub2 + sub3 + sub4);
	}

	public String showSubjects(String sub1, String sub2, String sub3, String sub4, String sub5) {
		return (sub1 + sub2 + sub3 + sub4 + sub5);
	}
}

class Student extends Subject {
	int std = 11;
	String div = "A,B,C,D";

	public void showDet() {
		System.out.println("Std:" + std + ", Div:" + div);
	}

	@Override
	public String showSubjects(String sub1, String sub2, String sub3) {// method
																		// overriding
		// TODO Auto-generated method stub
		return super.showSubjects(sub1, sub2, sub3);
	}

	@Override
	public String showSubjects(String sub1, String sub2, String sub3, String sub4) {
		// TODO Auto-generated method stub
		return super.showSubjects(sub1, sub2, sub3, sub4);
	}

	@Override
	public String showSubjects(String sub1, String sub2, String sub3, String sub4, String sub5) {
		// TODO Auto-generated method stub
		return super.showSubjects(sub1, sub2, sub3, sub4, sub5);
	}

}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.showDet();
		System.out.println("Subjects:");
		System.out.println(" " + student.showSubjects("Physics", "Chemistry", "Maths"));
		System.out.println(" " + student.showSubjects("Physics", "Chemistry", "Maths", "Biology"));
		System.out.println(" " + student.showSubjects("Physics", "Chemistry", "Maths", "Biology", "IT"));
	}
}
