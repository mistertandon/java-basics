package com.mistertandon.core.java.oops.concept;

public class A0070PolymorphismOverriding {

	public static void main(String[] args) {

		DrumPrinter printerObj = new DrumPrinter("Hello everyone");
		
		printerObj.displayText();
	}

}

class PrinterII {

	String text;

	public PrinterII(String text) {

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

class DrumPrinter extends PrinterII {

	public DrumPrinter(String text) {
		
		super(text);
	}

	public void displayText() {

		System.out.println("Drum printer prints: " + text);
	}
}