package com.mistertandon.core.java.oops.concept;

public class A0070PolymorphismOverloading {

	public static void main(String[] args) {

		PrinterI printerObj = new PrinterI("Hello everyone");
		
		printerObj.displayText();
		printerObj.displayText("Hello Everyone, how is going on.");
	}

}

class PrinterI {

	String text;

	public PrinterI(String text) {

		this.text = text;
	}

	public void displayText() {

		System.out.println("Default STRING value: " + text);
	}

	public void displayText(String text) {

		this.text = text;

		System.out.println("String passed by USER: " + this.text);
	}
}
