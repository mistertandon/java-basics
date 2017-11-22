
public class A00210Class {

	public static void main(String[] args) {

		Sum sumObjA = new Sum();
		sumObjA.toteUp();
		sumObjA.displaySum();

		Sum sumObjB = new Sum(5);
		sumObjB.toteUp();
		sumObjB.displaySum();

		Sum sumObjC = new Sum(3, 8);
		sumObjC.toteUp();
		sumObjC.displaySum();

	}
}

class Sum {

	int augend;

	int addend;

	int total;

	public Sum() {

		total = addend = augend = 0;
	}

	public Sum(int arg) {

		augend = addend = arg;
		total = 0;
	}

	public Sum(int augend, int addend) {

		this.augend = augend;
		this.addend = addend;

		total = 0;
	}

	public void toteUp() {

		total = augend + addend;
	}

	public void displaySum() {

		System.out.printf("Sum of augend: %d, addend: %d is = %d\n", augend, addend, total);

	}

}
