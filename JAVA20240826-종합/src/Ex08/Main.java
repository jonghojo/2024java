package Ex08;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book("JAVA", 10000, "han", "12345");
		Album album = new Album("앨범1", 15000,"seo");
		Movie movie = new Movie("영화1", 18000,"감독1", "배우1");
		
		book.info();
		album.info();
		movie.info();
	
		int sum = book.getprice() + album.getprice() + movie.getprice();
		System.out.println("삼품가격의 합 :" + sum);
	}

}
