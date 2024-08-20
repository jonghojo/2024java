package ex03;

public class ReferaceVer {

	public static void main(String[] args) {
		
		int[] arr1 = null;
		int[] arr2;
		int[] arr3;//값을 바로 입력 불가능하고 주소값을 넣어야만 한다
		
		System.out.println(arr1);
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		
		
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
	}

}
