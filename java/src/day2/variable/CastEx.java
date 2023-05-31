package day2.variable;

public class CastEx {
	
	/*형 변환
	 * 값을 다른 자료형(변수타입)으로 변환하는 것
	 * boolean을 제외한 기본형은 변환 가능
	 * 자동 자료형 변환(묵시적) - 알아서 변환이 되는 경우
	 * 강제 자료형 변환(명시적) - 자동으로 일어나지 않거나(에러가 발생) 필요에 의해 강제로 변환해야 하는 경우
	 */
	
	/*자동 자료형 변환
	 * 정수(byte, short, int, long)를 실수(float, double)로 변환하는 경우
	 * 문자(char)를 정수(int, long)으로 변환하는 경우
	 * 바이트가 작은 자료형을 보다 큰 자료형으로 변하는 경우 자동 자료형 변환이 일어남
	 */
	
	/*강제 자료형 변환
	 * 실수(float, double)을 정수(byte, short, int, long)으로 변환하는 경우
	 * 현재 자료형의 바이트보다 작은 바이트를 가진 자료형으로 변환하는 경우
	 * 자동 자료형 변환이 일어나지만 필요에 의한 경우
	 * 변환하고자 하는 변수/리터럴/상수 앞에 (변환하려는 자료형)을 써 줌
	 * int num1 = (int)3.14;
	 * int num2 = (int)123L; //접미사 L이 붙으면 숫자 크기에 상관없이 long타입
	 * double res = (double)1/2;
	 * float num3 = (float)3.14; //접미사가 없기 때문에 double
	 */

	public static void main(String[] args) {
		//3.14는 double형 리터럴이기 때문에 int에 저장이 불가능하다. 그래서 강제형변환을 해야 한다.
		int pi = (int) 3.14;
		//3은 int형 리터럴이기 때문에 double형 변수에 저장할 수 있다. 그래서 자동현변환 된다.
		double num1 = 3;
		//123L은 long형 리터럴이기 때문에 int에 저장이 불가능 하다. 그래서 강제형변환을 해야 한다. 
		//실제 데이터 분실이 없어도 타입에 맞게 강제형변환을 해야 함.
		int num2 = (int) 123L;
		System.out.println(pi);
		System.out.println(num2);
		
		//1/2는 문법에는 문제가 없지만 원하는 결과를 얻기 위해서 강제형변환을 함.
		System.out.println(1/2);
		System.out.println((double)1/2);
		
	}

}
