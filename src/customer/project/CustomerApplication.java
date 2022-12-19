package customer.project;

import java.util.ArrayList;

public class CustomerApplication {
	//import필요,
	//<Customer>객체(고객)를 저장할 ArrayList를 생성
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		//일반 고객(silver등급)
		//Customer객체타입을 customerLee변수에 대입
		Customer customerLee = new Customer(10010, "이순신"); //자동타입변환
		Customer customerShin = new Customer(10020, "신사임당"); 
		
		//gold 고객(gold등급)
		//new GoldCustomer객체타입을 customerHong변수에 대입
		Customer customerHong = new GoldCustomer(10030, "홍길동"); 
		Customer customerJeong = new GoldCustomer(10040, "정약용"); 
				
		//vip 고객(vip등급)
		//VIPCustomerOther객체타입을 customerYul변수에 대입
		Customer customerYul = new VIPCustomerOther(10050, "이율곡", 12345); 		
	
		//customerList.add()메소드로 배열추가
		//객체로 선언했기때문에 객체만 넣을 수 있다.
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJeong);
		customerList.add(customerYul);
		
		//static:전역변수, 객체 생성하지 않고 바로 호출
		showAllCustomer();
		
		//id로 고객찾기
		//customer 객체를 받는다.
		Customer customer = findCustomer(10050);
		
		//id로 찾은 고객의 실제 지불금액, 보너스 포인트 출력
		if(customer == null) {
			System.out.println("존재하지 않는 회원입니다.");
		}else {
			//고객의 실제 지불금액, 보너스 포인트 출력
			showPriceBonus(customer, 10000);
		}
	}
	
	//모든 고객정보 출력 메소드
	//main메소드에서 객체를 생성하지 않고 바로 호출하기 위해 static으로 빼준다!
	public static void showAllCustomer() {
		System.out.println("===========모든 고객 정보 출력===========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	
	//id로 고객객체를 찾아주는 메소드
	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null;
		
		for(Customer customer : customerList) {
			//해당 객체의 customerID와 매개변수로 받아온 customerID가 같은지 비교한다.
			if(customer.getCustomerID() == customerID) {
				resultCustomer = customer;
				break;
			}
		}
		return resultCustomer; //해당 객체를 찾지 못하면 null을 리턴
	}
	
	public static void showPriceBonus(Customer customer, int price) { //price: 물건 살 때 지불한 금액
		System.out.println("=====해당 고객의 할인율과 보너스 포인트 계산=====");
		
		int cost = customer.clacPrice(price);//지불할 금액
		
		System.out.println(customer.getCustomerName() + "님의 지불금액: " + cost + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bonusPoint + "점");
	}
}
