package test.ch08.test;

public class DaoExample7 {

	public static void dbWork(DataAccessObject7 dao) {
		dao.select();
		dao.insert();
		dao.updata();
		dao.delete();
		
	}
	public static void main(String[] args) {
		dbWork(new OracleDao7());
		dbWork(new MySqlDao7());

	}

}
