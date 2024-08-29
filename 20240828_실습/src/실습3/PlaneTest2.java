//package 실습3;
//
//public class PlaneTest2 {
//
//	public static void main(String[] args) {
//		
//		Airplane air = new Airplane("L747", 1000);
//		Cargoplane car = new Cargoplane("C40", 1000);
//		
//		Plane[] plane = {air, car};
//		PlaneTest2.printinfo(plane, true);
//		
//		air.flight(100);
//		air.flight(100);
//		
//		air.refuel(200);
//		car.refuel(200);
//		
//		PlaneTest2.printinfo(plane, false);
//	}
//	
//	public static void printinfo(Plane[] plane2, boolean bd, boolean br) {
//		
//		if(bd) {
//			System.out.println("plane\t fuelSize");
//			System.out.println("---------------");
//			
//			for(Plane plane : plane2) {
//				System.out.printf("%s\t %d\t\n", plane.getPlaneName(), plane.getFuelSize());
//			}
//			
//			System.out.println();
//			System.out.println("[100 운항]");
//		}
//		
//		if(br) {
//			System.out.println("plane\t fuelSize");
//			System.out.println("---------------");
//			
//			for(Plane plane : plane2) {
//				System.out.printf("%s\t %d\t\n", plane.getPlaneName(), plane.getFuelSize());
//			}
//			
//			System.out.println();
//			System.out.println("[200 주유]");
//		}
//		
//		else {
//			System.out.println("plane\t fuelSize");
//			System.out.println("---------------");
//			
//			for(Plane plane : plane2) {
//				System.out.printf("%s\t %d\t\n", plane.getPlaneName(), plane.getFuelSize());
//			}
//			
//		}
//		
//	}
//	
//
//}
