package 연습문제;


class Container<T>{
	private T item;
	public T getItem() {return item;}
	public void setItem(T item) {this.item = item;}
	public boolean isEmpty() {
		return item == null;
	}

}


public class ContainerTest {

	public static void main(String[] args) {
		
		Container<String> sContainer = new Container<>();
		System.out.println("반값 확인1 :" + sContainer.isEmpty());
		
		sContainer.setItem("data1");
		System.out.println("저장 데이터 :" + sContainer.getItem());
		System.out.println("반값 확인2 :" + sContainer.isEmpty());
		
		Container<Integer> iContainer = new Container();
		iContainer.setItem(10);
		System.out.println("저장 데이터 :" + sContainer.getItem());

	}

}




