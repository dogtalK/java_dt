package day6.nestedloop;

public class MulriplicationTableEx {

	public static void main(String[] args) {
		// 구구당 2단부터 9단까지 출력하는 코드를 작성하세요
		
		int i;
		int z;
		for(i = 1; i <= 9; i++) {
			for(z = 1; z <= 9; z++) {
				System.out.println(i + " * " + z + " = " + i * z);
			}
		}

	}

}
