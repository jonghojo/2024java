package ex12;

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
	//Box<? super B> ==> 하한제한 와일드 카드 --> B위쪽의 상위클래스만 사용가능
	//Box에 대입할 수 있는 대상은 B이거나 B상위 클래스만 가능
	// 기능 ==> set만가능 ==> 저장(쓰기전용)
	public static void peekBox(Box<? super B> box) { 
		System.out.println(box);
	}
	
}

public class 하한제한와일드카드1 {

	public static void main(String[] args) {
		
		Box<A> a = new Box();
		Box<B> b = new Box();
		Box<C> c = new Box();
		Box<Object> o = new Box();
		
		BoxFactory.peekBox(a); //B에서 상한제한이 걸렸기떄문에 A는 출력이 안되고 오류가 난다
		BoxFactory.peekBox(b);
//		BoxFactory.peekBox(c);
		BoxFactory.peekBox(o);
		
	}

}
