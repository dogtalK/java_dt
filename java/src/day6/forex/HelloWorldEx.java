package day6.forex;

public class HelloWorldEx {
	
	/* for문
	 * for(초기화;조건식;증감식{
	 * 		실행문;
	 * }
	 * 초기화
	 * -for문 실행 시 처음 1번만 실행
	 * -변수를 초기화 하는 곳
	 * -변수 선언도 가능하지만 for문에서만 사용 가능
	 * -생략 가능
	 * -주로 조건식에서 사용하는 변수나 반복문에서 사용하는데 초기값이 필요한 변수를 초기화 함
	 * 조건식
	 * -dor문을 이용하여 반복을 할지 말지를 결정하는 곳
	 * -조건식이 true면 반복, false면 반복문 종료
	 * -조건식이 true면 실행문으로 이동
	 * -생략 가능. 생략하면 항상 true
	 * 증감식
	 * -조건식에서 사용하는 변수를 증가하거나 감소하게 하는 식이 있는 곳
	 * -실행문 완료 후 증감식으로 이동
	 * -증감식이 종료 후 조건식으로 이동
	 * -생략 가능
	 */

	public static void main(String[] args) {
		// for문을 이용하여 Hello world를 5번 출력하는 예제
		
		int i;
		
		for(i = 1; i <= 5; i++) {
			System.out.println("Hello world");
		}
		
		System.out.println("==================");
		i=1;
		while(i <= 5) {
			System.out.println("Hello world");
			i++;
		}

	}
/* 중첩 반복문
 * 반복문의 실행문으로 반복문이 오는 경우
 * for(초기화;조건식;증감식{
 * 		for(초기화;조건식;증감식{
 * 				실행문;
 * 		}
 * }
 * 외부 반복문이 1번 실행될 때 내부 반복문이 여러번 실행 어렵다. 
 */
}
