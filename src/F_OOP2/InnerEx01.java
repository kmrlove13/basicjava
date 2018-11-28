package F_OOP2;

public class InnerEx01 {
	//인스턴스 클래스
	class InstanceInner{
		int iv = 100;
	//	static int cv = 200; , 인스턴스클래스 안에서 클래스변수 사용 안됨
		final static int CONST = 200;
	//상수는 어디서든 쓸수있음	값이 안변해서
	}
	
	static class StaticClass{
		static int cv = 500;
		int iv = 200;
	}
	
	void method(){
		//지역클래스, 메서드 안에서 만들어짐
		class LocalClass {//
			int iv = 200;
			//static int iv = 500; 클래스변수 사용할 수 없음
		}
	}
	
	
	
	
}
