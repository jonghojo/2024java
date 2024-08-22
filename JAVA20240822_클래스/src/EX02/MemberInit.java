package EX02;

public class MemberInit {
	
	String name;
	int age;
	int grade;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	void initMember(String name, int age, int grade) {
		this.name = name;
		this.age =age;
		this.grade = grade;
		
	}
	
	void info() {
		System.out.printf("이름 :%s, 나이 :%d, 성적 :%d\n", name, age, grade);
	}
	
}
