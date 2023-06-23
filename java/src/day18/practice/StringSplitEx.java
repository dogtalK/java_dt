package day18.practice;

import java.util.Scanner;

public class StringSplitEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		
		/*
		String text = sc.nextLine();
		int count = 0;
		String str[] = text.split(" ");
		
		for(String str1 : str) {
			count++;
		}
		System.out.println("word : " + count);
		*/
		
		String str = sc.nextLine();
		
		//공백을 기준으로 단어들 배열에 저장
		String words[] = str.split(" ");
		
		//개수 출력
		System.out.println("Word : " + words.length);
		
		sc.close();
	}

}
