package day7.practice;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {

		char ch, end;
		for(end = 'a'; end <= 'z'; end++) {
			for(ch = 'a';ch <= end; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
}
