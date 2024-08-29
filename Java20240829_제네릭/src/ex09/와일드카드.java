package ex09;


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
	//제네릭 탑입
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	//? ==> 와일드카드
	public static <T> void peekBox(Box<T> box) {
//	public static void peekBox(Box<?> box) { 위에랑 같다
		System.out.println(box);
	}
	
}

public class 와일드카드 {

	public static void main(String[] args) {
		
		Box<String> box = new Box();
		box.setObj("Sweet");
		BoxFactory.peekBox(box);
		
		Box<Integer> ibox = new Box();
		BoxFactory.peekBox(ibox);
		
	}

}
