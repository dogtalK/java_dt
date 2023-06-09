package day8.method;

public class MethodCallStackEx {
	
	/* 함수 호출 스택과 메모리
	 * 함수 호출 스택이란 메모리가 있음
	 * 함수가 호출 될 때마다 스택에 추가됨
	 * 호출이 완료되면 스택에서 제거
	 * 스택 : 위에서 추가되고 위에서 빠짐(자료구조의 일종)
	 */

	public static void main(String[] args) {
		
		method1(1);
		//method4();//재귀 메소드를 잘못 작성한 경우 StackOverFlow가 발생한다
	}

	public static void method1(int a) {
		System.out.println(a);
		method2(a);
	}
	public static void method2(int a) {
		System.out.println(a-1);
		method3();
	}
	public static void method3() {
		System.out.println("end");
	} 
	public static void method4() {
		System.out.println("a");
		method4();
	}
}
