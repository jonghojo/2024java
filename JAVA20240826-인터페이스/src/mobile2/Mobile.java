package mobile2;

public abstract class Mobile {
	
	String mobileName;
	int batterySize;
	String osType;
	
	public Mobile() {}
	
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	void info() {
		System.out.println("Mobile       Battery       Os");
		System.out.println("---------------------------------");
	}
	
	public abstract void operate(int time);
	public abstract void charge(int time);
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	

}
