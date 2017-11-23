package com.mistertandon.core.java.oops.concept;

public class A0030StaticKeyword {

	public static void main(String[] args) {

		PrinterMachine.print("That is how we can call static function of a class.");
	}

}

class PrinterMachine {

	public static void print(String text) {

		System.out.println("Output of the string : " + text);
	}
}
