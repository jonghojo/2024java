package ex08;


class Box<T>{
	private T obj;

	public T getObj() {return obj;}
	public void setObj(T obj) {this.obj = obj;}
	
}

class BoxFactory{
	//제네릭메소드
	public static <T extends Number> Box<T> Boxing(T o){// Integer, long, double.....
		//markBox가 제네릭 메소드 선언(markBox말고 다른것으로 선언해도 산관은 없다 예를들어 Boxing같은것으로)
		Box<T> box = new Box<T>();
		box.setObj(o);
		return box;
	}
	
}

public class 제네릭메소드 {

	public static void main(String[] args) {
		
		Box<Integer> iBox = BoxFactory.Boxing(new Integer(1000));//이거는 Box<Integer> iBox = BoxFactory.markBox(1000);와 똑같은 명령어다
		System.out.println(iBox.getObj());
		Box<Double> dBox = BoxFactory.Boxing(new Double(15.25));//위와 마찬가지로 Box<Double> dBox = BoxFactory.markBox(15.25);와 같다
		System.out.println(dBox.getObj());
		//위 2개의 명령어와 같이 줄이그어져 있으면 없어도 된다는 뜻이다
		
		Box<Integer> i = BoxFactory.Boxing(10);
		Integer i2 = i.getObj();
		System.out.println(i2);
		
	}

}
