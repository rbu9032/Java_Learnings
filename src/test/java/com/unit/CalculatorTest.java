package com.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorTest {
	
	@Autowired
	Calculator calculator;
	
	@Test
	public void testAddSuccess() {
		
		int res = calculator.add(5, 8);
		assertEquals(13, res);
	}
	
	@Test
	public void testSubSuccess() {
		
		int res = calculator.sub(5, 8);
		assertEquals(-3, res);
	}

//	@Test
//	public void testAddFail() {
//		
//		int res = calculator.add(5, 8);
//		assertNotEquals(13, res);
//	}
	@Test
	public void testDivSuccess() {
		
		double res = calculator.divide(20, 4);
		assertEquals(5.0, res);
	}
	
	@Test
	public void testDivideThrowArithmeticException() {
		assertThrows(ArithmeticException.class, ()-> calculator.divide(20,0));
	}
}
