package com.mistertandon.core.java.oops.concept;

public class A0060Inheritence {

	public static void main(String[] args) {
		
		Multiplication multiplicationObj = new Multiplication();
		
		multiplicationObj.setAugend(4);
		multiplicationObj.setAddend(45);
		multiplicationObj.getSum();
		multiplicationObj.displaySum();
		
		multiplicationObj.setMultiplicand(2);
		multiplicationObj.setMultiplier(23);
		multiplicationObj.getMultiplication();
		multiplicationObj.displayMultiplication();
		
	}
}

class SumII {

	private int augend;

	private int addend;

	private int addedValue;

	public void setAugend(int augend) {

		this.augend = augend;
	}

	public void setAddend(int addend) {

		this.addend = addend;
	}

	public void getSum() {

		addedValue = augend + addend;
	}

	public void displaySum() {

		System.out.printf("Sum of AUGEND %d and ADDEND %d is: %d \n", augend, addend, addedValue);
	}

}

class Multiplication extends SumII{

	private int multiplicand;

	private int multiplier;

	private int multiplicationValue;

	public void setMultiplicand(int multiplicand) {

		this.multiplicand = multiplicand;
	}

	public void setMultiplier(int multiplier) {

		this.multiplier = multiplier;
	}

	public void getMultiplication() {

		this.multiplicationValue = multiplicand * multiplier;
	}

	public void displayMultiplication() {

		System.out.printf("Multiplication of Multiplier %d and Multiplicand %d is: %d\n", multiplicand, multiplier,
				multiplicationValue);
	}
}