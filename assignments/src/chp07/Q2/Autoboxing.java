package chp07.Q2;

public class Autoboxing {
	public static void main(String[] args) {
		int a = 50;
		Integer a1 = new Integer(a);// boxing
		Integer a2 = 60;
		System.out.println(a1 + "\n" + a2);
	}
}