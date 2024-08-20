package ex05;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[][] kor = {//처음 배열kor[0(i)][0(j)] j가증가하다가 더이상 대입할 값이 없을때 i로돌아가서 kor[1][0]부터 다시시작해서 3이되었을때 종료
				{80,81,82,83,84},
				{90,91,92,93,94},
				{70,71,72,73,74}
		      };
		for(int i=0; i<3; i++) {
			for(int j=0; j<kor[i].length; j++)
				System.out.print(kor[i][j] + ", ");
			System.out.println();
		}
	}

}
