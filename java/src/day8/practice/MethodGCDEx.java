package day8.practice;
import java.util.Scanner;

public class MethodGCDEx {

	public static void main(String[] args) {
		// 정수 num1과 num2를 입력받아 두정수의 최대 공약수를 구하는 코드를 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("input number 1,2");
		int num1, num2, min;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>=num2) {
			min = num2;
		}else {
			min = num1;
		}
		
		
		int i;
		for(i=1; i <= min; i++) {
			if(isMultiple(num1, i) && isMultiple(num2, i)) {
			}
		}System.out.println(i-1);
		
		
		int gcd = gcd(num1, num2);
		System.out.println(num1 + " and " + num2 + " gcd : " + gcd);
		
		sc.close();
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
	/** 두 정수가 주어지면 두 정수의 최대 공약수를 알려주는 메서드
	 *  매개변수 : 두 정수 => int num1, int num2
	 *  리턴타입 : 최대 공약수 => int
	 *  메서드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		for(int i = num1; i>=1; i--) {
			// i가 num1의 약수이다 == num1은 i의 배수이다.
			if(isMultiple(num1,i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;
	}
}