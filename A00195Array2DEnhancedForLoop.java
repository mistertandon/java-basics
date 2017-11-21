import java.util.Random;

public class A00195Array2DEnhancedForLoop {

	public static void main(String[] args) {

		int rowsCount = 3, columnsCount = 4;
		int arrayCont[][] = new int[rowsCount][columnsCount];
		Random randomObj = new Random();

		for (int rowsInit = 0; rowsInit < rowsCount; rowsInit++) {

			for (int coulmnsInit = 0; coulmnsInit < columnsCount; coulmnsInit++) {

				arrayCont[rowsInit][coulmnsInit] = randomObj.nextInt(300);
			}
		}

		for (int levelOneArray[] : arrayCont) {

			for (int levelTwoArray : levelOneArray) {

				System.out.printf("Element value is : %d \n", levelTwoArray);
			}
		}
	}
}
