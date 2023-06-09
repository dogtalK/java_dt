package day7.homework;

public class StarEx5 {

	public static void main(String[] args) {
/*
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j<=5-i; j++) {
				System.out.print(' ');
			}
			for(j = 1; j <= i; j++) {
				System.out.print('*');
			}
			for(j = 1; j <= i-1; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		for(i = 1; i<=4;i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(' ');
			}
			for(j = 1; j <= 4-i; j++) {
				System.out.print('*');
			}
			for(j = 1; j <= 5-i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		*/
		
		int num = 7;
		for(int i = 1; i<=num; i++) {
			int half = (num + 1)/2;
			if( i <=half) {
				for(int j = 1; j <=half-i;j++) {
					System.out.print(' ');
				}
				for(int j = 1;j<=2*i-1;j++) {
					System.out.print('*');
				}
				System.out.println("");
			}else {
				for(int j = 1; j <=i-half; j++) {
					System.out.print(' ');
				}
				for(int j = 1; j<=2*(num-i)+1; j++) {
					System.out.print('*');
				}
				System.out.println("");
			}
		}
		
		
		
	}
	
}

