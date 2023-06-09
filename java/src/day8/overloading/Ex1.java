package day8.overloading;

public class Ex1 {
	
	/* 함수가 기능이면 메서드는 객체에 있는 기능
	 * 자바에 나오는 모든 기능은 메서드
	 * 함수는 필요한 정보를 모두 매개변수로 전달
	 * 메서드는 클래스의 기능이기 때문에 일부 정보는 클래스의 멤버 변수로 가져올 수 있음
	 */
	/*메서드 오버로딩(매우 중요)
	 * 종일한 이름ㅇ의 메소드가 여러개인 경우를 메서드 오버로딩이라고 함
	 * 매개변수가 다른데 기능은 같은 경우 메서드 오버로딩을 지원하지 않으면 
	 * 같은 기능에서 이름만 다른 메서드가 여러개 만들어짐
	 * 조건(결론 : 매개변수가 다름)
	 * 1. 매개변수의 개수가 다름
	 * 2. 매개변수의 타입이 다름
	 * 예 :
	 * System.out.println(1);//printlnInt
	 * System.out.println("1");//printlnString
	 */

	public static void main(String[] args) {
		//println의 메서드 오버로딩
		System.out.println(1);
		System.out.println("1");
		System.out.println(1.1);
		System.out.println('c');
		System.out.println(sum(1, 1));
		System.out.println(sum(1.1, 1));
		System.out.println(sum(1, 1.1));
		System.out.println(sum(1.1, 1.1));
		System.out.println(sum(1, 2, 3));
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	//매개변수의 타입이 다른 경우
	public static double sum(double num1, int num2) {
		return num1 + num2;
	}
	public static double sum(int num1, double num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	//매개변수의 개수가 다른 경우
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	/*
	 * 리턴 타입만 다른 메서드는 오버로딩이 될 수 없다.
	public static double sum(int num1, int num2) {
		return num1 + num2;
	}
	*/
}
