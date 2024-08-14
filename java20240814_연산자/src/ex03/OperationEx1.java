package ex03;

public class OperationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 45000;
		{
		int sec;
		int min;
		int hours;
		
		hours = num/3600;
		min = (num%3600)/60;
		sec = num%60;
		
		System.out.println(hours + "시간" + min + "분" + sec + "초");
		}
		//시간
		int hours = num/3600;
		int remainseconds = num % 3600;
		
		//분
		int min = remainseconds/60;
		remainseconds %= 60;
		
		System.out.printf("%d시간 %d분 %d초\n", hours, min, remainseconds);
		
	}

}
