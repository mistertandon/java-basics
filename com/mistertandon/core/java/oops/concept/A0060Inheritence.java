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

	public int operandA;

	public int operandB;

	public int result;

	public void setAugend(int augend) {

		operandA = augend;
	}

	public void setAddend(int addend) {

		operandB = addend;
	}

	public void getSum() {

		result = operandA + operandB;
	}

	public void displaySum() {

		System.out.printf("Sum of AUGEND %d and ADDEND %d is: %d \n", operandA, operandB, result);
	}

}

class Multiplication extends SumII {

	public void setMultiplicand(int multiplicand) {

		operandA = multiplicand;
	}

	public void setMultiplier(int multiplier) {

		operandB = multiplier;
	}

	public void getMultiplication() {

		result = operandA * operandB;
	}

	public void displayMultiplication() {

		System.out.printf("Multiplication of Multiplier %d and Multiplicand %d is: %d\n", operandA, operandB, result);
	}
}