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

	public static long factorial(int n) {
		if(n >= 0){
			long factorial = 1;
			
			for(int i = 1; i <= n; i++){
				factorial *= i;
			}
			return factorial;
		}
		throw new IllegalArgumentException("n must be greater than or equal to 0");
	}
}
