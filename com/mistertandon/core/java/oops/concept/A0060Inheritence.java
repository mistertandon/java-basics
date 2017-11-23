package com.mistertandon.core.java.oops.concept;

public class A0060Inheritence {

	public static void main(String[] args) {

		AddMulSub addMulSubObj = new AddMulSub(7, 5);

		addMulSubObj.getSum();
		addMulSubObj.displaySum();

		addMulSubObj.getMultiplication();
		addMulSubObj.displayMultiplication();
		
		addMulSubObj.getSubtrahend();
		addMulSubObj.displaySubtraction();		

	}
}

class Addition {

	public int operandA;

	public int operandB;

	public int result;

	public Addition(int augend, int addend) {

		operandA = augend;
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
	
	public AddMul(int operandA, int operandB) {
		
		super(operandA, operandB);
	}
	
	public void getMultiplication() {

		result = operandA * operandB;
	}

	public void displayMultiplication() {

		System.out.printf("Multiplication of Multiplier %d and Multiplicand %d is: %d\n", operandA, operandB, result);
	}
}

class AddMulSub extends AddMul {

	public AddMulSub(int operandA, int operandB) {
		
		super(operandA, operandB);
	}
	
	public void getSubtrahend() {

		result = operandA - operandB;
	}

	public void displaySubtraction() {

		System.out.printf("Subtraction of Minuend %d and Subtrahend %d is: %d\n", operandA, operandB, result);
	}
}