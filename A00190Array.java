
public class A00190Array {

	public static void main(String[] args) {

		int arrayCont[], iterationInit, iterationLimit;

		arrayCont = new int[5];

		iterationLimit = 5;

		for (iterationInit = 0; iterationInit < iterationLimit; iterationInit++) {

			arrayCont[iterationInit] = iterationInit + 2;

			System.out.println(iterationInit + "th element value is: " + arrayCont[iterationInit]);
		}
	}
}
