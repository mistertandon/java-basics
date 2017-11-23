package com.mistertandon.core.java.oops.concept;

public class A0060Inheritence {

	public static void main(String[] args) {

		AddMulSub addMulObj = new AddMulSub();

		addMulObj.setOperandA(4);
		addMulObj.setOperandB(45);
		addMulObj.getSum();
		addMulObj.displaySum();

		addMulObj.setOperandA(2);
		addMulObj.setOperandB(23);
		addMulObj.getMultiplication();
		addMulObj.displayMultiplication();
		
		addMulObj.setOperandA(20);
		addMulObj.setOperandB(2);
		addMulObj.getSubtrahend();
		addMulObj.displaySubtraction();		

	}
}

class Addition {

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

class AddMul extends Addition {

	public void getMultiplication() {

		result = operandA * operandB;
	}

	public void displayMultiplication() {

		System.out.printf("Multiplication of Multiplier %d and Multiplicand %d is: %d\n", operandA, operandB, result);
	}
}

class AddMulSub extends AddMul {

	public void getSubtrahend() {

		result = operandA - operandB;
	}

	public void displaySubtraction() {

		System.out.printf("Subtraction of Minuend %d and Subtrahend %d is: %d\n", operandA, operandB, result);
	}
}