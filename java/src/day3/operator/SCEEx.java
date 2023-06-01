package day3.operator;

public class SCEEx {

	/*단락회로편가
	 * 논리연산자를 이용하는 경우 연산자 왼쪽 값에 따라 오른쪽이 실해오디지 않고 바로 결과가 나오는것
	 * &&는 하나라도 거짓이면 거짓이기 때문에 A&&B에서 A가 거짓이면 B를 확인하지 않아도 거짓임을 알 수 있음
	 * ||는 하나라도 참이면 참이기 때문에 A||B에서 A가 참이면 B를 확인하지 않아도 참임을 알 수 있음
	 */
	
	public static void main(String[] args) {
		String str = "null";
		//str이 null이기 때문에 str.xx으로 되어있는 모든 곳에서 에러가 발생
		//그런데 && 연산자 앞에서 null체크라는 코드가 먼저있기 때문에 null인 경우에
		//앞 부분이 거짓이기 때문에 뒷부분인 문제가 되는 코드를 실행하지 않아 무사히 넘어감(SCE)
		System.out.println("Is " + str + " equal to abc?" + (str != null && str.equals("abc")));
		
		//아래 코드는 위 코드에서 순서만 변경한 코드로, 문제가 되는 코드를 먼저 실행하기 떄문에 에러(예외)가 발생
		/*System.out.println("Is " + str + " equal to abc?" + (str.equals("abc") && str != null));
		 */
	}

	/*복합 대입 연산자
	 * 연산자와 대입 연사자를 같이 써서 코드를 줄인 연산자 
	 * A = A 연산자 B;
	 * A 연산자 = B;
	 * A = A + B;
	 * A += B;
	 * 중요한 연산자는 아니지만 알아두면 편리하다
	 */
	
}
