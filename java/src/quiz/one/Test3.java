package quiz.one;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		//HashSet은 List의 구현 클래스가 아니기 때문에 HashSet의 객체를 List가 관리할 수 없다
		//List<Integer> list = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		//3은 int 3이 자동으로 박싱되서 Integer의 객체로 저장
		list.add(3);
		//(int)는 의미가 없고 위와 같은 이유로 저장
		list.add((int)4);
		//5를 박싱으로 Integer의 객체로 변환 후 저장
		list.add((Integer)5);

	}

}
