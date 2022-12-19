package test.ch12;

//타입 파라메터 정의
//결정되지 않은 타입을 파라메터로 가지는 클래스
public class Product<K, M> {
	//필드
	private K kind; //가전제품
	private M model; //타입
	
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
