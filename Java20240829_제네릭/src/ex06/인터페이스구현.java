package ex06;

interface Aable{}

class B implements Aable{}

class C{}

class Box<T extends Aable>{// T 전달은 인터페이스 Able구현 클래스만 전달가능 (인터페이스 클래스는 미완성 클래스라 불가능 하다)
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {//public void setObj(A obj)
		this.obj = obj;
	}
	
}

public class 인터페이스구현 {

	public static void main(String[] args) {
		
		Box<B> bBox = new Box();
		
//		Box<Integer> ibox = new Box();
//		Box<String> ibox = new Box();
		
//		Box<C> cbox = new Box(); error
		
	}

}
