package com.mistertandon.core.java.conditional.operator;

public class A00162DoWhileLoop {
	
	public static void main(String[] args) {
			
			int iteration, iterationLimit;
			
			iteration = 1;
			iterationLimit = 10;
			
			do {
				
				System.out.println(iteration+"th iteration");
				iteration++;

			}while(iteration < iterationLimit);
	}
}
