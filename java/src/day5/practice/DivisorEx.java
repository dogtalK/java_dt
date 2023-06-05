package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		// 정수 num를 입력받아 num의 약수를 출력하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number");
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num){
			if(num % i == 0) {
				System.out.println(i);
			}
			i++;
		}

		sc.close();
	}

}
