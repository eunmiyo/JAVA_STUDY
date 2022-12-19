package test.ch12;

public class GenericEx2 {

	public static void main(String[] args) {
		//외부에서 제네릭 타입을 사용하려면 타입 파라메터에 구체적인 타입을 지정해야 한다.
		//제네릭을 이용해서 다양한 객체를 생산할 수 있다.
		Product<Tv, String> product1 = new Product<>();
		//setKind를 이용해 Tv()객체를 넣어준다.
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv t = product1.getKind();
		String tModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("전기자동차");
		
		Car c = product2.getKind();
		String cModel = product2.getModel();
	}

}
