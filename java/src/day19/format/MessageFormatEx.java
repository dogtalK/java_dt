package day19.format;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {

		int x= 1, y = 2;
		String str = "(" + x + "," + y + ")";
		System.out.println(str);
		x =3;
		y= 5;
		str = "(" + x + "," + y + ")";
		System.out.println(str);
		
		x = 10;
		y = 20;
		String messeage = "({0},{1})";
		String str2 = MessageFormat.format(messeage, x,y);
		System.out.println(str2);
		
		x = 30;
		y = 40;
		str2 = MessageFormat.format(messeage, x,y);
		System.out.println(str2);
	}

}
