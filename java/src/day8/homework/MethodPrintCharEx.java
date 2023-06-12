package day8.homework;

public class MethodPrintCharEx {

	public static void main(String[] args) {
		//다음과 같이 출력하기 위한 코드를 작성하세요
		//*****
		//***
		//?????
		//^^^^^^^
		//한줄씩 출력하는 메서드를 만들어라
		
		PrintString("*****");
		PrintChar('*', 5);
		System.out.println("");
		PrintChar('*', 5 , '\n');
		PrintChar('=', 6 , '\n');
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		int num = 5;
		for(int i = 1; i <=num; i++) {
			//공백이 num - i개 출력
			PrintChar(' ', num - i);
			//*이 i개 출력 후 엔터
			PrintChar('*', i , '\n');
		}

	}
	
	/** 산술 결과를 출력하는 코드
	 *  매개변수 : 문자열 => String str
	 *  리턴타입 : 없음 => void
	 *  메서드명 : PrintString
	 */
	public static void PrintString(String str) {
		System.out.println(str);
	}
	
	/** 산술 결과를 출력하는 코드
	 *  매개변수 : 문자와 개수 => char ch, int count
	 *  리턴타입 : 없음 => void
	 *  메서드명 : PrintChar
	 */
	public static void PrintChar(char ch, int count) {
		for(int i = 1; i <= count; i++) {
			System.out.print(ch);
		}
	}
	
	/** 산술 결과를 출력하는 코드
	 *  매개변수 : 문자와 개수, 마지막 문자 => char ch, int count char lastch
	 *  리턴타입 : 출력된 문자열 = > String
	 *  메서드명 : PrintChar
	 *  메서드 오버로딩으로 printChar 메서드 추가
	 */
	public static String PrintChar(char ch, int count, char lastch) {
		String str = "";
		for(int i = 1; i <= count; i++) {
			System.out.print(ch);
			str += ch;
		}
		System.out.print(lastch);
		str += lastch;
		return str;
	}
}
