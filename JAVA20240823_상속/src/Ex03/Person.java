package Ex03;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.printf("안녕하세요. 제 이름은 %s입니다. 나이는 %d입니다.\n", name, age);
	}
	
	public void exercise() {
		System.out.printf("%s이(가) 운동하고 있습니다\n", name);
	}
}
