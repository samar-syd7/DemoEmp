package com.hospital.staff.doctor.salary.meth;

import com.hospital.staff.doctor.salary.Salary;

public class Doctor extends Salary {
	String name = "Roy";
	int id = 46;

	public void showDocDet() {
		System.out.println("Name:" + name + ", ID:" + id);
	}

	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		doctor.showDocDet();
		System.out.println("Salary:" + doctor.calculateSalary(45000, 785));
	}

}
