package quiz.one.student.vo;

import java.util.Objects;

import lombok.Data;

@Data
public class Student {

	private int number;
	private String major, name;
	
	public Student(int number, String major, String name) {
		this.number = number;
		this.major = major;
		this.name = name;
	}
	
	public Student(String major, String name) {
		this.major = major;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(major, other.major) && Objects.equals(name, other.name) && number == other.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(major, name, number);
	}
}
