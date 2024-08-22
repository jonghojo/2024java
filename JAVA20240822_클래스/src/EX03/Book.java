package EX03;

public class Book {
	
	private String title;
	private String author;
	private int page;
	
	Book(){}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		//this(title, author, 0); this는 문장 서두에있어야만 한다
	}

	Book(String title, String author, int page) {
		   this.title = title;
		   this.author = author;
		   this.page = page;
		   //page = this.page; // 오류 page지정한 값에다가 기본값인 0을 집어넣게 된다
	}
	
	void displayInfo() {
		System.out.printf("제목 :%s, 작가 :%s, 페이지 :%d\n", title, author, page);
	}

}
