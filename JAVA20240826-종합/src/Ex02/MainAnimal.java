package Ex02;

class Animal{
	
	private String name; // 멤버변수, 인스턴스 변수 => 생선된 객체들이 개별적으로 가지고 있음
	private static int count; // 정적변수, 클래스 변수 => 공유자원
	
	public Animal() { 
		this("동물");
		this.name = ("동물");
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	void speak() {
		
	}
	
	void info() { // 메소드, 인스턴스 메소드
		System.out.println(name + "입니다.");
	}
	
	static void staticinfo() {// 정적메소드, 클래스변수
//		name = 동물;
		count++;
//		info();
		func();
		
	}
	
	static void func() {
		
	}
	
}

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal("동물");
		
		animal.info();
		
		Animal animal2 = new Animal();
		animal2.info();
		
	}

}
