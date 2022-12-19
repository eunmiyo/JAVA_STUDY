package test.ch07.test;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTrie = new SnowTire();
		
		Tire tire = snowTrie;
		
		snowTrie.run();
		tire.run();
	}

}
