package day6.practice;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		// n을 입력받아 1부터 n까지 짝수의 합을 구하는 코드를 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("input number");
		
		int n = sc.nextInt(), sum = 0;
		int i = 2;
		while(i <=n) {
			sum += i;
			i +=2;
		}
		System.out.println("1~"+ n + " sum :" + sum);

		sc.close();
	}

}