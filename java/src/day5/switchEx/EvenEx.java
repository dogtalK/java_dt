package day5.switchEx;

public class EvenEx {
	
	/*switch문
	 * switch(변수 또는 식){
	 * case 값1:
	 * 		실행문1
	 * 		break;
	 * case 값2:
	 * 		실행문2
	 * 		break;
	 * case 값3:
	 * 		실행문3
	 * }
	 * 값에 들어갈수 있는 자료형은 정수, 문자, 문자열만 가능. 실수 불가능
	 * switch문에서 break가 없으면 밑에 있는 case에 있는 실행문이 실행됨
	 * break를 이용하면 실행문이 같은 값들을 묶어서 처리할 수 있음
	 * case 값1: case 값2: case 값3:
	 * 		실행문1;
	 * 조건이 변수가 특정 값일 때 처리하는 경우 사용
	 */

	public static void main(String[] args) {

		int num = 4;
		switch(num % 2) {
		case 0:
			System.out.println(num + " is a even number");
			break;
		default:
			System.out.println(num + " is a odd number");
			
		}
	}

}
