package Ex07;

public class Main {

	public static void main(String[] args) {
		
		ClassC c= new ClassC(10, 20, 30);
		
		c.info();//10 20 30 출력
		/*= ClassC(int a, int b, int c)
		 * = int a = getA, int b = getB, int c = c
		 */
		
		func(new ClassA());
		func(new ClassB());
		func(new ClassC());
	}
	
	
	static void func(ClassA a) {
		
//		ClassA a0 = new ClassA();
//		ClassA a1 = new ClassA();
//		ClassA a2 = new ClassA();
		
		if(a instanceof ClassC) {
			ClassC c = (ClassC)a;
		}
		else if(a instanceof ClassB) {
			ClassB c = (ClassB)a;
		}
	}
	

}
