package customer.test;

/* 출력결과
 ===========모든 고객 정보 출력===========
이순신님의 등급: SILVER, 보너스 포인트: 0점
신사임당님의 등급: SILVER, 보너스 포인트: 0점
홍길동님의 등급: GOLD, 보너스 포인트: 0점
정약용님의 등급: GOLD, 보너스 포인트: 0점
이율곡님의 등급: VIP, 보너스 포인트: 0점, 담당 상담원 아이디: 12345
=====해당 고객의 할인율과 보너스 포인트 계산=====
이율곡님의 지불금액: 8000원
이율곡님의 현재 보너스 포인트: 300점

보너스포인트 계산 = bonusPoint+(지불금액 * bonusRatio)
*/

public class Customer {
	//필드
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//생성자
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	//메소드
	private void initCustomer() { //초기값
		customerGrade = "Silver(일반고객)";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		//할인율이 없어서 지불금액 그대로 리턴
		return price;
	}
	
	//protected로 접근제한자를 둔 ID, Name, Grade는
	//-> 다른곳에서도 쓸 수 있게 get, set으로 만들어 줘야한다. 
	
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade + ", 보너스 포인트: " + bonusPoint + "점";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
