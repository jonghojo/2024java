package emp;

public class Secretary extends Employee implements Bonus{
	
	public Secretary() {}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void Incentive(int pay) {
		setSalary( (getSalary()+(int)(pay*0.8)));
	}

	@Override
	double tax() {
		return getSalary()*0.1;
	}
	
}
