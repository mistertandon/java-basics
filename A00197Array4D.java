import java.util.Random;

public class A00197Array4D {

	public static void main(String[] args) {

		int contArr[][][][] = new int[2][][][];

		contArr[0] = new int[1][][];
		contArr[1] = new int[1][][];
		contArr[0][0] = new int[2][];
		contArr[1][0] = new int[2][];
		contArr[0][0][0] = new int[10];
		contArr[0][0][1] = new int[1];
		contArr[1][0][0] = new int[3];
		contArr[1][0][1] = new int[1];

		Random randomObj = new Random();

		for (int levelOneIndex = 0; levelOneIndex < contArr.length; levelOneIndex++) {

			for (int levelTwoIndex = 0; levelTwoIndex < contArr[levelOneIndex].length; levelTwoIndex++) {

				for (int levelThreeIndex = 0; levelThreeIndex < contArr[levelOneIndex][levelTwoIndex].length; levelThreeIndex++) {

					for (int levelFourthIndex = 0; levelFourthIndex < contArr[levelOneIndex][levelTwoIndex][levelThreeIndex].length; levelFourthIndex++) {

						contArr[levelOneIndex][levelTwoIndex][levelThreeIndex][levelFourthIndex] = randomObj.nextInt(701);
						
						System.out.println(
								"Element value is: " + contArr[levelOneIndex][levelTwoIndex][levelThreeIndex][levelFourthIndex]);
					}
				}
			}
		}

	}
}
