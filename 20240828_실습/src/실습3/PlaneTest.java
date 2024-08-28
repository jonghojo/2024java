package 실습3;

public class PlaneTest {

	public static void main(String[] args) {
		
		Airplane air = new Airplane("L747", 1000);
		Cargoplane car = new Cargoplane("C40", 1000);
		
//		Plane[] plane = {air, car};
//		PlaneTest.printinfo(plane, true);
//		
//		air.flight(100);
//		air.flight(100);
//		
//		air.refuel(200);
//		car.refuel(200);
//		
//		PlaneTest.printinfo(plane, false);
		PlaneTest.printTitle();
		PlaneTest.printinfo(air);
		PlaneTest.printinfo(car);
		
		System.out.println();
		System.out.println("[100운항]");
		air.flight(100);
		car.flight(100);
		PlaneTest.printTitle();
		PlaneTest.printinfo(air);
		PlaneTest.printinfo(car);
		
		System.out.println();
		System.out.println("[200주유]");
		air.refuel(200);
		car.refuel(200);
		PlaneTest.printTitle();
		PlaneTest.printinfo(air);
		PlaneTest.printinfo(car);
		
	}
	
	public static void printinfo(Plane plane) {
		System.out.printf("%s\t %d\t\n", plane.getPlaneName(), plane.getFuelSize());
	}
	
	public static void printTitle() {
		System.out.println("Plane   fuelSize");
		System.out.println("----------------");
	}

}
