
public class A00180PatternI {

	public static void main(String[] args) {

		int outerLoopLimit, innerLoopLimit;

		outerLoopLimit = innerLoopLimit = 5;

		for (int outerLoopInit = 1; outerLoopInit <= outerLoopLimit; outerLoopInit++) {

			for (int innerLoopInit = 1; innerLoopInit <= innerLoopLimit; innerLoopInit++) {

				System.out.print("* ");
			}

			System.out.println("");

		}
	}
}
