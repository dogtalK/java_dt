package day18.practice;

public class StringIndexOfEx {

	public static void main(String[] args) {
		
		String str = "Hello world";
		int count = 0;
		/*
		for(int i = 0; i < str.length(); i++) {
			int index = str.indexOf('l' , i);
			if(str.indexOf('l' , i) != str.indexOf('l' , i-1)) {
				count++;
			}
		}
		System.out.println("the number of l is "+ count);
		*/
		
		String search = "l";
		int index = -1;
		//반복
		do {
			//Hello world에 l의 위치를 찾음 => lo world에서 l의 위치를 찾음 => o world에서 l의 위치를 찾음
			//=>d에서 l의 위치를 찾음
			index = str.indexOf(search, ++index);
			//찾았으면 개수를 증가
			if(index != -1) {
				count++;
			}
		}while(index !=-1);
		System.out.println(str + " : " + search + " : " + count);
	}

}
