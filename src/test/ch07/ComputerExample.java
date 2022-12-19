package test.ch07;

public class ComputerExample {

	public static void main(String[] args) {
		int r =10;
		
		Calculator calc = new Calculator();
		System.out.println(calc.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(r));

	}

}
