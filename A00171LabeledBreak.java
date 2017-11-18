
public class A00171LabeledBreak {

	public static void main(String[] args) {

		int outerLoopLimit, innerLoopLimit;

		outerLoopLimit = innerLoopLimit = 5;
		
		outerBrek:
		for (int outerLoopInit = 1; outerLoopInit < outerLoopLimit; outerLoopInit++) {

			for (int innerLoopInit = 1; innerLoopInit < innerLoopLimit; innerLoopInit++) {

				if (outerLoopInit == 3)
					break outerBrek;

				System.out.print("*");

			}

			System.out.println("");

		}
	}
}