
public class A00161WhileLoop {
	
	public static void main(String[] args) {
		
		int iteration, iterationLimit;
		
		iteration = 1;
		iterationLimit = 10;
		
		while(iteration < iterationLimit) {
			
			System.out.println(iteration+"th iteration.");
			
			iteration++;
		}
	}
}
