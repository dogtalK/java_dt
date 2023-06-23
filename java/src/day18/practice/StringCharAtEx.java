package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		/* input : hello world
		 * d:1
		 * e:1
		 * h:1
		 * l:3
		 * o:2
		 * r:1
		 * w:1
		 */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		
		/*
		String text = sc.nextLine();
		int countD = 0, countE = 0, countH = 0, 
				countL = 0, countO = 0, countR = 0, countW = 0;
		
		for(int i = 0; i < text.length(); i++) {
			switch(text.charAt(i)) {
			case 'd':
				countD++;
				break;
			case 'e':
				countE++;
				break;
			case 'h':
				countH++;
				break;
			case 'l':
				countL++;
				break;
			case 'o':
				countO++;
				break;
			case 'r':
				countR++;
				break;
			case 'w':
				countW++;
				break;
			}
		}
		System.out.println("d = "+ countD);
		System.out.println("e = "+ countE);
		System.out.println("h = "+ countH);
		System.out.println("l = "+ countL);
		System.out.println("o = "+ countO);
		System.out.println("r = "+ countR);
		System.out.println("w = "+ countW);
		*/
		
		int alphabet[]= new int[26];//각 알파벳 개수를 저장하는 배열 0번지 :a의 개수, 1번지 :b의 개수
		
		//입력
		String str = sc.nextLine();
		
		//반복 : 문자열 길이만큼
		for(int i = 0; i < str.length(); i++) {
			//문자열의 한글자씩 가져와서 알파벳을 확인하여 알파벳 개수를 증가
			char ch = str.charAt(i);
			//ch가 알파벳 소문자인 경우 0~25사이의 값이 나옴
			int distance = ch - 'a';
			//영문 소문자가 아닌 경우
			if(distance < 0 || distance >25){
				continue;
			}
			//맞는 경우
			alphabet[distance]++;
		}
		//알파벳 개수 추가
		for(int i = 0; i < alphabet.length; i++) {
			
			if(alphabet[i] == 0) {
				continue;
			}
			System.out.println((char)('a'+i) + " : " + alphabet[i]);
		}
		sc.close();
	}

}
