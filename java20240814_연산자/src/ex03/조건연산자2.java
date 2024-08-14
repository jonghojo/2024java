package ex03;

public class 조건연산자2 {

	public static void main(String[] args) {
		
		// 국어점수가 70이고 영어점수가 70이상이면 합격, 불합격
		
//		int kor = 85;
//		int eng = 65;
//		
//		int avg = (kor + eng) / 2;
//		
//		String result = (avg >= 70) ? "합격" : "불합격";
//		
//		System.out.println(result);

		// 국어점수가 80이상이면 우수, 60 이상이면 보통, 60 미만은 분발 
		
		int kor = 50;
		
		String result = (kor >= 80) ? "우수" : (kor >= 60) ? "보통" : "분발";
		
		System.out.println(result);
		
	}

}
