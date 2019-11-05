package com.soma.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest1() {
		int a = 25;
		int b = 26;
		int expectedResult = 51;
		assertEquals(expectedResult, Calculator.add(a, b));
	}

	@Test
	public void addTest2() {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		assertEquals(2 * Integer.MAX_VALUE, Calculator.add(a, b));
	}

	@Test
	public void addTest3() {
		int a = 2;
		int b = 2;
		int expectedResult = 5;
		assertEquals(expectedResult, Calculator.add(a, b));
	}

	@Test
	public void addTest4() {
		int a = Integer.MAX_VALUE + 1;
		int b = Integer.MAX_VALUE + 1;
		int expectedResult = 2 * Integer.MAX_VALUE + 2;
		assertEquals(expectedResult, Calculator.add(a, b));
	}
/*
	@Test
	public void subtractTest1() {
		int a = 5;
		int b = 5;
		double expectedResult = 0;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}

	@Test
	public void subtractTest2() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}

	@Test
	public void subtractTest3() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}

	@Test
	public void subtractTest4() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.subtract(a, b));
	}

	@Test
	public void multiplicationTest1() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}

	@Test
	public void multiplicationTest2() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}

	@Test
	public void multiplicationTest3() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}

	@Test
	public void multiplicationTest4() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.multiply(a, b));
	}

	@Test
	public void divideTest1() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}

	@Test
	public void divideTest2() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}

	@Test
	public void divideTest3() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}

	@Test
	public void divideTest4() {
		int a = ;
		int b = ;
		int expectedResult = ;
		assertEquals(expectedResult, Calculator.divide(a, b));
	}
*/
}
