package Exceptions;

public class ExceptionPractice {

	public ExceptionPractice() {
		int[] testArray = new int[3];
		
		testArray[0] = 1;
		testArray[1] = 2; 
		testArray[2] = 3; 
		
		try{
			for(int i = 0; i <= 3; i++) {
				System.out.println(testArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array zu kurz");
		}
	}

}
