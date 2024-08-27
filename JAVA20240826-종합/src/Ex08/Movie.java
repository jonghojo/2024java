package Ex08;

public class Movie extends Item{
	
	private String director;
	private String actor;
	
	public Movie(String name, int price, String director, String actor) {
		super(name, price);
		this.director = director;
		this.actor = actor;
	}
	@Override
	public void info() {
		super.info();
		System.out.printf("- 감독:%s, 배우:%s\n", director, actor);
	}
	

}
