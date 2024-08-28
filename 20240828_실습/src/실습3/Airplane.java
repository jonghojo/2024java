package 실습3;

public class Airplane extends Plane{
	
	public Airplane() {}
	
	public Airplane(String PlaneName, int fuelSize) {
		super(PlaneName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		int tmp = getFuelSize() - (distance*30)/10;
		setFuelSize(tmp);
	}
	
	@Override
	public void refuel(int fuel) {
		setFuelSize(getFuelSize() + (fuel));
	}
}
