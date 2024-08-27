package mobile;

public class Ltab extends Mobile{
	
	public Ltab() {}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	void info() {
		System.out.printf("%s         %d           %s\n", mobileName, batterySize, osType);
	}
	
	@Override
	void operate(int time) {
		System.out.printf("%s         %d           %s\n", mobileName, batterySize-(10*time), osType);
	}
	
	@Override
	void charge(int time) {
		System.out.printf("%s         %d           %s\n", mobileName, batterySize+(10*time), osType);
	}

}
