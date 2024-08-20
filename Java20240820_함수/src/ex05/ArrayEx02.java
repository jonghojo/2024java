package ex05;

public class ArrayEx02 {

	public static void main(String[] args) {
		//복사
		int[] oldIntArr = {1,2,3};//방 3개만들고 각각의방에 1/2/3넣음
		
		int[] newIntArr = new int[5];//방을 5개 만들었지만 각각의방에 0만들어가있음

		newIntArr = oldIntArr;
		
//		oldIntArr[2]=300;
		for(int i=0; i<oldIntArr.length; i++)//각 방에 하나씨넣다가 2번쨰 방에 300집어 넣기
			System.out.println(oldIntArr[i]);
		
		for(int i=0; i<newIntArr.length; i++)//odIntArr와 같다고 되어있으므로 int[5]가아닌 {1,2,3}3가지로 출력한다
			System.out.println(newIntArr[i]);
			
		System.out.println("-----------------------------");
		
		//oldIntArr2에있는 값을 newIntArr2에복사 
		int[] oldIntArr2 = {1,2,3};
		int[] newIntArr2 = new int[5];
		
		for(int i=0; i<oldIntArr2.length; i++)
			newIntArr2[i] = oldIntArr2[i];
		//앞에있는(방만만든)배열에다가 뒤에있는(숫자를 넣어놓은)배열은 복사한다 앞에있는배열의수(방의 갯수)보다 뒤에있는배열의 수(방의 갯수)가 클수는없다
		//[i]안에 들어가는 숫자의 방만 똑같이 만든다
		
		oldIntArr[2]=300;
		for(int i=0; i<oldIntArr.length; i++)
			System.out.println(oldIntArr[i]);
		
		for(int i=0; i<newIntArr2.length; i++)
		//0번째 1번째 2번째는 똑같이 작동하나 이번에는 방이 5개이므로 3번째 4번째는 0값이 들어가고 그대로 출력
			System.out.println(newIntArr2[i]);
		
		System.out.println("-----------------------------");
		
		//oldIntArr2에있는 값을 newIntArr2에복사 
		int[] oldIntArr3 = {10,20,30,40,50};
		int[] newIntArr3 = new int[5];
		System.arraycopy(oldIntArr3, 0, newIntArr3, 0, oldIntArr3.length);
		//                                         몇번째부터 몇번째까지
		for(int i=0; i<oldIntArr3.length; i++)
			System.out.println(oldIntArr3[i]);
		
		System.out.println("------");
		
		for(int n : newIntArr3)
			System.out.println(n);
		
		String[] str = {"java","spring","python","javascript"};//입력하고싶은 문자배열
		for(int i=0; i<str.length; i++)//for문으로 반복하기
			System.out.println(str[i]);
		
		for(String s : str)//향상된 for문으로 반복하기(반복해서 문자(숫자)를가져오며 출력을 반복하다가 더이상 가져올게 없을경우 반복을 종료한다)
			System.out.println(s);
//		for(int i=0; i<newIntArr3.length; i++)
//			System.out.println(newIntArr3[i]);
		
		
	}

}
