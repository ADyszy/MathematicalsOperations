package com.capgemini.StarterKit;

public class MathematicalOperations {

	public static double divide (double dividend, double divisor){
		if(divisor!=0){
			return dividend/divisor;
		}
		throw new ArithmeticException("Divisor can't be zero");
	}
	
}
