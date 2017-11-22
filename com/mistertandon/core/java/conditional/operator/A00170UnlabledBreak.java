package com.mistertandon.core.java.conditional.operator;

public class A00170UnlabledBreak {
	
	public static void main(String[] args) {
			
		int outerLoopLimit, innerLoopLimit;
		
		
		outerLoopLimit = innerLoopLimit = 5;
		
		for(int outerLoopInit = 1; outerLoopInit < outerLoopLimit; outerLoopInit++) {
			
			for(int innerLoopInit = 1; innerLoopInit < innerLoopLimit; innerLoopInit++) {
				
				if(outerLoopInit == 2) break;
				
				System.out.print("*");
				
			}
				
				System.out.println("");
			
		}
	}
}
