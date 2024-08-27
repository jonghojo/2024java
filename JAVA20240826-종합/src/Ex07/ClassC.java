package Ex07;

public class ClassC extends ClassB{
	private int c;
	public ClassC() {}
	public ClassC(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	
//	void info() {
//		System.out.println(getA() + " " + getB() + " " + c);
//	}
	@Override
	void info() {
		super.info();
		System.out.printf(c + " ");
	}
}
