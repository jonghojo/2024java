package Ex02;


//final calss Student => Student 클래스 상속 불가
//public final class Student extends Person{
public class Student extends Person{
	
	private String School;
	private String StudentID; //학번
	
	public Student() {}
	
	public Student(String School, String StudentID) {
//		this("홍길도", 10, school, studentID); --> Person에는 School과 SchoolID가 없기에 사용불가능 하다
		this.School = School;
		this.StudentID = StudentID;
	}
	
	public Student(String name, int age, String School, String StudentID) {
		super(name, age); // 상위클래스(Person) 생성자 호출 구문, 맨앞 기입 필수
		//super가 상위클래스 호출하는 구문
		this.School = School;
		this.StudentID = StudentID;
	}
	
	@Override //@:어노테이션, @Override --> 상위클래스 메소드를 하위클래스가 재정의했다
	//@Override 를사용시 상위클래스를 숨기고 하위 클래스를 사용한다
	//오버라이딩은 상위클래스가 나한테 맞지 않은경우(하위클래스가 사용하기에 적합하지 않은경우)재정의 하기위해서 사용한다
	public void introduce() {
//		System.out.printf("안녕하세요, 제 이름은 %s이고, 나이는 %d살 입니다.\n", name, age);
		super.introduce(); //오버라이딩한 상위클래스 호출 이경우는 맨앞이 아니어도 사용가능
		//
		System.out.printf("학교는 %s이고, 학번은 %s입니다.\n", School, StudentID);
	}
	
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다");
	}
	

}
