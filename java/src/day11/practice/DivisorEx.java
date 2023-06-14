package day11.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		// 정수 num 의 약수들을 배열에 저장하는 코드를 작성하세요 약수는 최대 10까지 저장
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number");
		int num = sc.nextInt();
		
		int arr[] = new int[10];
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				arr[count] = i;
				count++;
			}
			if(count == arr.length) {
				break;
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
