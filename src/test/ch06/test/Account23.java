package test.ch06.test;

public class Account23 {
	//필드
	private String ano; //계좌번호
	private String owner; //계좌주
	private int balance; //잔고
	
	//생성자
	public Account23(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//메소드
	//Getter, Setter private에 접근하기 위해
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
