package day3.operator;

public class ComparisonEx {
	
	/* 비교(관계)연산자
	 * 값의 크기를 비교하는 연산자
	 * >, <, >=, <=, ==, !=
	 * 항을 같은 타입으로 변환 후 비교
	 * 결과 값은 true 도는 false 
	 * 참조형에는 ==, !=만 사용 가능
	 * 문자열은 ==로 비교하면 안됨 : 문법적으로는 에러가 발생하지 않지만 두 문자열이 같은지 다를지를 제대로 비교하진 않음
	 * -str1과 str2에 리터럴 문자열 abc가 저장된 경우 ==로 판별이 됨
	 * -str1과 str2가 Scanner를 통해 입력받은 문자열 abc인 경우는 ==로 판별이 안됨
	 * -str1.equals(str2);
	 */

	public static void main(String[] args) {
		System.out.println("1 > 2 : " + (1 > 2));
		System.out.println("1 < 2 : " + (1 < 2));
		System.out.println("1 >= 2 : " + (1 >= 2));
		System.out.println("1 <= 2 : " + (1 <= 2));
		System.out.println("1 == 2 : " + (1 == 2));
		System.out.println("1 != 2 : " + (1 != 2));
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		/* str1과 str2는 리터럴 문자열 abc를 저장하고 있는 때문에 ==로 비교 가능하지만
		 * str3는 일반적으로 문자열 변수가 있는 경우 이변수에 리터럴이 들어있는지 아닌지는 알 수 없다
		 * 그래서 문자열을 ==나 !=로 비교하지 않는 것이 좋다. 
		 */
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str3 : " + (str2 == str3));
		/* 문자열을 포함한 참조변수들은 주로 equals를 이용하여 같은지 다른지를 판별 
		 */
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		//참조 변수가 ==나 !=를 쓰는 대표적인 경우는 null과 비교해서 비었는지 안비었는지 확인할 때만 사용
		System.out.println(str1 == null);
		
		
	}

}
