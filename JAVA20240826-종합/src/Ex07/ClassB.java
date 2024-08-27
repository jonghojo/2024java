package Ex07;

public class ClassB extends ClassA{
	private int b;
	public ClassB() {}
	public ClassB(int b) {
		this.b = b;
	}	
	
	public ClassB(int a, int b) {
		super(a);
		this.b = b;
	}
	
	int getB() {
		return b;
	}
	@Override
	void info() {
		super.info();
		System.out.printf(b + " ");
	}
	
}
