package day19.pracrice;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		// 두 정수와 산술연산자를 입력했을 때 연산 결과를 출력하는 코드를 작성하세요 예외처리도 추가
		/* input : 1 + 2
		 * 1 + 2 = 3
		 * input 1 ? 2
		 * not operator!
		 * input 1 / 0
		 * not operator! 
		 */
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("input : ");
		try {
			int x = sc.nextInt();
			char op = sc.next().charAt(0); 
			int y = sc.nextInt();
			double res = 0;
			
			switch(op) {
			case '+':
				res = x+y;
				break;
			case '-':
				res = x-y;
				break;
			case '*':
				res = x*y;
				break;
			case '/':
				res = ((double)x/y);
				break;
			case '%':
				res = x%y;
				break;
			default :
				System.out.println("op error");
			}
			
			String messeage = "{0} {1} {2} = ";
			String str = MessageFormat.format(messeage, x,op,y);
			System.out.println(str + res);

		}catch(InputMismatchException e) {
			System.out.println("Worng Input");
		}catch(ArithmeticException e) {
			System.out.println("Not operation");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("EXIT");
		test1();
		test2();
		sc.close();
	}
	public static void test1() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception");
			return;
		}finally{
			System.out.println("Method1 EXIT");
		}
	}
	
	public static void test2() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception");
			return;
		}
		System.out.println("Method EXIT");
	}

}
