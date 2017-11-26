package com.mistertandon.core.java.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0010Exception {

	public static void main(String[] args) throws IOException {

		int dividend;

		int divisor;

		BufferedReader bufferedReaderObj = null;

		try {

			bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the value of DIVIDEND: ");
			dividend = Integer.parseInt(bufferedReaderObj.readLine());

			System.out.println("Enter the value of DIVISOR: ");
			divisor = Integer.parseInt(bufferedReaderObj.readLine());
			if (divisor > 0)
				throw new ArithmeticException("Divisor value can\'t be Zero");

			Divide divideObj = new Divide(dividend, divisor);

			divideObj.makeDivision();
			divideObj.displayQuotient();

		} catch (IOException e) {

			System.out.println("IO Eception occur.");
		} catch (ArithmeticException e) {

			System.out.println(e);
		} catch (Exception e) {

			System.out.println("General Eception occur.");
		} finally {

			bufferedReaderObj.close();
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

		quotient = dividend / divisor;
	}

	public void displayQuotient() {

		System.out.printf("Quotient is : %d", quotient);
	}
}