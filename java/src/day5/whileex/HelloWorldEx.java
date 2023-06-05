package day5.whileex;

public class HelloWorldEx {

	/* 반복문
	 * 반복적인 일을 처리하기 위해 사용하는 것
	 * -규칙적인 작업을 반복적으로 할 때 사용
	 * -1 부터 100까지 센다
	 * 종류는 while문, do-while문, for문이 있다.
	 * -for문, while문은 상황에 따라 한번도 싱행되지 않을 수 있다.
	 * -do-while문은 반드시 한번은 실행 된다
	 */
	
	/* while문
	 * while(조건식){
	 * 		실행문
	 * }
	 * 조건식이 참일 동안에만 실행
	 * 거짓이 되는 순간 종료
	 * - 처음부터 조건식이 거짓이면 한 번도 실행 안함
	 * 조건식 생략 불가능
	 */
	
	public static void main(String[] args) {
		// hello world를 10번 출력하는 코드를 작성하세요.
		/* 반복횟수 : 10번, 1번부터 10번까지 1씩 증가
		 * 	=> 변수의 초기값 : 1
		 *  => 조건식 10까지 => 10보다 작거나 같을 때까지
		 *  => 증가하는 식 : 1씩 증가
		 * 규칙성 : Hello world를 출력
		 * 	=> 실행문
		 */
		int max = 3;
		int i = 1; //변수의 초기값 : 1
		while(i <= max) {
			System.out.println("Hello world");
			i++;
		}
		System.out.println("============================");
		
		/* 반복횟수 : i는 10부터 1까지 1씩 감소
		 *  
		 */
		i = max;
		while(i >= 1) {
			System.out.println("Hello world");
			i--;
		}
		i = max;
		while(i-- >= 1) {
			System.out.println("Hello world");
		}
	}

}
