package Ex04;

class Student{//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	
	private String name;
	private int age;
	private String phone;
	
	int getage() {
		return age;
	}
	
	void setage(int age) {
		this.age = age;
	}
	
	String getphone() {
		return phone;
	}
	
	void setphone(String phone) {
		this.phone = phone;
	}
	
	//디폴트 생성자
	Student(){
		this("한라산", 10, "000-0000-0000");
		System.out.println("디폴트 생성자 호출");
	}
	
	Student(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	//read --> get+변수명
	void nameinfo() {
		System.out.println("이름 :" + name);
	}
	
	String getname() {
		return name;
	}
	
	void setname(String name) {
		this.name = name;
	}
	
	//write --> set+변수명
	void namechange(String name) {
		this.name = name;
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