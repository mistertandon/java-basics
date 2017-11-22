package com.mistertandon.core.java.conditional.operator;
class A00150Switch{
	
	public static void main(String[] args) {
		
		int passedArgument;
		
		switch(args[0]) {
			
		case "1": passedArgument = 1;
						break;
		case "2": passedArgument = 2;
						break;
		case "3": passedArgument = 3;
						break;
		default: passedArgument = 10;
						break;
		}
		
		System.out.print("Passed argument is: "+passedArgument);
	}
}