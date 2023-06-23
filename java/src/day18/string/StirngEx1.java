package day18.string;

public class StirngEx1 {
	
	/* String 클래스
	 * - 문자열을 관리하는 클래스로 멤버로 char 배열을 상수로 가짐.(p.370)
	 * - String 클래스는 문자열을 이어 붙이면 기존 문자열에 추가된 문자열을 이어 붙이는게 아니라 두 문자열이 
	 * 이어 붙여진 새로운 리터럴 문자열을 생성한 후 연결
	 */
	
	/* String 클래스 메서드
	 * - char charAt(int index) : index 번지에 있는 문자를 반환
	 * - boolean equals(Object object) : 두 문자열이 같은지를 반환
	 * - int indexOf(String str) : 문자열에서 str이 있으면 위치를 반환
	 * - int length() : 길이를 반환
	 * - String replace(CharSequence target, CharSequence replacement) : target을
	 * replacement로 교체한 새로운 문자열 반환
	 */

	public static void main(String[] args) {
		/* 문자열 관련 메서드*/
		//indexOf : 기준 문자열에서 검색 문자/문자열을 왼쪽부터 검색해서 처음으로 만나는 위치를 반환
		String str = "hello world";
		
		//str에서 7번지부터 wo가 있는지 확인. orld에서 wo가 있는지 확인 => 없음 => -1
		int index = str.indexOf("wo", 7);
		System.out.println(str + "에서 7번지부터 " + "wo" + "가 있나요?" + index);

		index = str.indexOf("wo");
		System.out.println(str + "에서 0번지부터 " + "wo" + "가 있나요?" + index);
		
		index = str.indexOf("o");
		System.out.println(str + "에서 0번지부터 " + "o" + "가 있나요?" + index);
		
		//contains : 기준 문자열에서 검색 문자/문자열이 있는지 없는지를 알려줌
		boolean result = str.contains("o");
		System.out.println(str + "에서 0번지부터 " + "o" + "가 있나요?" + result);
		
		System.out.println(str + "의 길이는? " + str.length());
		
		//replace : 특정 문자/문자열을 바꿀때 사용.모두
		//replaceAll : 정규표현식에 맞는 모든 문자/문자열을 수정
		String str2 = str.replace(" ", ",");
		System.out.println(str2);
		
		//substring : 부분 문자열 추출
		String str3 = str.substring(6);
		System.out.println(str + " 에서 6번지부터 가져온 부분 문자열 : " +str3);
		
		//lastIndexOf : 기준 문자열에서 검색 문자/문자열을 오른쪽부터 검색해서 처음으로 만나는 위치를 반환
		index = str.lastIndexOf("o");
		System.out.println(str + "에서 0번지부터 " + "o" + "가 오른쪽부터 있나요?" + index);
		
		//toLowerCase : 소문자로
		System.out.println(str + " : 소문자 : " + str.toLowerCase());
		//toUpperCase : 대문자로
		System.out.println(str + " : 대문자 : " + str.toUpperCase());
		
		//trim 시작문자(ㅁ) 전 공백,마지막문자(f) 후 공백을 제거, 사이에 있는 공백은 제거 못함
		String str4 = "\n\t\tabc\t\tdef\t\n";
		System.out.println(str4);
		
		//split : 구분자를 기준으로 문자열을 추출해서 순서대로 배열에 저장
		String str5 = "사과,배,포도";
		String fruits[] = str5.split(",");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
