package day6.whileex;

public class SumEx {

	public static void main(String[] args) {
		// 1부터 n까지 합을 구하는 코드를 작성하세요(n은10)
		/* 반복횟수 : i는 1부터 n까지 1씩 증가
		 * 규칙성 : sum =+ i
		 * 반복문 후 종료 후 : 누적합이 sum을 출력
		 * 			sum0 = 0
		 * i = 1	sum1 = sum0 + 1
		 * i = 2	sum2 = sum1 + 2
		 * i = 3	sum1 = sum2 + 3
		 * ...
		 * i = 10	sum10 = sum9 + 10
		 * i = n	sum = sum + i => sum += 1
		 */
		
		int n = 10, sum = 0;
		int i = 1;
		while(i <=n) {
			sum += i;
			i++;
		}
		System.out.println("1~"+ n + " sum :" + sum);

	}

}
