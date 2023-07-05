package day26.library.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Book implements Serializable{
	
	private static final long serialVersionUID = 588727359220714297L;
	private String num, title, author, isbn;
	private boolean loan;//대출 여부

	public Book(String num, String title, String author, String isbn) {
		this.num = num;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book \n number : " + num + 
				"\n title  : " + title + "\n author : " + author + "\n ISBN   : " + isbn +"\n";
	}
	
	public void loanBook() {
		this.loan = true;//setLoan(true);
	}
	public void returnBook() {
		this.loan = false;//setLoan(false);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(num, other.num);
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}
}
