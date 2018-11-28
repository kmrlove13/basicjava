package E_OOP;

public class TotalTest {//클래스가 여러개지만 TotalTest클래스를 기준(파일명인 이름의 클래스)으로 다른 클래스들은 아직 로드가 안됨. 각 클래스가  호출될때 클래스가 로드됨.
	//main메서드 안에서 TotalTest클래스가 로드되고 클래스 친구들인 클래스 변수, 클래스 메서드도 같이 로드된다.
	//클래스 변수는 없고 클래스 메서드인 main이 로드된다.
	public static void main(String[] args) {//main메서드가 호출되고 호출될때 call stack에 쌓인다.

		TvMaker.color = "Blue"; // TvMaker 클래스가 로드되고, TvMaker 클래스의 클래스친구 클래스 메서드가 같이 로드,클래스변수 color=null(기본값), 
		//클래스변수 inch=0(기본값)로드, 클래스 메서드는 없음
		//대입연산자, 왼쪽에 오른쪽값을 대입하라 라는 뜻,TvMaker의 클래스변수 color에 string타입의 blue를 대입, color의 기본값 null에서 blue로 변경
		TvMaker tm = new TvMaker(); 
		tm.age = 30; //TvMaker 클래스의 객체를 생성 후, 객체의 주소를  메인메서드안에서 선언된 참조변수(tm 지역변수를 생성할때 call stack의 메인메서드안에 저장)에 저장, 
		//new로 인스턴스화할때 heap memorial에 tm의 주소가 생기고 인스턴스친구들이 로드됨.인스턴스 변수name = "",age=0, 기본생성자 TvMaker(),TvMaker(string,int)로드되고 
		//tm에 대입이됨, 그리고 tm의주소를 로드하고 tm의주소의 인스턴스 변수 age에 30을 대입을함.
		
		// 3. 메서드 호출: 클래스명.메서드(), 동일한 클래스안에서 만들어진 메서드를 호출할땐 클래스명 생략가능
		// 3.1 TvControll클래스의 클래스변수channel을 호출하는데, TvControll 클래스의 클래스변수 channel=15, MAX_CHANNEL=50, MIN_CHANNEL=1, 
		//클래스메서드 volumeDown()가 로드됨. 로드된 TvControll의 클래스변수 channel을 출력하면 기본값이 15가 출력. 
		System.out.println(TvControll.channel);
		TvControll.volumeDown();//TvControll클래스가 로드되고 클래스메서드 volumeDown()를 호출(호출될때 call stack에 쌓이고, 끝나면 퇴근)자세한 설명은 메서드에 작성
		System.out.println(TvControll.channel);//TvControll클래스 로드하고 클래스메서드 volumeDown()출력

		// 3.2
		TvControll tc; //TvControll클래스타입의 tc를 선언, 아직 주소가 생성이 안되었기에 선언만.
		tc = new TvControll(); //TvControll클래스 타입의 tc라는 지역변수를 메인메서드 안에서 생성(메인메서드안에 tc라는 지역변수를 만들고 new를 통해 
		//인스턴스화 해서 tc의 주소인 인스턴스가 생김(heap memorial에 저장). 인스턴스가 생길때 인스턴스변수volume = 99,MAX_VOLUME=100,MIN_VOLUME = 0, 인스턴스 메서드 volumeUp()가 로드
		//tc에 tc의 주소가 대입
		System.out.println(tc.volume); //tc의 주소를 로드하고 그 안의 인스턴스변수인 volume의 값인 99가 출력
		tc.volumeUp();//tc의 주소를 로드하고 그 안의 인스턴스 메서드를 호출(call stack에 쌓이고 마무리 되면 퇴근)
		
		
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		//
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1. 전역변수
	// 1.1 클래스변수
	static String color;
	static int inch;
	// 1.2 인스턴스 변수
	String name = "";
	int age;

	// 2.생성자: 인스턴스가 생성자일때 호출되는 인스턴스 초기화 메서드, 호출되는것도 일반 인스턴스랑 똑같지만 new일때만 호출됨
 	//눈에는 안보이지만 클래스가 로드될때 컴파일러가 기본형식의  생성자를 만들어줌
	//매서드처럼 클래스 내에 선언,리턴값이 없다, 생성자의 명은 클래스 명과 동일
	// 2.1기본생성자
	TvMaker() {
		
		
		this("man", 25);//this();는 무조건 맨위에 작성해야함.위에 아무것도 놓으면 안됨,생성자 안에 생성자, this(string, int)인 
	}

	// 2.2 매개변수가 있는 생성자
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;// final이 붙었다는건 상수, 최종값으로 변경할수 없는 값
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {//volumeUp()가 호출되면 인스턴스변수 volum의 값이 인스턴스변수(상수)MAX_VOLUME이랑 같을때 volum변수에 인스턴스변수(상수) MIN_VOLUME을 대입
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {//그렇지 않으면 인스턴스변수 볼륨 1증가
			volume++;
		}

		return volume;//볼륨의 값을 반환하라, 반환값인 볼륨이 int타입이기에 볼륨업 메서드 타입도 int
	}

	static int volumeDown() {//클래스변수channel값과 클래스변수(상수)MAX_CHANNEL값이 같다면 channel에 MIN_CHANNEL을 대입하라
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {//그렇지 않으면 클래스변수 채널의값을 1증가
			channel++;
		}
		return channel;//채널값을 반환하라.
	}
}

class Calc {
	// 5.반환값
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}