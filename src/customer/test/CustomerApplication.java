package customer.test;

import java.util.ArrayList;

public class CustomerApplication {
	//ArrayList<타입> 변수 = new ArrayList<타입>
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		//일반고객
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		//골드고객
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerJeong = new GoldCustomer(10040, "정약용");
		//브이아이피고객
		Customer customerYul = new VIPCustomerOther(10050, "이율곡", 12345);
		
		//.add로 추가해주어야 한다.
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJeong);
		customerList.add(customerYul);
		
		showAllCustomer();
		
		Customer customer = findCustomer(10050);
		
		showPriceBonus(customer, 10000);
		
	}
	
	public static void showAllCustomer() {
		System.out.println("==========모든 고객 정보 출력===========");
		//확장for문: for([배열자료형(타입)][변수명]:[배열명, 리스트객체명])
		//-> 배열의 리스트를 순회할 때 요소의 값을 변경하지 않고 읽기만 할 때 사용
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());	
		}
	}
	
	//id로 고객을 찾아주는 메소드
	public static Customer findCustomer(int customerID) {
		Customer resultCustomer = null;
			for(Customer customer : customerList) {
				if(customer.getCustomerID() == customerID) { 
					resultCustomer = customer;				
				}
			}
			return resultCustomer;
	}
	
	//할인율과 보너스포인트계산
	//=====해당 고객의 할인율과 보너스 포인트 계산=====
	//(이름)님의 지불금액: 원
	//(이름)님의 현재 보너스 포인트: 점
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("=====해당 고객의 할인율과 보너스 포인트 계산=====");
		System.out.println(customer.getCustomerName() + "님의 지불금액: " + customer.calcPrice(price) + "원");
		System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트: " + customer.bonusPoint + "점");
	}

}
