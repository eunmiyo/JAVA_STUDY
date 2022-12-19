package test.ch13.threadExample;

//https://wakestand.tistory.com/93

public class Blitzcrank extends Thread {
	String skill_Name;
	
	public Blitzcrank(String skill) {
		this.skill_Name = skill;
	}

	@Override
	public void run() {
		System.out.println("시전한 스킬: " + skill_Name);
		
		for(int i=1; i<=3; i++) {
			System.out.println(skill_Name + "스킬을 " + i + "초간 시전 중입니다.");
		}
		System.out.println("시전 끝난 스킬: " + skill_Name);
	}
	
	public static void main(String[] args) {
		String[] skill = new String[] {"Q", "W", "E"};
		
		for(int i=0; i<skill.length; i++) {
			Blitzcrank blitz = new Blitzcrank(skill[i]);
			blitz.start();
		}
	}
}
