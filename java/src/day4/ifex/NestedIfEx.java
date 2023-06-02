package day4.ifex;

public class NestedIfEx {
	
	/*중첩 if문
	 * if(조건식1){
	 * 		if(조건식2){
	 * 		}
	 * }
	 */

	public static void main(String[] args) {
		//2, 3, 6의 배숙 판별 예제
		//day4.practice패기지에 IfMultipleEx2 문제
		
		int num =6;
		
		if(num % 2 == 0) {
			if(num % 3 ==0){
				System.out.println("A multiple of 6");
			}else {
			System.out.println("A multiple of 2");
			}
			
		}else if(num % 3 ==0) {
			System.out.println("A multiple of 3");
		}else {
			System.out.println("hello");
		}

	}

}
