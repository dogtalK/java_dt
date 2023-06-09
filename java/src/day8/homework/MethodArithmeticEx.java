package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자를 입력 받은 산술 연산 결과를 출력하는 코드를 작성하세요
		// 연산자 오류나 0으로 나누는 경우는 없다고 가정
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input num 1, 2 and arithmetic");
		
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		char ch = sc.next().charAt(0);
		
		System.out.println("" + num1 + ch + num2 + " = " + arith(num1, num2, ch));
		
		sc.close();
	}
	/** 산술 결과를 출력하는 코드
	 *  매개변수 : 정수, 산술 연산자 => int, char
	 *  리턴타입 : 정수 => int
	 *  메서드명 : arith
	 */
	public static double arith(int num1, int num2, char ch) {
		int result = 0;
		switch(ch) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}
		
		return result;
	}
}
