package day3.quiz;

import java.util.*;

public class quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("input score");
		int score1 = sc.nextInt();
		
		String str1;
		str1 = score1 >= 60 ? "true" : "false";
		
		System.out.println("Do you pass " + score1 + " point? " + str1);
		
		System.out.println("input score");
		int score2 = sc.nextInt();
		
		String str2;
		str2 = score2 >= 60 ? "true" : "false";
		
		System.out.println("Do you pass " + score2 + " point? " + str2);
		*/

		System.out.println("input score");
		int score = sc.nextInt();
		boolean result = score >= 60;
		
		System.out.println("Do you pass " + score + " point? " + result);
		
		
		sc.close();
	}

}
