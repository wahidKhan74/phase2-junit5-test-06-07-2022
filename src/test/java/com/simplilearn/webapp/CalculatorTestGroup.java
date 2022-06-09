package com.simplilearn.webapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTestGroup {
	
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

	@Nested
	@DisplayName("Addition Group")
	class Add {
		
		// addition of +ve
		@Test
		@DisplayName("Test Addition +ve numbers")
		public void testAdd1() {
			float actual = calculator.add(1000, 500);
			float expected = 1500;
			assertEquals(expected, actual);
		}

		// addition of +ve & -ve
		@Test
		@DisplayName("Test Addition +ve & -ve numbers")
		public void testAdd2() {
			float actual = calculator.add(1000, -500);
			float expected = 500;
			assertEquals(expected, actual);
		}

		// addition of +ve & -ve
		@Test
		@DisplayName("Test Addition -ve & -ve numbers")
		public void testAdd3() {
			float actual = calculator.add(-1000, -500);
			float expected = -1500;
			assertEquals(expected, actual);
		}
	}
	
	@Nested
	@DisplayName("Substraction Group")
	class Sub {
		
		// substraction of +ve
		@Test
		@DisplayName("Test Substraction +ve numbers")
		public void testSub1() {
			float actual = calculator.sub(1000, 500);
			float expected = 500;
			assertEquals(expected, actual);
		}

		// substraction of +ve & -ve
		@Test
		@DisplayName("Test Substraction +ve & -ve numbers")
		public void testSub2() {
			float actual = calculator.sub(1000, -500);
			float expected = 0;
			assertEquals(expected, actual);
		}

		// substraction of -ve & -ve
		@Test
		@DisplayName("Test Substraction -ve & -ve numbers")
		public void testSub3() {
			float actual = calculator.sub(-1000, -500);
			float expected = 0;
			assertEquals(expected, actual);
		}

		// substraction of -ve & +ve
		@Test
		@DisplayName("Test Substraction -ve & +ve numbers")
		public void testSub4() {
			float actual = calculator.sub(-500, 1000);
			float expected = 0;
			assertEquals(expected, actual);
		}
	}
}
