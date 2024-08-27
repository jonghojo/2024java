package mobile;

public class Mobile {
	
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
	
	void operate(int time) {
		System.out.println("Mobile       Battery       Os");
		System.out.println("---------------------------------");
	}
	
	void charge(int time) {
		System.out.println("Mobile       Battery       Os");
		System.out.println("---------------------------------");
	}

}
