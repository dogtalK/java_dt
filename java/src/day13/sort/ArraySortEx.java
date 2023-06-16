package day13.sort;

import java.util.Arrays;

import array.Array;

public class ArraySortEx {

	/*배열 정렬
	-버블정렬
	1 4 7 2 3 5
	=> 1 4 2 3 5 	7 
	=> 1 2 3 4 	5 7 
	=> 1 2 3 	4 5 7
	=> 1 2 		3 4 5 7
	=> 1 		2 3 4 5 7
	*/
	public static void main(String[] args) {
		// 버블 정렬 예제
		int arr[] = {1, 4, 7, 9, 2, 8, 3, 6};
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			Array.printArray(arr);
		}
		Integer arr2[] = {1, 4, 7, 9, 2, 8, 3, 6};
		Arrays.sort(arr2);
		for(Integer tmp : arr2) {
			System.out.print(tmp + " ");
		}
	}

}
