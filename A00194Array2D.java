import java.util.Random;

public class A00194Array2D {

	public static void main(String[] args) {
		
		int rowsCount = 3, columnsCount = 4;
		int arrayCont[][] = new int[rowsCount][columnsCount];
		Random randomObj = new Random();
		
		for (int rowsInit = 0; rowsInit < rowsCount; rowsInit++) {
			
			for (int coulmnsInit = 0; coulmnsInit < columnsCount; coulmnsInit++) {
					
				arrayCont[rowsInit][coulmnsInit] = randomObj.nextInt(300);

				System.out.println(
						"Array [" + rowsInit + "][" + coulmnsInit + "] the index value is: " + arrayCont[rowsInit][coulmnsInit]);
			}
		}

	}

}
