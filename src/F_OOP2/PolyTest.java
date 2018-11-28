package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1.스마트티비 3대 저장하세요
		
		SmartTv[] st = new SmartTv[3];
		st[0] = new SmartTv();
		st[1] = new SmartTv();
		st[2] = new SmartTv();	
		//2.ThreeDTv 2대 저장
		
		ThreeDTv[] dt = new ThreeDTv[2];
		dt[0] = new ThreeDTv();
		dt[1] = new ThreeDTv();
		//3.AfreecaTv 4대 저장
		
		AfreecaTv[] at= new AfreecaTv[4];
		at[0] = new AfreecaTv();
		at[1] = new AfreecaTv();
		at[2] = new AfreecaTv();
		at[3] = new AfreecaTv();	
		
		
		//다형성으로 하나로 만들기
		Tv[] t =new Tv[9];
		t[0] = new SmartTv(); // up-casting 자손을 부모로 
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
		
		SmartTv st4 = (SmartTv)t[2];
		//down_casting 부모타입을 자손타입으로
		SmartTv st5 = new SmartTv();
	
	
	
	
	}
	
}

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power=!power;
	}

	void channelUp(){
		channel++;
	}

}

class SmartTv extends Tv{
	void internet(){
		
	}
}

class ThreeDTv extends Tv{
	void threeD(){
		
	}
	
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}