package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요.
		// 서로소 : 최대 공약수가 1인 두 수의 관계
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number 1, 2");
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int max;
		if(num1 >= num2) {
			max = num2;
		}else {
			max = num1;
		}
		
		int i = 1;
		int count = 0;
		while(i <= max) {
			if(num1 % i == 0 && num2 % i == 0 ) {
				count++;
			}
			i++;
		}
		
		if(count == 1) {
			System.out.println("Disjoint");
		}else {
			System.out.println("not Disjoint");
		}
		sc.close();
	}
	
}
