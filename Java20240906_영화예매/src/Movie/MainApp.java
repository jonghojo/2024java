package Movie;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		
		Menu menu = MainMenu.getInstance();//메뉴 메뉴를 불러옵니다
//		System.out.println(menu);
		while(menu != null) { //메뉴가 있으면 반복
			menu.print(); //현재 메뉴 출력
			menu = menu.next(); //사용자 입력 후, 다음 메뉴로 갱신
//			System.out.println(menu);
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}


