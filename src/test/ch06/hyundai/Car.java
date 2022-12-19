package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	//다른 패키지에 있는 class는 반드시 패키지 import를 해줘야한다.
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();
	
	//같은 패키지에 있는 class는 import안해줘도됨
	Test test = new Test();
	
	//import없이 불러오기, 지저분해서 잘 안씀
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
}
