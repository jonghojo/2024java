package Ex03;

public class Job extends Person{
	
	private String want;
	private int kg;
	
	public Job(String name, int age, String want, int kg) {
		super(name, age);
		this.want = want;
		this.kg = kg;
	}
	@Override
	public void info() {
		super.info();
		System.out.printf("제 장래희망은 %s대표선수이고, 체급은 %dkg급입니다\n", want, kg);
	}
	
	public void hope() {
		System.out.printf("%s의 장래희망은 %s대표선수 %dkg급입니다.\n", name, want, kg);
	}
}
