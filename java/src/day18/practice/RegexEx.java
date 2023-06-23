package day18.practice;

import java.util.regex.Pattern;

public class RegexEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "http://www.naver.com";
		String regex = "^https?://[a-zA-Z\\.]+$";
		boolean result = Pattern.matches(regex, str);
		System.out.println(str + " : " + result);
	}

}
