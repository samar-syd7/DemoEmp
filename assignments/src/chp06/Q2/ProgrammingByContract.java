package chp06.Q2;

interface Hotel_Management {// contract in interface
	void dealingCustomers();

	void assuringSecurity();

	void cleanRoom();

	void goodFood();

}

class Head_Of_Dept implements Hotel_Management {// this is a provider class
	@Override
	public void dealingCustomers() {
	}

	@Override
	public void assuringSecurity() {
	}

	@Override
	public void cleanRoom() {
	}

	@Override
	public void goodFood() {
	}
}

class Front_Staff_Work extends Head_Of_Dept {// this is Front staff
	@Override
	public void dealingCustomers() {
		System.out.println("1)" + "" + "Dealing with customers");
	}

	@Override
	public void assuringSecurity() {
		System.out.println("2)" + "" + "Assuring them safety");
	}
}

class Back_Staff_Work extends Head_Of_Dept {// this is Back staff

	@Override
	public void cleanRoom() {
		System.out.println("3)" + "" + "Providing Neat/Clean rooms");
	}

	@Override
	public void goodFood() {
		System.out.println("4)" + "" + "Taking best care of food");
	}
}

public class ProgrammingByContract {
	public static void main(String[] args) {
		System.out.println("Hotel Management Regular Tasks:-");
		Front_Staff_Work f = new Front_Staff_Work();
		f.dealingCustomers();
		f.assuringSecurity();
		Back_Staff_Work b = new Back_Staff_Work();
		b.cleanRoom();
		b.goodFood();
	}
}
