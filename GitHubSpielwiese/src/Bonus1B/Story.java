package Bonus1B;

public class Story {

	/*
	 * Write a program that counts up with a for loop from 1 to 50 (including 50).
  - Each time the current number is divisible by 3, the program should output ding in a separate line on the screen. 
  - If the number is divisible by 7, the program should output dong in a separate line on the screen. 
  - If a number is divisible by both 3 and 7, the output ding-dong should be generated in one line instead of ding or dong. 
  - If the number is not divisible by 3 or 7, ping should be displayed in one line on the screen. 
	 */
	
	
	
	public static void main(String[] args) {
		for(int i = 1; i<=50; i++) {
			if(i%3 == 0 && i%7 == 0) {
				System.out.println("ding-dong");
				}else if(i%7 != 0 && i%3 != 0) {
					System.out.println("ping");
			}else if(i%3 == 0){
				System.out.println("ding");
			}else if(i%7 == 0) {
				System.out.println("dong");
			}else{
				System.out.println("KEIN FALL TRIFFT ZU. ZAHL: " + i);
			}
		}

	}

}
