package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		//두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number1");
		int num1 = sc.nextInt();
		System.out.println("input number1");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
			//int max = num1;
		}else if(num1 < num2) {
			System.out.println(num2);
			//int max = num1;
		}else {
			System.out.println("It's the same number");
		}
		//System.out.println("The greater number of "+ num1 +" or " + num2 + " is " + max);
		
		//max = num1 >= num2 ? num1 : num2
		//System.out.println("The greater number of "+ num1 +" or " + num2 + " is " + max);
		sc.close();
	}

}
