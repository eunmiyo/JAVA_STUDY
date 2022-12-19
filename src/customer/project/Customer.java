package customer.project;

public class Customer {
	//필드
	//protected 상속받은사이에서만 쓸 수 있다.
	protected int customerID; //고객아이디
	protected String customerName; //고객이름
	protected String customerGrade; //고객등급:silver, gold...
	int bonusPoint; //보너스 포인트 적립
	double bonusRatio; //보너스 포인트 적립 비율
	
	//생성자
	//public 모든 타 클래스에서 사용 가능
	//public Customer(){} 디폴트생성자
	public Customer () {
		initCustomer();
	}
	
	//생성자, 매개변수 지정
	//매개변수가 (int customerID, String customerName)일때 실행
	public Customer (int customerID, String customerName) {
		//매개변수명이랑 같을 때는 this.를 붙여주는게 좋음!
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	//메소드
	//private: 오직 해당 클래스 내에서만 사용
	//고객 등급 초기화(init())
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//보너스 포인트 계산, 가격 리턴
	//public int(리턴 타입) , return price(반환값) 리턴타입과 반환값의 타입이 일치해야한다!
	public int clacPrice(int price) { 	//price: 지불금액
		//보너스 비율을 계산해서 bonusPoint 적립
		bonusPoint += (price * bonusRatio);
		//일반고객은 지불 금액 그대로를 리턴해준다.
		return price;
	}
	
	//고객정보 보여주기
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade + ", 보너스 포인트: " + bonusPoint + "점";
	}

	/**
	* protected 동일패키지 내 클래스 또는 상속 클래스에서 사용
	* protected 상속받은사이에서만 쓸 수 있어 다른곳에서도 쓰기 위해
	* -> get, set 메소드 사용
	* get 정보를 얻어올 때
	* set 재정의가 필요할 때
	 * @param customerName
	 */
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
