package ex04;

public class StringBuilderMain {

	public static void main(String[] args) {
		//StringBuilder = StringBuffer
//		StringBuffer builder = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		builder.append("DEF");
		
		System.out.println(builder);
		
		builder.insert(0, "ABC");
		//0번쨰 앞에다가 ABC를 넣겠다
		System.out.println(builder);
		
		builder.insert(1, "K");
		
		System.out.println(builder);
		
		builder.delete(1, 4);
		//1번부터(1번포함) 시작해서 2번째 전까지삭제
		System.out.println(builder);
		
	}

}
