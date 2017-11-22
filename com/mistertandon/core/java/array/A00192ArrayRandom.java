package com.mistertandon.core.java.array;
import java.util.Random;

public class A00192ArrayRandom {

	public static void main(String[] args) {

		int arrayCont[] = new int[5];
		Random randomObj = new Random();

		for (int iterativeInit = 0; iterativeInit < arrayCont.length; iterativeInit++) {

			arrayCont[iterativeInit] = randomObj.nextInt(200);
		}

		for (int elemVal : arrayCont) {

			System.out.println("element value is: " + elemVal);
		}
	}
}
