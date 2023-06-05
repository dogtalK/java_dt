package day4.homework;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		/* 세 변의 길이를 입력 받아 세 변으로 삼격형을 만들 수 있는지 확인하는 코드를 작성하세요.
		 * 세 변 중 작은 두변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input num1");
		int a = sc.nextInt();
		System.out.println("input num2");
		int b = sc.nextInt();
		System.out.println("input num3");
		int c = sc.nextInt();
		int max;
		
		if(a>b) {
			if(a>c) {
				max = a;
			}else {
				max = c;
			}
		}else if(b>c) {
			max = b;
		}else {
			max = c;
		}
		//max = a > b ? (a > c ? a: c) : (b > c ? b : c);
		
		if(a + b + c - max > max) {
			System.out.println("able to create triangle");
		}else {
			System.out.println("unable to create triangle");
		}
		
		
		sc.close();
	}

}
