package Ex03;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("홍길동", 21);
		
		person.info();
		person.exercise();
		
		System.out.println("---------------------------------------------");
		
		Student student = new Student("홍길동", 21, "용인대학교", "유도");
		
		student.info();
		student.now();
		student.exercise();
		
		System.out.println("---------------------------------------------");
		
		Job job = new Job("홍길동", 21, "유도", 66);
		
		job.info();
		job.hope();
		job.exercise();
	}

}
