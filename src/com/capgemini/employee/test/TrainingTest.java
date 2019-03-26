package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.employee.model.CorporateTraining;
import com.capgemini.employee.model.PublicTraining;
import com.capgemini.employee.model.Training;

public class TrainingTest {

	private Training training;
	
	
	
	@Test
	public void testPublicTraining() {
		training = new PublicTraining(1,"java",5000,50);
		assertEquals(250000, training.getOrderValue(),0.1);
	}
	
	@Test
	public void testCorporateTraining() {
		training = new CorporateTraining(1,"Big Data",35000,4);
		assertEquals(140000, training.getOrderValue(),0.1);
	}

}
