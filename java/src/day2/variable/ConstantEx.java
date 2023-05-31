package day2.variable;

public class ConstantEx {
	
	/* 변수 명명 규칙(필수)
	 * 1. 대소문자 구분
	 * num과 NUM은 다른 변수
	 * 2. 예약어 사용 불가
	 * int int; //불가능
	 * 3. 숫자로 시작 안됨
	 * int 1num; //불가능
	 * int num1; //가능
	 * 4. 특수문자는 _와 $만 가능
	 * int _num; //가능
	 * int #num; //불가능
	 * 5. 변수명 중복 선언 불가능
	 * int num; 
	 * int num; //위에서 이미 선언해서 불가능
	*/
	
	/* 변수 명명 관례(선택)
	 * 변수명의 첫 글자는 소문자로 시작
	 * 여러 단어로 된 경우 두번째 단어부터 첫글자만 대문자로(카멜표기법)
	 * - totalCount
	 * 상수는 대문자로 하며, 단어 구분을 _로 함
	 * - MAX_AGE
	 * 클래스 명의 첫 글자는 대문자로 시작
	*/

	/* 변수, 상수, 리터럴
	 * 변수 - 하나의 값을 저장하는 공간
	 * 상수 - 값을 저장 후 수정할 수 없는 공간(한번만 저장)
	 * 리터럴 - 그 자체로 값을 의미
	 * int score = 95;
	 * - score : 변수, 95 : 리터럴
	 * final int MAX_AGE = 100; //선언과 동시에 반드시 초기화하는 것이 좋다
	 * - MAX_AGE : 상수, 100 : 리터럴
	*/

	public static void main(String[] args) {
		final int MAX_AGE;
		//MAX_AGE : 상수, 100 : 리터럴
		MAX_AGE = 100;
		//MAX_AGE = 101; //에러 발생. 1번 초기화 한 후 수정하려고 했기 때문에
		System.out.println(MAX_AGE);
		
		//지역 변수는 자동으로 초기화가 안됨
		//int totalCount;
		//System.out.println(totalCount); 
		//totalCount 변수가 초기화 되어있지 않기 때문에 사용이 불가능 => 에러 발생
		int totalCount = 100;
		System.out.println(totalCount); 
		
		
	}

}
