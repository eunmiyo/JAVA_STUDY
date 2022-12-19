package customer.project;

public class VIPCustomerOther extends Customer{
	//필드
	private int agentID; //상담원 아이디
	double saleRatio; //할인비율
	
	//생성자
	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		//super: 상속받은 Customer 호출
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}

	//메소드
	@Override
	public int clacPrice(int price) {
		//보너스 비율을 계산해서 bonusPoint 적립
		bonusPoint += (price * bonusRatio);
		//실수(saleRatio)가 있기때문에 (int)로 강제형변환
		//할인금액 리턴
		return price - (int)(price * saleRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + ", 담당 상담원 아이디: " + agentID;
	}

	public int getAgentID() {
		return agentID;
	}
}
