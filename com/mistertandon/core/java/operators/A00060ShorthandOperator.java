package com.mistertandon.core.java.operators;
class A00060ShorthandOperator{
	
	public static void main(String[] args) {
		
		byte operand = 5;
		
		operand *= 2;
		System.out.println("Multiplication shorthand result (Multiplicand and Multiplier are of both data type) : "+operand);
		
		operand = 5;
		operand *= 4.5;
		System.out.println("Note: Data type of left operand dominates when Left side operand and Right side operand are of different data type");
		System.out.println("Multiplication shorthand result (Multiplicand and Multiplier are of different data type): "+operand);
	}
}