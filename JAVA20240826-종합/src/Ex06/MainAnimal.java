package Ex06;


public class MainAnimal {

	public static void main(String[] args) {
		
		Dog dog = new Dog("강아지", 1);
		dog.speak();
		
		Cat cat = new Cat("고양이", 3);
		cat.speak();
		
		Cow cow = new Cow();
		cow.speak();
	}
	
	
	

}
