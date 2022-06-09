package com.simplilearn.webapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Outer Test")
public class NestedTestDemo {

	@BeforeEach
	void setUP() {
		System.out.println("** Outer Test :: Before each method **");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("** Outer Test :: After each method **");
	}
	
	@Test
	void testOuter() {
		System.out.println("-- Outer Test Completed !---");
	}
	
	@Nested
	@DisplayName("Inner Test")
	class  InnerTest{
		
		@Test
		void testOne() {
			System.out.println("Test One Completed");
		}
		
		@Test
		void testTwo() {
			System.out.println("Test Two Completed");
		}
		
		@Test
		void testThree() {
			System.out.println("Test Three Completed");
		}
	}
}


