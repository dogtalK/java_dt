package day8.practice;
import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {
		// 정수 num을 입력받아 2,3,6의 배수인지 아닌지 판별하는 코드를 작성하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("input number");
		/*
		int num = sc.nextInt();
		
		multiple(num);
		*/
		int num1;
		num1 = sc.nextInt();
		
		if(isMultiple(num1, 6)) {
			System.out.println("a multiple of six");
		}else if(isMultiple(num1, 3)) {
			System.out.println("a multiple of three");
		}else if(isMultiple(num1, 2)) {
			System.out.println("a multiple of two");
		}else {
			System.out.println("be not a multiple of two, three, six");
		}
		
		sc.close();
	}

	public static void multiple(int num) {
		if(num % 6 == 0) {
			System.out.println("a multiple of six");
		}else if(num % 3 == 0) {
			System.out.println("a multiple of three");
		}else if(num % 2 == 0) {
			System.out.println("a multiple of two");
		}else {
			System.out.println("be not a multiple of two, three, six");
		}
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
}
