package ex10;


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
	//Box<? extends Number> ==> 와일드 카드 상한제한
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	//? ==> 와일드카드
//	public static <T> void peekBox(Box<T> box) {
	public static void peekBox(Box<? extends Number> box) { //위에랑 같다
		System.out.println(box);
	}
	
}

public class 상한제한와일드카드 {

	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box();
		iBox.setObj(1234);
		
		Box<Double> dBox = new Box();
		dBox.setObj(12.15);
		
		Box<String> sBox = new Box();
		sBox.setObj("KROEA");
		
		BoxFactory.peekBox(iBox);
		BoxFactory.peekBox(dBox);
//		BoxFactory.peekBox(sBox); error Number 에서 제한을 걸엇다는 것은 Number 본인 및 본인의 하위 클래스 들만 입력이 가능하다는뜻 그러므로 String 은 입력불가능 하다
	}

}
