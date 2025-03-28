package ClassWork;

public class IncrementalDesign {

	
	
	// The idea of this is just to compartmentalize parts so that they can be reused and keep it shorter and more readable. 
	
	public static void main(String[] args) {

		int cols = 10;
		
		printTable(cols);
		
		
		
		
		
	}//end main
	
	public static void printTable(int cols) {
		for (int i = 0; i <cols; i++) {
			printRow(i);
		}
	}
	
	
	
	
	public static void printRow(int cols) {
		for (int i = 0; i < cols; i++) {
			System.out.printf("%4d", i);
			
		}
		System.out.println();
		
	}//end printRow

}
