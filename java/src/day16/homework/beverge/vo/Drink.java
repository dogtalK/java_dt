package day16.homework.beverge.vo;

import lombok.Data;

@Data
public class Drink {

	private String name;//이름
	private int price;//가격
	private int amount;//수량(제고량)
	private int money;//돈
	
	
	public Drink(String name, int price, int amount, int money) {
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.money = money;
	}
	//수량 증가
	public void store(int amount) {
		if(amount < 0) {
			return;
		}
		this.amount += amount;
	}
	//수량 감소
	public void release(int amount) {
		if(amount < 0) {
			return;
		}
		this.amount -= amount;
	}
	//금액 투입
	public int cash(int money) {
		if(money < 0) {
			return 0;
		}
		this.money += money; 
		return money;
	}
	//음료 구매
	public void sell(int money, int price) {
		if(money < price) {
			System.out.println("금액이 부족합니다");
			System.out.println("잔돈 " + money + " 가 나옵니다");
		}
		
	}
}
