package ex11;

class A{}
class B extends A{}
class C extends B{}

class Box<T>{
	private T obj;
	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}
	@Override
	public String toString() {
		return obj.toString();
	}
	
}

class BoxFactory{
	//Box<? extends B> ==> 와일드 카드 상한 제한 --> B아래쪽의 하위 클래스만 사용 가능
	//Box 에 대입할 수 있는 대상은 B이거나 B하위 클래스만 가능
	// 기능 ==> get만가능 ==> 호출(읽기전용)
	public static void peekBox(Box<? extends B> box) { 
		System.out.println(box);
	}
	
}

public class 상한제한와일드카드2 {

	public static void main(String[] args) {
		
		Box<A> a = new Box();
		Box<B> b = new Box();
		Box<C> c = new Box();
		
//		BoxFactory.peekBox(a); B에서 상한제한이 걸렸기떄문에 A는 출력이 안되고 오류가 난다
		BoxFactory.peekBox(b);
		BoxFactory.peekBox(c);
		
	}

}
