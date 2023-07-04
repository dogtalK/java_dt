package quiz.one.student.vo;

import java.util.ArrayList;
import java.util.List;


public class StudentList {
	private List<Student> list = new ArrayList<>();
	
	public boolean addStd(String name, String major) {
		
		Student sl = new Student(name, major);
		
		if(sl.getMajor().length() == 0) {
			return false;
		}
		list.add(sl);
		return true;
	}
	
	
	
	
}
