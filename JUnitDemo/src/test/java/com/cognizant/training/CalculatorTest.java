package com.cognizant.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
		Calculator calc = new Calculator();
		
		int expected = 8;
		
		int actual = calc.add(5,3);
		
		assertEquals(expected,actual);
		
	}

	@Test
	public void testMultiply() {
		
Calculator calc = new Calculator();
		
		int expected =15;
		
		int actual = calc.multiply(5,3);
		
		assertEquals(expected,actual);
		
	}

}
