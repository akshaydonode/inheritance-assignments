package com.capgemini.employee.model;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private static double pt = 200;
	private double netSalary;
	private double grossSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	
	
	public double getGrossSalary() {
		 hra = basicSalary / 2;
		 grossSalary = basicSalary + hra + getMedical();
		 return grossSalary;
	}

	public double getNetSalary() {
		// TODO Auto-generated method stub
		
		netSalary = getGrossSalary() - (pt + 0.12*basicSalary);
		return netSalary;
	}
	
	
	

}
