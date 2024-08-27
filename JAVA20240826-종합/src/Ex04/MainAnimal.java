package Ex04;


public class MainAnimal {

	public static void main(String[] args) {
		
		//상위 클래스는 하위 클래스를 참조 할 수 있다
		//단, 접근 할 수 있는 영역은 본인 클래스 또는 부모클래스만 접근이 가능하다
		
		Animal an = new Animal();
		Animal an2 = new Dog();
		Animal an3 = new 진돗개();
		
		Dog dog = new Dog();
		Dog dog2 = new 진돗개();
//		Dog dog3 = new Animal(); error 상위클래스 참조 불가
		
		진돗개 jin = new 진돗개();
//		진돗개 jin2 = new Animal(); error
//		진돗개 jin3 = new Dog(); error
		System.out.println("-----------------------");
		
		//하위클래스는 상위클래스 참조 불가
//		Dog dog3 = new Animal(); error 상위클래스 참조 불가
		//단, 예외가 존재함
		Animal an4 = new Animal();
		Dog dog3 = (Dog)an4;
		dog3.speak();
		
		진돗개 jin4 = (진돗개)an3;
		
	}
	
	
	

}
