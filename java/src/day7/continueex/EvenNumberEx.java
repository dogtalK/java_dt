package day7.continueex;

public class EvenNumberEx {
	
	/* continue문
	 * 스킵이라고 생각하면 됨
	 * -지정된 위치로 이동
	 * 지정된 위치란?
	 * for문에서는 증감식, while문, do-while문은 조건식
	 * continue을 반복문에서 사용하려면 반드시 if문과 같이 나옴
	 * 가끔 사용
	 */
	/* break문
	 * 조건을 만족할 때 반복문을 빠져나오게 할 때 사용
	 * if문과 같이 사용
	 * 자주 사용
	 */

	public static void main(String[] args) {
		// continue문을 이용한 10이하 짝수 출력 예제
		int i;
		for(i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
