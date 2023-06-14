package day11.array;

public class ForEx1 {
	
	/* 배열의 길이 배열명.length로 배열의 크기를 알 수 있음
	 * 배열의 크기는 생성된 배열의 전체 크기이지 유효한 값이 들어있는 개수가 아님
	 */
	/* 배열 복사하기
	 * 반복문을 이용하여 직접 복사
	 * System.arracopy(src, srcPos, dest, destPos, length)를 이용하여 복사
	 * -얕은 복사
	 */
	/*향상된 for문
	 * for(자료형 변수명 : 배열명){
	 * }
	 * -배열을 전체 탐색하는 경우 사용
	 * -값을 조회하는 경우(수정하는 경우는 사용하지 않음)
	 */

	public static void main(String[] args) {
		int arr[] = new int[] {4,5,2,1,9,};
		
		for(int i = 0;i<arr.length; i++) {
			arr[i] = 0;
			int tmp = arr[i];
			System.out.println(tmp);
		}
		arr = new int[] {4,5,2,1,9,};
		System.out.println("===============");
		for(int tmp : arr) {
			tmp = 0;
			System.out.println(tmp);
		}
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}

}
