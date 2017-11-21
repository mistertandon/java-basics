
public class A00200Vargs {

	public static void main(String[] args) {

		Display displayObj = new Display();
		displayObj.show(34, 97, 102);

	}
}

class Display {

	public void show(int... digitsArr) {

		for (int digits : digitsArr) {

			System.out.println("Passed arguments is: " + digits);
		}
	}
}
