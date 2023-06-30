package day22.practice.phone.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
	int phoneNumber, bookMark;
	String name, group;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return bookMark == other.bookMark && Objects.equals(group, other.group) && Objects.equals(name, other.name)
				&& phoneNumber == other.phoneNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookMark, group, name, phoneNumber);
	}

}
