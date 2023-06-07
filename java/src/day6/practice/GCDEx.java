package day6.practice;

import java.util.Scanner;

public class GCDEx {

	public static void main(String[] args) {
		//  두 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("input number1,2");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int i = 1;
		int gcd = 0;
		
		int min;
		if(num1 >= num2) {
			min = num2;
		}else {
			min = num1;
		}
		
		while(i <= min) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		
		System.out.println(gcd);
		sc.close();
	}

}
