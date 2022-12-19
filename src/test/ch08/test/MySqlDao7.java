package test.ch08.test;

public class MySqlDao7 implements DataAccessObject7{

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");
		
	}

	@Override
	public void updata() {
		System.out.println("MySql DB에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
		
	}

}
