package com.mistertandon.core.java.conditional.operator;
class A00130IfElse{
	
	public static void main(String[] args) {
		
		int numberA, numberB, numberC, biggestNumber;
		
		numberA = 160;
		numberB = 100;
		numberC = 300;
		
		if(numberA > numberB && numberA > numberC) {
			
			biggestNumber = numberA;
		}else if(numberB > numberC) {
			
			biggestNumber = numberA;
		}else {
			
			biggestNumber = numberC;
		}
		System.out.println("Biggest number is: "+biggestNumber);
	}
}