package ex02;

public class SamsungTV implements TV{
	 private int sound = 0;
	 private boolean isPower = false;
	 static int stack = 0;
	@Override
	public void powerOn(){
		isPower= true;
		System.out.println("전원이 켜졌습니다");
		System.out.println("현재 소리:" + stack);
		System.out.println();
	}

	@Override
	public void powerOff() {
		isPower= false;
		System.out.println("전원이 꺼졌습니다");
	}

	@Override
	public void soundUp() {
		sound++;
		stack++;
		System.out.println("소리를 1올립니다");
		System.out.println("현재 소리:" + stack);
		System.out.println();
	}

	@Override
	public void soundDown() {      
		sound--;
		if(sound <= 0){
		sound = 0;
	  }
		stack--;
		System.out.println("소리를 1내립니다");
		System.out.println("현재 소리:" + stack);
		System.out.println();
	 }
	   
	   public int getSound() {
	      return sound;
	   }
	   
	   public boolean getPower() {
	      return isPower;
	   }


}
