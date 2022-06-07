package com.simplilearn.webapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardAnnotationTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("--- Before all is executed. ---");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("--- After all is executed. ---");
	}

	@BeforeEach
	public void setUp() {
		System.out.println("--- Before each is executed. ---");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("--- After each is executed. ---");
	}

	@Test
	@DisplayName("Test One")
	public void testOne() {
		System.out.println("--- Test One is executed. ---");
	}

	@Test
	@DisplayName("Test Two")
	public void testTwo() {
		System.out.println("--- Test Two is executed. ---");
	}

	@Test
	@DisplayName("Test Three")
	@Disabled
	public void testThree() {
		System.out.println("--- Test Three is executed. ---");
		// fail();
	}
}
