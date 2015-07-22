package com.capgemini.MathematicalOperations;

public class MathematicalOperations {
	
	public static long multiply(long ... number) {
		long result = 1;
		for (long l : number)
			result *= l;
		return result;
	}

	public static long substract(long minuend, long subtrahend){
		return minuend - subtrahend;
	}
}
