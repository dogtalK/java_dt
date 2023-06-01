package day3.practice;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number");
		
		double num = sc.nextDouble();
		if(num == 0) {
			System.out.println(num + " is 0");
		}
		if(num > 0) {
			System.out.println(num + " is a positive number");
		}
		if(num < 0) {
			System.out.println(num + " is a negative number");
		}
		
		sc.close();

	}

}
