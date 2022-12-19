package customer.test;

public class GoldCustomer extends Customer{
	//필드
	double saleRatio;
	
	//생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "Gold";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	//메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		//실수(saleRatio)가 있기때문에 (int)로 강제형변환
		//할인율이 있어서 할인금액 리턴
		return price - (int)(price * saleRatio); 
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}
	
	
	
	
	
	
	
	
}