package com.mistertandon.core.java.oops.concept;

public class A0060Inheritence {

	public static void main(String[] args) {

		Multiplication multiplicationObj = new Multiplication();

		multiplicationObj.setOperandA(4);
		multiplicationObj.setOperandB(45);
		multiplicationObj.getSum();
		multiplicationObj.displaySum();

		multiplicationObj.setOperandA(2);
		multiplicationObj.setOperandB(23);
		multiplicationObj.getMultiplication();
		multiplicationObj.displayMultiplication();

	}
}

class SumII {

	public int operandA;

	public int operandB;

	public int result;

	public void setOperandA(int augend) {

		operandA = augend;
	}

	public void setOperandB(int addend) {

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

	public void getMultiplication() {

		result = operandA * operandB;
	}

	public void displayMultiplication() {

		System.out.printf("Multiplication of Multiplier %d and Multiplicand %d is: %d\n", operandA, operandB, result);
	}
}