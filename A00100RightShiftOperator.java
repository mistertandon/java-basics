class A00100RightShiftOperator{
	
	public static void main(String[] args) {
		
		int numberA = 25;
		int result;
		
		result = numberA >> 3;
		/*	
		 * 	numberA << 3 i.e. binary representation of numberA will reduce by 3 bits after removing three bits on right most side.
		 * 	numberA 11001 will convert to 11
		 * 
		 */
		System.out.printf("After apply right shift operator on numberA i.e %d, it will become %d ", numberA, result);
	}
}