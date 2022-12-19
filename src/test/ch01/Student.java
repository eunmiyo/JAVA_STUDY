package test.ch01;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public int getTotal() {	
		return kor + eng + math;
	} 
	
	public float getAverage() {	
		return Math.round((ban + eng + math / 3) * 100 / 100.0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return name + "," + ban + "," + "no";
	}
	
	

}
