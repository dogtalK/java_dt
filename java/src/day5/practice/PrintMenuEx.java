package day5.practice;

import java.util.Scanner;

public class PrintMenuEx {

	public static void main(String[] args) {
		/* 다음과 같은 메뉴를 출력하고 프로그램 종료를 전택하기 전까지 반복적으로 실행되는 코드를 작성하세요.
		 * menu
		 * 1.Start
		 * 2.Save
		 * 3.Exit
		 * Select Menu :
		 * 1
		 * Program Start
		 * 
		 * Select Menu :
		 * 2
		 * Program Save
		 * 
		 * Select Menu :
		 * 3
		 * Program Exit
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i != 3) {
			System.out.println("menu");
			System.out.println("1.Start");
			System.out.println("2.Save");
			System.out.println("3.Exit");
			System.out.println("Select Menu :");
			i = sc.nextInt();
			
			if(i == 1) {
				System.out.println("Program Start");
				System.out.println("");
			}else if(i == 2) {
				System.out.println("Program Save");
				System.out.println("");
			}else if(i == 3) {
				System.out.println("Program Exit");
				System.out.println("");
			}else {
				System.out.println("wrong number");
				System.out.println("");
				i = 0;
			}
			/* switch(i){
			 * case 1:
			 * 		System.out.println("Program Start");
			 *		System.out.println("");
			 *		break;
			 * case 2:
			 * 		System.out.println("Program Save");
			 *		System.out.println("");
			 *		break;
			 * case 3:
			 * 		System.out.println("Program Exit");
			 *		System.out.println("");
			 *		break;
			 * }	
			 */
		}
		sc.close();
	}

}
