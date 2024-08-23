package Ex02;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동", 20);
		
		person.introduce();
		person.walk();
		
		System.out.println("------------------------------------------");
		
		Student student = new Student("홍길동",20,"아주대학교", "123456789");
		
		student.introduce();
		student.walk();
		student.study();
		
		System.out.println("------------------------------------------");
		
		SalesMan salesman = new SalesMan("홍길동", 20,"삼성", 10000);
				
		salesman.introduce();
		salesman.walk();
		salesman.work();
	}

}
