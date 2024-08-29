package ex02;

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

class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}


public class FruitAndBox {
	
	public static void main(String[] args) {
		
		Box aBox = new Box(); //Apple 담는 박스
		Box oBox = new Box(); //Orange 담는 박스
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		//형변환 해야하는 불편함 
		Apple ap = (Apple)aBox.getObj();
		Orange op = (Orange)oBox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		aBox.setObj("new Apple()");
		
//		Apple ap2 = (Apple)aBox.getObj();
		
		System.out.println(aBox.getObj());
		
	}

}
