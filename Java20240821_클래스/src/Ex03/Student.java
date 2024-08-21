package Ex03;

class Student{
	
	private String name;
	private int age;
	private String phone;
	
	Student(){
		this("한라산", 10, "000-0000-0000");
		System.out.println("디폴트 생성자 호출");
	}
	
	Student(String name){
//		name = n;
//		age = 10;
//		phone = "000-0000-0000";
		this(name, 10, "000-0000-0000");
	}
	
	Student(String name, int age){
//		name = n;
//		age = a;
//		phone = "000-0000-0000";
		this(name, age, "000-0000-0000");
	}
	
	Student(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	void info() {
		System.out.printf("이름 :%s, 나이 :%d, 전화번호 :%s\n",
				name, age, phone);
	}
	
	
	void 입실() {
		System.out.println("입실하다");
	}
	
	void 퇴실() {
		System.out.println("퇴실하다");
	}
	
	void 조퇴() {
		System.out.println("조퇴하다");
	}
}