package E_OOP;

public class MemberCall {

	int iv=10;
	static int cv=100;
	
	int iv2=iv;//인스턴스 생성이 되었기때문에 iv가 가능
	int iv3=cv;
	
	static int cv2=cv;
	//static int cv3=iv; 아직 인스턴스 생성이 안되었기때문에 빨간줄.
	
	
	static void method(){
		cv=500;
//		iv=500;
	}
	
	void method2(){
		cv=1000;
		iv=1000;
	}
	
	

}
