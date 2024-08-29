package 연습문제;

public class Pair<F, S>{
	private F First;
	private S Second;
	
	public F getFirst() {
		return First;
	}
	public void setFirst(F first) {
		First = first;
	}
	public S getSecond() {
		return Second;
	}
	public void setSecond(S second) {
		Second = second;
	}
	
	@Override
	public String toString() {
		return "pair{first=" + First +", second=" + Second + "}";
	}
	
	
}

