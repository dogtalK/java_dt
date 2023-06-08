package day7.practice;

public class PrintAlphabetEx {

	public static void main(String[] args) {
		// a부터 z까지 출력하는 코드를 작성하세요.
		
		int st;
		
		for(st = 0; st < 26; st++) {
			System.out.print((char)('a'+st));
		}
		
		System.out.println("");
		
		char ch;
		for(ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}

	}

}
