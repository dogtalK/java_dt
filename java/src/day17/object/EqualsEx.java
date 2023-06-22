package day17.object;

import java.util.Objects;

import lombok.Data;

public class EqualsEx {
	
	/*equals()
	 * - 기본은 주소를 비교
	 * - 오버라이딩을 통해 멤버를 비교하여 같은 객체로 판별 가능하게 수정 가능
	 */
	
	/* hashcode()
	 * - 정보를 저장하거나 검색할 때 사용하는 자료 구조
	 * - KH 정보 교육원에서 홍길동 학생이 무슨 수업을 듣는지 찾으려 한다.
	 * 		- 이 때 홍길동 학생이 어느 반에 있는지(해시코드값) 확인하여 홍길동 학생이 있는지 확인하고(equals)
	 * 		같으면 해당 반이 무슨 수업을 진행하는지 확인.
	 * - HashSet이나 HashMap과 같이 Hash를 이용한 자료구조를 사용할 때 오버라이딩을 함.
	 * (왜? 검색을 빠르게 하기 위해)
 	 */

	public static void main(String[] args) {
		Customer list[] = {
			new Customer("hong", "010-1234-5678"),
			new Customer("lim", "010-1111-5678"),
			new Customer("yu", "010-5555-5678")
		};
		Customer customer = new Customer("hong", "010-1234-5678");
		
	
		/*//equals()가 오버라이딩 안됐을 때 고객이 명단에 있는지 조회
		for(Customer tmp : list) {
			if(tmp.getPhoneNumber().equals(customer.getPhoneNumber())) {
				System.out.println("OK");
				return;
			}
		}
		System.out.println("FAIL");
		return;
	}
	*/
		for(Customer tmp : list) {
			if(tmp.equals(customer)) {
				System.out.println("OK");
				return;
			}
		}
		System.out.println("FAIL");
	}
}
@Data
class Customer{
	private String id;
	private String name;
	private String phoneNumber;
	
	public Customer(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	}

	
}