import java.util.Random;

public class A00196JaggedArray {

	public static void main(String[] args) {

		int rowsCount = 3;
		
		int arrayCont[][] = new int[rowsCount][];
		arrayCont[0] = new int[4];
		arrayCont[1] = new int[3];
		arrayCont[2] = new int[2];
		
		Random randomObj = new Random();

		for (int rowsInit = 0; rowsInit < rowsCount; rowsInit++) {

			for (int coulmnsInit = 0; coulmnsInit < arrayCont[rowsInit].length; coulmnsInit++) {

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
