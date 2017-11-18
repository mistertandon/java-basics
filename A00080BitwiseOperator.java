class A00080BitwiseOperator{
	
	public static void main(String[] args) {
		
		int numberA = 25;
		int numberB = 15;
		int result = 0;
		
		result = numberA & numberB;
		System.out.println("Bitwise AND operator functionality.");
		System.out.printf("Result after bitwise & opeartion on %d and %d is : %d ", numberA, numberB, result);
		
		result = numberA | numberB;
		System.out.println("Bitwise OR operator functionality.");
		System.out.printf("Result after bitwise | opeartion on %d and %d is : %d ", numberA, numberB, result);
	}
}