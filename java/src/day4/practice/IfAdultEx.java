package day4.practice;

import java.util.Scanner;

public class IfAdultEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input age");
		int age = sc.nextInt();
		if(age >= 20) {
			System.out.println(age + " is adult");
		}else {
			System.out.println(age + " is minor");
		}
		sc.close();

	}
	
	
}
