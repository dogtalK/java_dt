package day2.variable;

public class StringEx {
	
	/* 참조형 - String
	 * String 클래스 : 문자열을 저장하는 클래스로 다양한 기능을 제공
	 * ""를 이용하여 문자열을 관리
	 * 문자열은 문자 0개 이상 가능
	 * 참조변수는 null을 이용하여 비어 있다는 것을 나타냄
	 * 빈 문자열 => 화장실에 휴지가 있는데 휴지심만 있는 경우
	 * null => 화자일에 휴지가 없는 경우
	*/

	public static void main(String[] args) {
		/* String 클래스는 문자열을 수정하는게 아니라 새로 생성 */
		String str1 = null;
		String str2 = "";
		String str3 = "A"; //char ch = 'A';와 다름
		String str4 = "안녕하세요";
		System.out.println(str1);
		System.out.println(str2);//null이라는 문자열이 아님
		System.out.println(str3);
		System.out.println(str4);
		
		
	}

}
