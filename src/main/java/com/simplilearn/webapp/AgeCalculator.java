package com.simplilearn.webapp;

public class AgeCalculator {

	// calculate age
	public int ageCalculate(int yearOfBirth) {
		int currentYear = 2022;
		int age = currentYear - yearOfBirth;
		return age;
	}

	// calculate retirement
	public boolean isRetired(int yearOfBirth) {
		int age = ageCalculate(yearOfBirth);
		if (age > 60 && age>0 & age <150) {
			return true;
		}
		return false;
	}

	// age validate
	public boolean ageValidate(int age) {
		if (age > 18) {
			return true;
		}
		return false;
	}
}
