package day3.operator;

public class ConditionalEx {

	/* 조건연산자
	 * 삼항 연산자
	 * 나중에 배울 조건문으로 대체 가능
	 * 코드를 간결하게 해줌
	 * (조건식) ? 참일 때 값 : 거짓을 떄 값
	 * 중요한 연산자는 아니지만 알아두면 코드를 간결하게 작성할 수 있다.
	 * 조건식 : 결과값이 참 또는 거짓이 되는 식
	 */

	public static void main(String[] args) {
		//나이가 20살 이상이면 성인, 아니면 미성년자를 출력하는 코드를 작성하세요.
		int age = 30;
		String str;
		str = age >= 20 ? "adult" : "minor";
		System.out.println(age + " years old is a " + str);
		
		/*비트 연산자
		 * 변수 또는 값을 비토로 나열 한 후 각 비트별로 논리 연산을 함
		 * &, |, ~, ^
		 * 12 & 5 == 4		12 | 5 = 13		~5 == -6		12 ^ 5 == 9
		 * 1100				1100			0101			1100
		 * 0101				0101							0101
		 * 0100				1101			1010 = -6		1001
		 */
		/*비트 이동 연산자
		 * <<, >>
		 * 변수 또는 값을 비트로 이동
		 * << : 왼쪽으로 이동, 2^n으로 곱한 효과 ,0으로 채움
		 * >> : 오른쪽으로 이동, 2^n으로 나눈 효과 ,부호비트로 채움
		 * >>> : 오른쪽으로 이동, 2^n으로 나눈 효과 ,0으로 채움
		 */

	}

}
