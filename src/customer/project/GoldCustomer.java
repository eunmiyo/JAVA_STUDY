package customer.project;

public class GoldCustomer extends Customer{
	//필드
	double saleRatio; //할인율
	
	//생성자
	public GoldCustomer(int customerID, String customerName) {
		//super: 상속받은 Customer 호출
		super(customerID, customerName);
		super.customerGrade = "GOLD";
		
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	//메소드
	@Override
	//재정의가 필요한것들만 수정
	public int clacPrice(int price) {
		bonusPoint += (price * bonusRatio);
		//실수(saleRatio)가 있기때문에 (int)로 강제형변환
		//할인금액 리턴
		return price - (int)(price * saleRatio); 
	}
	
}
