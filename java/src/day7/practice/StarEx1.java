package day7.practice;

public class StarEx1 {

	public static void main(String[] args) {
		
		/* ***** i = 1 * = 5
		 * ***** i = 2 * = 5
		 * ***** i = 3 * = 5
		 * ***** i = 4 * = 5
		 * ***** i = 5 * = 5
		 */
		int i;
		int j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++){
				System.out.print('*');
			}
			System.out.println("");
		}
	}

}
