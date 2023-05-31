package day2.operator;

public class ArithmeticEx {
	
	/*연산자
	 * 연산자 : 연산에 사용하는 값
	 * 1 + 2
	 * 연산자 : +
	 * 항 1, 2
	 * 항의 개수에 따라 단항, 이항 , 삼항 연산자로 구분
	 */
	
	/*대입연산자(=)
	 * 변수에 값을 대입(저장)하는 연산자 == 변수의 값이 바뀜
	 * 오른쪽에 있는 값(식 또는 변수 또는 값)을 왼쪽에 저장 
	 * 이항 연산자 중 우선 순위가 가장 낮음
	 * => 여러 연산자가 있는 경우 연산을 모두 다 한 후 대입 연산자가 실행
	 * 왼쪽에는 변수나 상수만 올 수 있음
	 */
	
	/* 산술연산자
	 * +, - , *(곱), /(나누기), %(나머지)
	 * 1 / 2 == 0(0.5가 아님)
	 * 정수 / 정수 => 정수 (소수점이 버려질 수 있음)
	 * 정수 / 실수 => 실수
	 * 실수 / 정수 => 실수
	 * 실수 / 실수 => 실수 
	 * 상황에 따라 령변환이 필요할 수도 있음
	 */

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2; // 1/2의 결과가 0이어서, 1.0/2로 바꾸어 0.5가 나오게 함
		int mod = num1 % num2;
		
		System.out.println("" + num1 + '+' + num2 + "=" + sum);
		System.out.println("" + num1 + '-' + num2 + "=" + sub);
		System.out.println("" + num1 + '*' + num2 + "=" + mul);
		System.out.println("" + num1 + '/' + num2 + "=" + div);
		System.out.println("" + num1 + '%' + num2 + "=" + mod);
		
		int res = 0;
		//1 + res = 2; //대입연산자 = 왼쪽에 식이 와서 에러가 발생
		res = 2 - 1; //대입연산자 = 오른쪽에 식이 와서 에러 없이 잘 실행
		//1 = res - 1; //대입연산자 = 왼쪽에는 리터럴이 올 수 없음
		
		
	}

}
