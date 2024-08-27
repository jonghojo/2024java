package Ex03;

public class MySqlDao implements DataAccessObject{
	
	String name;
	
	public MySqlDao(String name) {
		this.name = name;
	}
	
	@Override
	public void select() {
		System.out.printf("%s에서 검색\n", name);
	}

	@Override
	public void insert() {
		System.out.printf("%s에 삽입\n", name);
	}

	@Override
	public void update() {
		System.out.printf("%s를 수정\n", name);
	}

	@Override
	public void delete() {
		System.out.printf("%s에서 삭제\n", name);
	}

}
