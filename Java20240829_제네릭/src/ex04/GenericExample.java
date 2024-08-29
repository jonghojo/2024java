package ex04;

public class GenericExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product1 = new Product<Tv, String>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		System.out.printf("%s\t %s\t\n", tv, tvModel);
		
		System.out.println("----------------------");
		
		Product<Car, Integer> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel(10);
		
		Car car = product2.getKind();
		Integer carModel = product2.getModel();
		
		System.out.printf("%s\t %d\t", car, carModel);
		
	
	}

}
