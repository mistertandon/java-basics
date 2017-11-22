package com.mistertandon.core.java.conditional.operator;
class A00140Ternary{
	
	public static void main(String[] args) {
		
		int rateofinterest = 6, finalinterest;
		Boolean isExecution = true;
		
		
		finalinterest = isExecution?rateofinterest:8;
		
		System.out.println("Rate of interest is : "+finalinterest);
	}
}