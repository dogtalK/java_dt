package day3.homework;

import java.util.Scanner;

public class Ex2_if {
	
	/*성별(M:남성,W:여성)를 입력받아 M이면 남성을, W이면 여성을 출력하는 코드를 작성하세요. if문 이용
	(package : day3.homework, file : Ex2_if) 
	input gender : 
	M
	Are you a women? man
	
	input gender : 
	W
	Are you a women? woman
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input gender");
		String gender = sc.nextLine();
		
		String man =  "m";
		String woman =  "w";
		
		if(gender.equals(man)) {
			System.out.println("Are you a women? man");
		}
		if(gender.equals(woman)) {
			System.out.println("Are you a women? woman");
		}
		sc.close();
		
		/*강사님 코드
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender");
		gender = sc.next().charAt(0);
		
		String result = ""; 
		if(gender == 'm') {
			//System.out.println("Are you a women? man");
			result = "man";
		}
		if(gender == 'w') {
			//System.out.println("Are you a women? women");
			result = "women";
		}
		System.out.println("Are you a women? " + result);
		sc.close();
		*/
		
	}

}
