package F_OOP2;

public class AstractTest01 {
	public static void main(String[] args) {
		
}
}
abstract class unit{
	int x;
	int y;
	
	abstract void move(int x, int y);
	
	void stop(){

	}

}

abstract class Marine extends unit{
	
	void stimpack(){
	
	}
}

class Tank extends unit{
	
	void changeMode(){
	
	}
	@Override
	void move(int x, int y){// 추상클래스를 상속받고 추상클래스를 사용하기 싫다면 선언부는 똑같고 구현부가 다른 오버라이드로 변경
		
	}

}

class Dropship{
	
	void load(){
		
	}
	void unload(){
		
	}
	
	void move(int x, int y ){
		
	}
}