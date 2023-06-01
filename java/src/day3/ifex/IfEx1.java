package day3.ifex;

public class IfEx1 {
	
	/* 조건문 종류
	 * if문
	 * - 모든 조건문은 if문으로 표현 가능
	 * switch문
	 * 특정 상황에서 사용하면 코드의 가독성이 좋음
	 */
	
	/* if문
	 * if(조건식){
	 * 	실행문;
	 * }
	 * 조건식이 참일 때 실행문을 싱행
	 * 거짓이면 아무것도 안함
	 */

	public static void main(String[] args) {
		//정수 num가 0이면 0입니다라고 출력하는 코드를 작성하세요.
		//정수 num가 0이다
		//정수 num가 0과 같다
		int num = 10;
		if(num == 0) {
			System.out.println(num + " is 0");
		}
		//정수 num가 0이 아니면 num is not 0라고 출력하는 코드를 작성하세요.
		
		if(num != 0) {
			System.out.println(num + " is not 0");
		}
	}

}
