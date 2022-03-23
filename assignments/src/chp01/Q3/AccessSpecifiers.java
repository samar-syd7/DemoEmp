package chp01.Q3;

public class AccessSpecifiers {
	public int a = 1;// can be accessed from anywhere
	private int b = 2;// can be accessed within a class
	protected int c = 3;// can be accessed within a package and extended child
						// class of another package
	int d = 4;// can be acessed within the same package

	public static void main(String[] args) {
		AccessSpecifiers a = new AccessSpecifiers();
		System.out.println(a.a + " " + a.b + " " + a.c + " " + a.d);
	}

}
