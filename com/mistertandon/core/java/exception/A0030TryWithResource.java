package com.mistertandon.core.java.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A0030TryWithResource {

	public static void main(String[] args) throws Exception {

		String inputString = null;

		try (BufferedReader bufferedReaderObj = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.println("Enter input STRING: ");

			inputString = bufferedReaderObj.readLine();

			System.out.println("Input String is: " + inputString);
		}

	}
}
