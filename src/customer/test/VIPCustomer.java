package customer.test;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		//실수(saleRatio)가 있기때문에 (int)로 강제형변환
		//할인율이 있어서 할인금액 리턴
		return price - (int)(price * saleRatio); 
	}


	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 아이디: " + agentID;
	}
	
	
	
}
