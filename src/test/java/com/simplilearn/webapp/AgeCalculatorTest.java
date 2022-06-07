package com.simplilearn.webapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Age calculator operations")
public class AgeCalculatorTest {

	AgeCalculator ag;
	
	@BeforeEach
	void setUp() throws Exception {
		ag = new AgeCalculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		if(ag != null) {
			ag = null;
		}
	}
	
	@Test
	@DisplayName("Test Age Calculation +ve year")
	void testAge() { 
		assertEquals(32, ag.ageCalculate(1990));
		assertEquals(28, ag.ageCalculate(1994));
		assertEquals(29, ag.ageCalculate(1993));
	}
	
	@Test
	@DisplayName("Test Retirement Calculation +ve year")
	void testRetiement() { 
		assertEquals(false, ag.isRetired(1990));
		assertEquals(false, ag.isRetired(1994));
		assertEquals(true, ag.isRetired(1893));
	}
	
	@Test
	@DisplayName("Test Retirement Calculation -ve year")
	void testRetiement2() { 
		assertEquals(false, ag.isRetired(-1990));
		assertEquals(false, ag.isRetired(-1994));
		assertEquals(false, ag.isRetired(-1893));
	}
}
