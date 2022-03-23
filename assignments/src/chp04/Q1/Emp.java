package chp04.Q1;

public class Emp {
	String name;
	int id;
	double sal;
	FavFood f;// object as aggregation
	Address a;// object as composition

	public void showEmpDetails(String name, int id, double sal, Address a, FavFood f) {
		System.out.println("Name:" + name + ", Id:" + id + ", Salary:" + sal + ", Address:" + a.add
				+ "\nFavourite Fast food:" + f.favfood);
	}

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.showEmpDetails("Sumit", 21, 45634.2, new Address(), new FavFood());
	}
}
