package Ex03;

public class Student extends Person{
	
	
	private String school;
	private String lesson;
	
	
	public Student(String name, int age, String school, String lesson) {
		super(name, age);
		this.school = school;
		this.lesson = lesson;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("제 학교는 %s이고, 학과는 %s과 입니다.\n", school, lesson);
	}
	
	public void now() {
		System.out.printf("%s는 현재 %s %s학과 학생 입니다.\n", name, school, lesson);
	}
	
	
}
