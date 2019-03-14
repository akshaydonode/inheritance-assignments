package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.capgemini.employee.model.Employee;

public class EmployeeTest {
	
	private Employee employee;
	@BeforeEach
	public void setUp() {
		employee = new Employee(101, "John Doe", 20000, 5000);
	}
	@Test
	public void testObjectIsCreatedWithDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	
	}
	
	@Test
	public void testObjectIsCreatedWithParameterizedConstructor() {
		Employee employee = new Employee(101,"AMD",15000,500);
		assertNotNull(employee);
	
	}
	
	@Test
	public void testEmployeeGrossSalary() {
		assertEquals(35000, employee.getGrossSalary());
	}
	
	@Test
	public void testEmployeeNetSalry() {
		assertEquals(32400, employee.getNetSalary());
	}
}

