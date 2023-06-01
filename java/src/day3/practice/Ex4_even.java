package day3.practice;

import java.util.Scanner;

public class Ex4_even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number");
		
		int num = sc.nextInt();
		if(num%2 == 1) {
			System.out.println(num + " is an odd number");
		}
		if(num%2 == 0) {
			System.out.println(num + " is an even number");
		}
		
		sc.close();
	}

}
