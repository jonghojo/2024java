package mobile;

public class Otab extends Mobile{
	
	public Otab() {}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	void info() {
		System.out.printf("%s         %d          %s\n", mobileName, batterySize, osType);
	}
	
	@Override
	void operate(int time) {
		System.out.printf("%s         %d          %s\n", mobileName, batterySize-(12*time), osType);
	}
	
	@Override
	void charge(int time) {
		System.out.printf("%s         %d          %s\n", mobileName, batterySize+(8*time), osType);
	}

}
