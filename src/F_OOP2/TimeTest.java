package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 100; //시간은 23시간 59분
//		System.out.println(t.hour);//앞은 포함 뒤는 미포함 
		t.setHour(100);
		int hour = t.getHour();
		System.out.println(hour); //4
		
		t.setMinute(150);
		int hour2 = t.getHour();
		int minute = t.getMinute();
		System.out.println(hour2+" : "+minute); //6:30

		t.setSeconds(10000);
		int hour3 = t.getHour();
		int minute2 = t.getMinute();
		int seconds = t.getSeconds();
		System.out.println(hour3+" : "+minute2+" : "+seconds); //9:16:40
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour){//디폴트, 프로텍티드, 퍼블릭 모두 왼쪽에 사용 가능
		this.hour = hour%24;
		}
	void setMinute(int minute){
		this.minute = minute%60;
		setHour(this.hour+minute/60);
	}
	
	void setSeconds(int second){
		this.second=second%60;
		setMinute(this.minute+second/60);
	}
	
	
	int getHour(){//프라이벗 변수는 같은 클래스 내에서만 사용하기때문에 이 클래스를 다른 클래스에서 실행시키고 싶다면 실행시키는 메서드를 생성
		return hour;
	}
	
	int getMinute(){
		return minute;
	}
	
	int getSeconds(){
		return second;
	}
	
	
}