package 실습3;

public class Cargoplane extends Plane{
	
	public Cargoplane() {}
	
	public Cargoplane(String PlaneName, int fuelSize) {
		super(PlaneName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		int tmp = getFuelSize() - (distance*50)/10;
		setFuelSize(tmp);
	}
	
	@Override
	public void refuel(int fuel) {
		setFuelSize(getFuelSize() + fuel);
	}

}
