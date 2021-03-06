package com.capgemini.MathematicalOperations;

public class MathematicalOperations {

	public static long multiply(long... number) {
		long result = 1;
		for (long l : number)
			result *= l;
		return result;
	}

	public static long substract(long minuend, long subtrahend) {
		return minuend - subtrahend;
	}

	public static long factorial(int n) {
		if (n >= 0) {
			long factorial = 1;

			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
			return factorial;
		}
		throw new IllegalArgumentException("n must be greater than or equal to 0");
	}

	public static double divide(double dividend, double divisor) {
		if (divisor != 0) {
			return dividend / divisor;
		}
		throw new ArithmeticException("Divisor can't be zero");
	}

	public static double adding(double number1, double number2) {
		return number1 + number2;
	}
}
