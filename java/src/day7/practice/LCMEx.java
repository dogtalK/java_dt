package day7.practice;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수의 최소공배수를 구하는 코드 작성하세요
		
		Scanner sc = new Scanner(System.in);
		int i, num1, num2, min;
		System.out.println("input number 1, 2");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>=num2) {
			min = num2;
		}else {
			min = num1;
		}
		
		for(i=2; i <= min; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break;
			}
		}

		sc.close();	
	}

}
