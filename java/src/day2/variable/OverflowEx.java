package day2.variable;

public class OverflowEx {
	
	/* 오버플로우
	 * 정수 변수가 표현할 수 있는 정수의 범위를 넘어서 의도했던 값과 다르게 나오는 현상으로 양수에서 음수로 될 때
	 * byte num = 127;
	 * b = b + 1; //-128이 저장
	 * 위 코드에서 b에는 -128이 저장
	 * byte는 저장 가능한 최대 정수 127에 1을 더하면 128이 아닌 -128이 됨(128은 byte로 표현 불가능)
	 */
	
	/* 언더플로우
	 * 정수 변수가 표현할 수 있는 정수의 범위를 넘어서 의도했던 값과 다르게 나오는 현상으로 양수에서 음수로 될 때
	 * byte num = -128;
	 * b = b - 1; //127이 저장
	 * 위 코드에서 b에는 127이 저장
	 * byte는 저장 가능한 최소 정수 -128에 1을 빼면 -129이 아닌 127이 됨(-129은 byte로 표현 불가능)
	 */

	public static void main(String[] args) {
		byte num = 127;
		++num; //num에 1을 증가
		System.out.println(num); //오버플로우 발생

		num = -128;
		--num; //num에 1을 감소
		System.out.println(num); //언더플로우 발생
	}

}
