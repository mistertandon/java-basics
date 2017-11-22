package com.mistertandon.core.java.operators;
class A00090LeftShiftOperator{
	
	public static void main(String[] args) {
		
		int numberA = 25;
		int result;
		
		result = numberA << 3;
		/*	
		 * 	numberA << 3 i.e. binary representation of numberA will shift by 2 bits after adding two bits on right most side.
		 * 	numberA 11001 will convert to 11001000
		 * 
		 */
		System.out.printf("After apply left shift operator on numberA i.e %d, it will become %d ", numberA, result);
	}
}