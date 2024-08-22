package Ex05;

public class Car {

	private String name;
	private static int count = 0;
	
	Car(String name){
		this.name = name;
		count++;
//		System.out.printf("차량 구입, 이름: %s\n", name);
	}
	void info() {
		System.out.printf("차량 구입, 이름: %s\n", name);
	}
	
	static void showTotalCars() {
		System.out.printf("구매한 차량수: " + count);
	}
}
