package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		// 정수 num를 입력받아 num가 소수인지 아닌지를 판별하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number");
		int num = sc.nextInt();
		
		int i = 1;
		int count = 0;
		while(i <= num) {
			if(num % i == 0) {
				count++;
			}
			i++;
		}
		
		if(count == 2) {
			System.out.println(num + "is a prime number");
		}else {
			System.out.println(num + "is not a prime number");
		}
		
		sc.close();
	}

}
