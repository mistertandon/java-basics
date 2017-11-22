package com.mistertandon.core.java.oops.concept;

public class A00231StaticCounter {

	public static void main(String[] args) {
		
		InstanceCounter instA = new InstanceCounter();
		InstanceCounter instB = new InstanceCounter();
		InstanceCounter instC = new InstanceCounter();
		
		System.out.printf("Total %d instances have been created till now.", InstanceCounter.counter);
	}

}

class InstanceCounter{
	
	public static int counter = 0;
	
	public InstanceCounter() {
		
		counter++;
	}
	
	
}
