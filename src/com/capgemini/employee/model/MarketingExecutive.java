package com.capgemini.employee.model;

public class MarketingExecutive extends Employee{

		private double kilometerTravelled;
		private static double tourAllowance = 5;
		private static double telephoneAllowance = 1500;
		public MarketingExecutive() {
			super();
			// TODO Auto-generated constructor stub
		}
		public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical, double kilometerTravelled) {
			super(employeeId, employeeName, basicSalary, medical);
			// TODO Auto-generated constructor stub
			this.kilometerTravelled=kilometerTravelled;
		}
		
		
		public double getGrossSalary() {
			// TODO Auto-generated method stub

			return super.getGrossSalary() + kilometerTravelled*tourAllowance + telephoneAllowance;
		}
}
