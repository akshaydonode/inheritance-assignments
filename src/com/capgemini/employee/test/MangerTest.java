package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;

public class MangerTest {
	private Manager manager;
	
	@BeforeEach
	public void setUp()
	{
	manager = new Manager(101, "John Doe", 20000, 5000);
	}
	
	@Test
	public void testObjectIsCreatedWithDefaultConstructor() {
		Manager manager = new Manager();
		assertNotNull(manager);
	}
	
	@Test
	public void testObjectIsCreatedWithParameterizedConstructor(){
		Manager manager = new Manager(101,"AMD",15000,500);
		assertNotNull(manager);
	}
	
	@Test
	public void testManagerGrossSalaryIncludingAllowance() {
		
		assertEquals(39800, manager.getGrossSalary());
	}
	
	@Test
	public void testManagerNetSalaryIncludingAllowance() {
		assertEquals(37200, manager.getNetSalary());
	}
}
