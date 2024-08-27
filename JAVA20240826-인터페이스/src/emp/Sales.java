package emp;

public class Sales extends Employee implements Bonus{
	
	double getExtraPay;
	
	public Sales() {}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void Incentive(int pay) {
		setSalary((getSalary() + (int)(pay*1.2)));
	}
	
	@Override
	double tax() {
		return getSalary()*0.13;
	}
	
	double getExtrapay() {
		return getSalary()*0.03;
	}
	
}
