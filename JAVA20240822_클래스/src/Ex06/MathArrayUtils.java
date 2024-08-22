package Ex06;

public class MathArrayUtils {
	
	static int sum(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++)
		sum += values[i];
		return sum;
	}

	static double avg(int[] values) {
//		double avg = sum(values)/values.length;
		return sum(values)/values.length;
	}
	
	static int max(int[] values) {
		int max = values[0];
		for(int i=0; i<values.length; i++) 
			if(max < values[i]) max = values[i];
		return max;
	}
	
	static int min(int[] values) {
		int min = values[0];
		for(int i=0; i<values.length; i++) 
			if(min>values[i]) min = values[i];
		return min;
	}
}