package com.mistertandon.core.java.oops.concept;

public class A0060Inheritence {

	public static void main(String[] args) {

		AddMulSub addMulSubObj = new AddMulSub();

		addMulSubObj.setOperandA(4);
		addMulSubObj.setOperandB(45);
		addMulSubObj.getSum();
		addMulSubObj.displaySum();

		addMulSubObj.setOperandA(2);
		addMulSubObj.setOperandB(23);
		addMulSubObj.getMultiplication();
		addMulSubObj.displayMultiplication();
		
		addMulSubObj.setOperandA(20);
		addMulSubObj.setOperandB(2);
		addMulSubObj.getSubtrahend();
		addMulSubObj.displaySubtraction();		

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