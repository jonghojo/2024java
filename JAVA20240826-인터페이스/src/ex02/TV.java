package ex02;

public interface TV {
	
	int MAX = 100; // public final
	void powerOn();// 앞에 abstract public 생략
	void powerOff();
	void soundUp();
	void soundDown();
	
	//채널변경 추가
	//추가하지만 기존것에 영향을 주기싫으면 default 사용(구현을 하여도되고 하지않아도 된다)
	default void chanelUp() {
		
	};
	
	default void chanelDown() {
		
	};
}
