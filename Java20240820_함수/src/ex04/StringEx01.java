package ex04;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		//String: "", char: ''
		//==사용시 주소값을비교하지만 equals를 사용시 주소값내에있는 내용이 같냐를 비교하게된다
		
		String str1 = "korea";
		String str2 = new String("801020-1079146");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = str1.charAt(4);
//		System.out.println(ch);
		
		char ch2 = str2.charAt(7);
		String s = (ch2 == '1') ? "남" : "여";
		System.out.println(ch2);
		System.out.println(s);
		
		int len = str1.length();
		System.out.println(len);
		
		String oldStr = "java programing";
		
		String newStr = oldStr.replace("java", "spring");
		
		System.out.println(newStr); //원본객체는 유지하고 수행객체만 새로운 문자로 대체한다
		System.out.println(oldStr);
		
		String sub1 = oldStr.substring(3);
		System.out.println(sub1);
		
		String sub2 = oldStr.substring(5,9);//5번문자부터 9번문자까지
		System.out.println(sub2);
		
		
		int len2 = oldStr.indexOf("prog");//만약 없는단어일경우 -1값으로 표시된다
		System.out.println(len2);
		
		String board = "국어,영어,수학,컴퓨터";
		
		String[] sArr = board.split(",");
		
		for(int i=0; i<sArr.length; i++)
			System.out.println(sArr[i]);
		
		String phone = "010-2047-0486";
		
		String[] phone2 = phone.split("-");
		
		for(int i=0; i<phone2.length; i++)
			System.out.println(phone2[i]);
		
		String str3 = "com";//없으면 새로만들지만 있으면 같은것을 공유한다
		String str4 = "com";
		
		System.out.println(str3 == str4);//단어가 같냐는것을 비교
		
		String str5 = new String("com");//같은 것이있어도 주소를 새로만든다, 주소값도 같은것을 사용한다
		String str6 = new String("com");
		
		System.out.println(str5 == str6);//주소값이 같냐를 비교
		
		boolean b = str3.equals(str4);
		System.out.println(b);
		
		boolean b2 = str5.equals(str6);//주소값 비교가아닌 주소값내에있는 내용이 같냐를비교
		System.out.println(b2);
		
		System.out.println(oldStr.startsWith("java"));//startsWith는 ()안에있는다어로 시작하냐를 판단해준다
		
		String str7 = "      Java Spring       ";
		System.out.println(str7.length());
		
		String str8 = str7.trim();
		System.out.println(str8);
		System.out.println(str7);
		
		System.out.println(str8.toUpperCase());
		System.out.println(str8.toLowerCase());
		
	}

}
