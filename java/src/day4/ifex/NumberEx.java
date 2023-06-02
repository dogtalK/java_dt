package day4.ifex;

public class NumberEx {

	/* else if문
	 * if(조건식1){
	 * 		실행문1;
	 * }else if(조건식2){
	 * 		실행문2;
	 * }else{
	 * 		실행문3;
	 * }
	 * 조건식1 이 참이면 실행문 1을 실행
	 * 조적ㄴ식 1이 거짓이고 조건식2가 참이면 실행문2를 싱행
	 * 모두 거짓이면 실행문3을 실행
	 * else if는 여러개 나올 수 있음
	 */
	
	public static void main(String[] args) {
		/* 정수 num가 양수이면 positive number라고 출력하고
		 * num 음수면 nagative number로 출력하고
		 * num 0이면 0으로 출력하는 코드를 작성하세요.
		 */

		int num = 3;
		if(num > 0) {
			System.out.println(num + " is a positive number");
		}else if(num < 0) {
			System.out.println(num + " is a nagative number");
		}else {
			System.out.println("0");
		}
	}

}
