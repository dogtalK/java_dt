package day4.ifex;

public class EvenNumberEx {
	
	/* if else문
	 * if(조건식){
	 * 		실행문;
	 * }else{
	 * 		실행문2;
	 * }
	 * -조건식이 참일 때 실행문 1을 싱행
	 * -거직이면 실행문2를 실행
	 */

	public static void main(String[] args) {
		//if else문을 이용한 홀짝 판별 예제
		//Scanner sc = new Scanner(System.in);
		
		//int num = sc.nextInt();
		int num = 4;
		if(num % 2 == 0) {
			System.out.println(num + " is evennumber");
		}else {
			System.out.println(num + " is oddnnumber");
		}

	}

}
