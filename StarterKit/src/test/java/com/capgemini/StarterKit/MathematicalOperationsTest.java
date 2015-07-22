package com.capgemini.StarterKit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathematicalOperationsTest {
	@Test
	public void shouldReturn0For0By5() {
		assertEquals(0, MathematicalOperations.divide(0, 5), 0);
	}

	@Test
	public void shouldReturn2For10By5() {
		assertEquals(2, MathematicalOperations.divide(10, 5), 0);
	}
	
	@Test
	public void shouldReturn2Point25For9By4() {
		assertEquals(2.25, MathematicalOperations.divide(9, 4), 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void shoulThrowExceptionDivisor0() {
		MathematicalOperations.divide(10, 0);
	}

}
