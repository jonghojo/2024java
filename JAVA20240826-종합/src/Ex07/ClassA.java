package Ex07;

public class ClassA {
	
	private int a;
	
	public ClassA() {}
	
	public ClassA(int a) {
		this.a = a;
	}
	
	int getA() {
		return a;
	}
	
	void info() {
		System.out.printf(a + " ");
	}
}
