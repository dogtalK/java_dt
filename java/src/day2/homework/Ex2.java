package day2.homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1을 입력해주세요.");
		int num1 = sc.nextInt();
		
		System.out.println("정수2을 입력해주세요.");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2; // 1/2의 결과가 0이어서, 1.0/2로 바꾸어 0.5가 나오게 함
		int mod = num1 % num2;
		
		
		System.out.println("" + num1 + "+" + num2 + "=" + sum);
		System.out.println("" + num1 + "-" + num2 + "=" + sub);
		System.out.println("" + num1 + "*" + num2 + "=" + mul);
		System.out.println("" + num1 + "/" + num2 + "=" + div);
		System.out.println("" + num1 + "%" + num2 + "=" + mod);
		
		sc.close();
	}

}
