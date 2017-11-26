package com.mistertandon.core.java.oops.concept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0180Exception {

	public static void main(String[] args) {

		int dividend;

		int divisor;

		try {

			BufferedReader bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));

			dividend = Integer.parseInt(bufferedReaderObj.readLine());
			divisor = Integer.parseInt(bufferedReaderObj.readLine());

			Divide divideObj = new Divide(dividend, divisor);

			divideObj.makeDivision();
			divideObj.displayQuotient();

		} catch (IOException e) {

			System.out.println("Arithmetic Eception occur.");
		} catch (ArithmeticException e) {

			System.out.println("Arithmetic Eception occur.");
		} catch (Exception e) {

			System.out.println("General Eception occur.");
		}

	}
}

class Divide {

	private int dividend;

	private int divisor;

	private int quotient;

	public Divide(int dividend, int divisor) {

		this.dividend = dividend;
		this.divisor = divisor;
	}

	public void makeDivision() {

		try {

			quotient = dividend / divisor;
		} catch (ArithmeticException e) {

			System.out.println("Arithmetic Eception occur.");
		} catch (Exception e) {

			System.out.println("General Eception occur.");
		}
	}

	public void displayQuotient() {

		System.out.printf("Quotient is : %d", quotient);
	}
}