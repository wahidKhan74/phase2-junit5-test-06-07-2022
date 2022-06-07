package com.simplilearn.webapp;

public class Calculator {

	// add operation
	public float add(int num1 , int num2) {
		return num1 + num2;
	}
	
	// sub operation
	public float sub(int num1 , int num2) {
		if(num1>0 && num2>0 & num1> num2) {
			return num1 - num2;
		}
		return 0;	
	}
	
	// mul operation
	// div operation
	// avg operation
	
}
