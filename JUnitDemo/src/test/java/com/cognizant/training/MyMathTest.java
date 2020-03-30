 package com.cognizant.training;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

	@Test
	public void testIsEven() {
		
		MyMath myMath = new MyMath();		
		
		assertFalse(myMath.isEven(5));
		
		
		
		
	}

	
	
	@Test
	public void testFindAbsolute() {
		MyMath myMath = new MyMath();
		
		int expected = 5;
		int actual = myMath.findAbsolute(-5);
		assertEquals(expected,actual);
		
		
	}

}
