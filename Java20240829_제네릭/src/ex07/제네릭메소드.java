package ex07;


class Box<T>{
	private T obj;

	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}
	
}

class BoxFactory{
	//제네릭메소드
	public static <T> Box<T> markBox(T o){//markBox가 제네릭 메소드 선언(markBox말고 다른것으로 선언해도 산관은 없다 예를들어 Boxing같은것으로)
		Box<T> box = new Box<T>();
		box.setObj(o);
		return box;
	}
	
}

public class 제네릭메소드 {

	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.markBox("Sweet");
		String str = sBox.getObj();
		System.out.println(str);
//		System.out.println(sBox.getObj());
		
		Box<Integer> iBox = BoxFactory.markBox(10);
		Integer itg = iBox.getObj();
		System.out.println(itg);
//		System.out.println(iBox.getObj());
		
	}

}
