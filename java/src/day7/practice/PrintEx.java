package day7.practice;

public class PrintEx {

	public static void main(String[] args) {
		//println() 원하는 값을 출력한후 엔터까지 입력
		System.out.println("abc");
		System.out.println("ab");
		System.out.println("a");
		//print() 원하는 값을 출력 \n는 엔터역활
		System.out.print("abc\n");
		System.out.print("ab");
		System.out.print("a");
		//printf() 문자열 형태로 만들어서 출력. 서식문자를 이용
		System.out.printf("String: %s\n", "abc");
		System.out.printf("Integer: %d\n", 1);
		System.out.printf("Char: %c\n", 'a');
		System.out.printf("double: %.2f\n", 3.141592);
	}

}
