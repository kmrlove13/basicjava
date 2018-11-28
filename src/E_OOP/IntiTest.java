package E_OOP;

public class IntiTest {
	public static void main(String[] args) {
		System.out.println(Init.action); //0->55
			//명시적초기화-> 클래스초기화 블럭
		Init it = new Init(); //15->20 명시적초기화 ->생성자를 이용한 초기화
		// 명시적 초기화 => 인스턴스 초기화 블럭=> 생성자를 이용한 초기화
		System.out.println(it.action2);//20
		
		
		
		
		
		
		
		
		
	}

}

class Init{//Init 무언가를 시작할때 이 표현 사용많이 함
	
	static int action;
	int action2 = 15;//명시적 초기화
	int action3;
	
	
	Init(){//기본 생성자
		action2 = 20;
		
	}
	
	static {//클래스 초기화 블럭
		//많은 수식이 있다고 치자
		action = 55;
		
	}
	
	{//인스턴스 초기화 블럭
	//많은수식이 있다고 치자
	
		action2=100;
	
	}
	
	
	{
		//많은수식
		action3 = 150;
	}
}