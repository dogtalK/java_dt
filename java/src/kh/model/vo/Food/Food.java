package kh.model.vo.Food;

import java.io.Serializable;

import lombok.Data;

@Data
public class Food implements Serializable{
	
	private static final long serialVersionUID = 8739603004569264793L;
	private String name;
	private int kcal;
	
	
	public Food() {}

	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
}
