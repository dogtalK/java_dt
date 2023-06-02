package day4.practice;

import java.util.Scanner;

public class IfArithmericEx {

	public static void main(String[] args) {
		//1 + 2[엔터]
		//1 + 2 = 3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 2nums and arithmetic operator");
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2;
		int mod = num1 % num2;
		
		if(op == '+') {
			System.out.println(""+ num1 + op + num2 + "=" + sum /*(num1 + num2)*/);
		}else if(op == '-') {
			System.out.println(""+ num1 + op + num2 + "=" + sub /*(num1 - num2)*/);
		}else if(op == '*') {
			System.out.println(""+ num1 + op + num2 + "=" + mul /*(num1 * num2)*/);
		}else if(op == '/') {
			System.out.println(""+ num1 + op + num2 + "=" + div /*((double)num1 / num2)*/);
		}else if(op == '%') {
			System.out.println(""+ num1 + op + num2 + "=" + mod /*(num1 % num2)*/);
		}else {
			System.out.println("input error");
		}
		
		sc.close();
	}

}
