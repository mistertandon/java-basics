
public class A00182PatternIII {

	public static void main(String[] args) {

		int outerLoopLimit, innerLoopLimit, tempCount;

		outerLoopLimit = innerLoopLimit = 5;

		for (int outerLoopInit = 1; outerLoopInit <= outerLoopLimit; outerLoopInit++) {

			tempCount = outerLoopInit;
			for (int innerLoopInit = 1; innerLoopInit <= outerLoopInit; innerLoopInit++) {

				tempCount = tempCount > outerLoopLimit ? 1 : tempCount;
				System.out.print(tempCount + " ");

				++tempCount;
			}

			System.out.println("");

		}
	}
}
