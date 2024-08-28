package 실습3;

public abstract class Plane {
	String PlaneName;
	int fuelSize;
	
	public Plane() {}
	
	public Plane(String PlaneName, int fuelSize) {
		this.PlaneName = PlaneName;
		this.fuelSize = fuelSize;
	}
	
	public abstract void flight(int distance);
	public abstract void refuel(int fuel);

	public String getPlaneName() {
		return PlaneName;
	}

	public void setPlaneName(String planeName) {
		PlaneName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
	
}
