
public class A00220ObjectPassing {

	public static void main(String[] args) {

		Paper paperObj = new Paper();
		paperObj.setPaperText(" I\'m going learn JAVA and will make recognizable impact over project.");

		Printer printerObj = new Printer();
		printerObj.printText(paperObj);
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

		System.out.println(paperObject.getPaperText());
	}
}
