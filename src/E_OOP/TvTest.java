package E_OOP;

public class TvTest {
	public static void main(String[] args) {
	String color1 = Tv.color;//오른쪽껄 만든다음에 왼쪽에 넣어주셔야됨 메인메쏘드의 지역변수 컬러가 선언됨
	System.out.println(color1);
	Tv.color="MAGENTA";//
	System.out.println(Tv.color);
	
	
	Tv.changeColor();
	System.out.println(Tv.color);

	
	//TV클래스의 인스턴스 생성, ex) scanner sc = new scanner
	//Tv클래스에 가져온 tv를 저장.(만들어진 클래스에 저장) 
	Tv t= new Tv();//메인메소드의 지역변수 t(메인메쏘드에서 선언을해서 메인메소드기준),tv타입의 참조변수 t,  
	//new는 인스턴스화 , 인스턴스화 후에 인스턴스 생성
	
	//t주소의 power를 출력해주세요
	System.out.println(t.power);//참조변수명.변수명 t방에 있는 power를 가져와라.
	//t주소의 power메서드를 호출해주세요
	t.power();
	//t주소의 power를 출력해주세요
	System.out.println(t.power);
	//t주소의 채널을 16번으로 변경해주세요
	t.channel = 16;
	//t주소의 channelUp메서드를 호출해주세요
	t.channelup();
	//t주소의 채널을 출력해주세요
	System.out.println(t.channel);
	
	Tv t1 = new Tv();
	t1.channel =17;
	
	System.out.println(t1.channel);
	
	}
}


class Tv{//tv라는 클래스를 만들어보자
	//클래스변수 호출방법, 클래스명.변수
	//전역변수, 
	
	//클래스변수
	static String color;
	
	//인스턴스변수
	boolean power;//전원
	int channel;//채널
	
	//클래스메서드
	static void changeColor(){
		color ="green";
		
	}
	//인스턴스메서드
	void channelup(){
		channel++;
	}
	//인스턴스메서드
	void power(){
		power =!power; //껐다켰다 할수있음
		
	}

}
