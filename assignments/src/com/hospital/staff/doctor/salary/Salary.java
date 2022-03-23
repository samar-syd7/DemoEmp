package com.hospital.staff.doctor.salary;

public class Salary {
	double sal;

	protected double calculateSalary(double Amt, double Tax) {// can acces
																// extended
																// child class
																// of another
																// package
		return (Amt - Tax);
	}
}
