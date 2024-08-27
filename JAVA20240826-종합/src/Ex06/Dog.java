package Ex06;

public class Dog extends Animal{
	
	int age;
	
	Dog(String name, int age){
		super(name);//super => 상위 클래스에서 정보가져오기
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	@Override //상위클래스에있는 메소드를 하위 클래스에서 재정의 한다는 선언
	void info() {
//		System.out.println(getName()  + " 입니다.");
		super.info();
		System.out.println(age + " 살 입니다.");
	}
	
	@Override // 상위클래스에 없는것을 사용하기위해서는 필수!!
	void speak() {
		System.out.println("멍멍~");
	}
	/*override는 큰틀은 상위클래스에서 가져오지만 가져오고 출력시 세부내용이 다를시
	  사용하여 상위클래스가 아닌 하위클래스에서 설정한 값이 출력되게할때 사용한다
	*/
}
