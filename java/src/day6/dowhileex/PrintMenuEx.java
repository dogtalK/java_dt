package day6.dowhileex;

import java.util.Scanner;

public class PrintMenuEx {
	
	/* 무한루프
	 * 반복문이 계속 실행되는 경우를 무한루프라고 한다.
	 * while문의 조건식이 항상 참인 경우 발생
	 * -조건식이 true로 된 경우(의도)
	 * -조건식에 사용되는 변수가 변하지 않아 항상 참인 경우(실수)
	 */
	
	/* do-while문
	 * do{
	 * 		실행문;
	 * }while(조건식);
	 * 실행문을 싱행하고 조건식을 판별해서 반복할지 말지를 결정한다
	 * ; 필수
	 * 조건식 생략 불가능
	 */

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
		int menu;
		
		do {
			System.out.println("menu");
			System.out.println("1.Start");
			System.out.println("2.Save");
			System.out.println("3.Exit");
			System.out.println("Select Menu :");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Program Start");
				break;
			case 2:
				System.out.println("Program Save");
				break;
			case 3:
				System.out.println("Program Exit");
				break;
			}
		}while(menu != 3);
		sc.close();
	}

}
