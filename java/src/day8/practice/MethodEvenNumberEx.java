package day8.practice;

import java.util.Scanner;

public class MethodEvenNumberEx {

	public static void main(String[] args) {
		// 정수를 입력받아 짝수인지 아닌지 판별하는 코드를 작성하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("input number");
		
		int num1 = sc.nextInt();
		
		if(even(num1) == 0) {
			System.out.println("an Even number");
		}else {
			System.out.println("an odd number ");
		}
		
		printEvenNumber(num1);
		
		if(isEvenNumber(num1)) {
			System.out.println("an Even number");
		}else {
			System.out.println("an odd number ");
		}
		
		if(isMultiple(num1,2)) {
			System.out.println("an Even number");
		}else {
			System.out.println("an odd number ");
		}
		sc.close();
	}
	public static int even(int num1) {
		return num1 % 2;
	}
	public static void printEvenNumber(int num) {
		if(num %2 == 0) {
			System.out.println("an Even number");
		}else {
			System.out.println("an odd number ");
		}
	}
	public static boolean isEvenNumber(int num) {
		return num % 2 == 0;
	}
	/** num1과 num2가 주어지면 num1이 num2의 배수인지 아닌지 알려주는 메서드
	 *  매개변수 : 두 정수 => int num1, int num2
	 *  리턴타입 : 배수인지(참) 아닌지(거짓) => boolean
	 *  메서드명 : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
