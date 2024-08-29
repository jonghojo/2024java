package ex03;

class Apple{
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an Orange.";
	}
}

class Box<T> {//제네릭 기반의 클래스 정의
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}


public class FruitAndBox {
	
	public static void main(String[] args) {
		
//		Box aBox = new Box();
//		
//		aBox.setObj(new Apple);
//		
//		Apple ap = (Apple)aBox.getObj();
		
		
		//<>안 단어가 class Box<T>에서 T를 대체하게된다. 이렇게 제네릭기반의 클래스를만들게되면 여거 클래쓰를만들지 않고 하나의 클래스만 생성 후 <>안의 단어만 바꿔가면서 사용이 가능하다
		Box<Apple> aBox = new Box<Apple>();
		aBox.setObj(new Apple());
		Apple ap = aBox.getObj();
		System.out.println(ap);
		/*
		 * class Box {//제네릭 기반의 클래스 정의
				private Apple obj;

				public Apple getObj() {
				return obj;
				}

				public void setObj(Apple obj) {
					this.obj = obj;
				}
	
			}
		 */
		
		Box<Orange> oBox = new Box<Orange>();
		oBox.setObj(new Orange());
		Orange op = oBox.getObj();
		System.out.println(op);
		
		/*
		 * class Box {//제네릭 기반의 클래스 정의
				private Orange obj;

				public Orange getObj() {
				return obj;
				}

				public void setObj(Orange obj) {
					this.obj = obj;
				}
	
			}
		 */
		
		Box<String> sBox = new Box();
		sBox.setObj("홍길동");
		String str = sBox.getObj();
		System.out.println(str);
		
		/*
		 * class Box {//제네릭 기반의 클래스 정의
				private String obj;

				public String getObj() {
				return obj;
				}

				public void setObj(String obj) {
					this.obj = obj;
				}
	
			}
		 */
		
		Box<String> sBox1 = new Box();
		sBox1.setObj("550만");
		String str2 = sBox1.getObj();
		System.out.println(str2);
		
	}

}
