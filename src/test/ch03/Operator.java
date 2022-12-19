package test.ch03;

public class Operator {

	public static void main(String[] args) {
		//부호 연산자
		/*
		int x = -100;
		x = -x;
		System.out.println(x);
		*/
		
		//증감, 감소 연산자
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
		System.out.println("--------------");
		
		y--;
		--y;
		System.out.println("y= " + y);
		System.out.println("--------------");
		
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("--------------");
		
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("--------------");
		
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
	}

}
