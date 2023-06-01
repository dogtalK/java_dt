package day2.homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("문자열를 입력해주세요.");
		String str = sc.nextLine(); 
		System.out.println(str);
		*/
		
		/*System.out.println("정수1을 입력해주세요.");
		int num1 = sc.nextInt();
		
		System.out.println("산술연산자를 입력해주세요.");
		char ch= sc.next().charAt(0);
		
		System.out.println("정수2을 입력해주세요.");
		int num2 = sc.nextInt();
		
		System.out.println("" + num1 + ch + num2);
		
		sc.close();
		*/
		
		int num1, num2;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술연사자를 입력하세요(예 : 1 + 2) : ");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		System.out.println(""+num1 + operator + num2);
		
		sc.close();
	}

}
