package com.mistertandon.core.java.oops.concept;

public class A0150AbstractClass {

	public static void main(String[] args) {

		IPhone iPhoneObj = new IPhone();
		Samsung samsungObj = new Samsung();

		showPhoneModel(iPhoneObj);
		showPhoneModel(samsungObj);

	}

	public static void showPhoneModel(Phone phoneObj) {

		phoneObj.displayModel();
	}

}

abstract class Phone {

	public String modelName;

	public abstract void displayModel();
}

class IPhone extends Phone {

	public IPhone() {

		modelName = "Phone X";
	}

	public void displayModel() {

		System.out.println("Model Name: " + modelName);
	};
}

class Samsung extends Phone {

	public Samsung() {

		modelName = "Samsung Galaxy";
	}

	public void displayModel() {

		System.out.println("Model Name: " + modelName);
	};
}