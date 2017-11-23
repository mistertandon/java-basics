package com.mistertandon.core.java.oops.concept;

public class A0020ObjectPassing {

	public static void main(String[] args) {

		Paper paperObj = new Paper();

		Printer printerObj = new Printer();
		printerObj.printText(paperObj);

		System.out.println("Output is: " + paperObj.getPaperText());
	}

}

class Paper {

	String paperText;

	public void setPaperText(String text) {

		paperText = text;
	}

	public String getPaperText() {

		return paperText;
	}
}

class Printer {

	public void printText(Paper paperObject) {

		paperObject.setPaperText(" I\'m going learn JAVA and will make recognizable impact over project.");
	}
}
