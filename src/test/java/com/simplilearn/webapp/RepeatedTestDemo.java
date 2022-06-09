package com.simplilearn.webapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {
	
	Calculator calculator;

	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}

	@AfterEach
	public void tearDown() {
		if (calculator != null) {
			calculator = null;
		}
	}


	@Test
	@DisplayName("Test Addition +ve numbers")
	@RepeatedTest(3)
	public void testAdd1() {
		float actual = calculator.add(1000, 500);
		float expected = 1500;
		assertEquals(expected, actual);
	}

	
	@Test
	@DisplayName("Test Addition")
	@RepeatedTest(value=3, name="{displayName} -> repetition {currentRepetition} , of , {totalRepetitions}")
	public void testAdd2() {
		float actual = calculator.add(1000, 500);
		float expected = 1500;
		assertEquals(expected, actual);
	}
	
	
	@Test
	@DisplayName("Test Addition short")
	@RepeatedTest(value=3, name=RepeatedTest.SHORT_DISPLAY_NAME)
	public void testAdd3() {
		float actual = calculator.add(1000, 500);
		float expected = 1500;
		assertEquals(expected, actual);
	}

	
	@Test
	@DisplayName("Test Addition long")
	@RepeatedTest(value=2, name=RepeatedTest.LONG_DISPLAY_NAME)
	public void testAdd4() {
		float actual = calculator.add(1000, 500);
		float expected = 1500;
		assertEquals(expected, actual);
	}
	
	
}
