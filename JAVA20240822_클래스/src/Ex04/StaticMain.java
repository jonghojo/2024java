package Ex04;

class StaticEx{
	int count = 0;//멤버변수, 인스턴스변수(개별자원)
	static int cnt = 0;//정적변수, 클래스변수(공유자원)
	
	void func() {
		// 인스턴스변수, 클래스 변수, 인스턴스 메소드, 클래스 메소드 사용가능
	}
	
	
	
	
	static void sfunc() {
		//클래스변수, 클래스 메소드만 사용가느, 인스턴스변수, 인스턴스 메소드 사용불가
	}
}
public class StaticMain {

	public static void main(String[] args) {//객체생성안하고 접근하겠다
		
		StaticEx ex1 = new StaticEx();
		ex1.count++;
		ex1.cnt++;//=staticEx.cnt
		System.out.println(ex1.count + ", " + ex1.cnt);
		
		StaticEx ex2 = new StaticEx();
		ex2.count++;
		ex2.cnt++;
		System.out.println(ex2.count + ", " + ex2.cnt);
		
		StaticEx ex3 = new StaticEx();
		ex3.count++;
		ex3.cnt++;
		System.out.println(ex3.count + ", " + ex3.cnt);
	}

}
