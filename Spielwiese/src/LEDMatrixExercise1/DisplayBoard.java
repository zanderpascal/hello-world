package LEDMatrixExercise1;

public class DisplayBoard {

	public int[][] ledMatrix;
	
	//constants for the lights 
	public static final int OFF = 0;
	public static final int GREEN = 1;
	public static final int RED = 2;
	public static final int ORANGE = 3;

	public DisplayBoard(){
		
	    // write your code here
		ledMatrix = new int[16][16];
		
		int height = ledMatrix.length;
		int width = ledMatrix[0].length;
		int currentColor = RED; 
		int counter = 0;
		
		
		int startX = 0;
		int startY = 0;
		
		
		for(int loopCount = 0; loopCount < 3; loopCount++) {
			switch(counter){
			case 0: currentColor = RED; 
					break;
			case 3: currentColor = ORANGE; 
					break;
			case 6: currentColor = GREEN; 
					break;
			default: currentColor = OFF; 
					break;
			}
		for(int x = startX; x < width - startX; x++) {
			for(int y = startY; y < height - startX; y++){
				ledMatrix[x][y] = currentColor;
				//System.out.print(ledMatrix[x][y]);
			}
			//	System.out.println("");
		}

		startX += 3;
		startY += 3;
		counter += 3;
		}

		
			for(int i = 0; i < width; i++) {
				for(int j = 0; j < height; j++){
			System.out.print(ledMatrix[i][j]);
				}
				System.out.println("");
			}

		
	    //TCPClient.sentToBoard(ledMatrix);
		
	}

	public static void main(String[] args) {
		new DisplayBoard();
	}

}
