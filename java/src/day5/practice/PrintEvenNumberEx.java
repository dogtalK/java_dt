package day5.practice;

public class PrintEvenNumberEx {

	public static void main(String[] args) {
		// 10이하의 짝수를 출력하는 코드를 작성하세요
		
		int i = 1;
		while(i<=5) {
			System.out.println(i*2);
			i++;
		}
		System.out.println("=================");
		
		i = 2;
		while(i<=10) {
			System.out.println(i);
			i = i + 2; //i += 2;
		}
		
		System.out.println("=================");
		
		i = 1;
		while(i<=10) {
			i++;
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
