package com.capgemini.employee.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.MarketingExecutive;

public class MarketingExecutiveTest {

	private MarketingExecutive market;
	
	@BeforeEach
	public void setUp()
	{
		market = new MarketingExecutive(103,"AMD",20000,5000,150);
	
		
	}
	
	@Test
	public void testObjectIsCreatedWithDefaultConstructor() {
		MarketingExecutive market=new MarketingExecutive();
		assertNotNull(market);
	}
	
	@Test
	public void testObjectIsCreatedWithParameterizedConstructor() {
		MarketingExecutive market=new MarketingExecutive(103,"AMD",20000,5000,150);
		assertNotNull(market);
	}

	@Test
	public void testMarketingExeGrossSalaryIncludingAllowance() {

			assertEquals(37250, market.getGrossSalary());
	}
	
	@Test
	public void testMarketingExeNetSalaryIncludingAllowance() {
		
			assertEquals(34650, market.getNetSalary());
	}
}
