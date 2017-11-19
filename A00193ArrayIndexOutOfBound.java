import java.util.Random;

public class A00193ArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		int arrayCont[] = new int[5];
		Random randomObj = new Random();
		
		for (int iterationInit = 0; iterationInit < arrayCont.length; iterationInit++) {

			arrayCont[iterationInit] = randomObj.nextInt(1000);
		}
		
		try {

			System.out.println("arrayCont array 6th index value is : " + arrayCont[6]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		}

	}
}
