package E_OOP;

public class CarTest {
	public static void main(String[] args) {

//		for (int i =0; i<100; i++){
			Car c1 = new Car();
		
//		}
//		for(int i=0; i<20; i++){
			Car c2= new Car("red","auto",2);
			Car c3= new Car("yellow","auto");
			
		
		
			
	}
	
	
	
}

class Car{
	String color;
	String gearType;
	int door;
	
	
	Car(){//기본생성자
		color = "black";
		gearType = "stick";
		door = 4;
	
	}

	Car(String color,String gearType){//이름이 같을땐 지역변수가 더 높고, 그다음이 전역변수(클래스), 매개생성자
		this(); // this(" "," ",2)->얘가 매개변수 있을때, this();는 무조건 맨위에 작성해야함.위에 아무것도 놓으면 안됨,생성자 안에 생성자
		this.color = color; //this. - 이 인스턴스에라는 뜻으로 클래스의 인스턴스라는 뜻 ,  붙은게 인스턴스 변수
		this.gearType= gearType;
	  }
	
	Car(String color,String gearType, int door){//이름이 같을땐 지역변수가 더 높고, 그다음이 전역변수(클래스), 매개생성자
		this.color = color; //this. - 이 인스턴스에라는 뜻으로 클래스의 인스턴스라는 뜻 ,  붙은게 인스턴스 변수
		this.gearType= gearType;
		this.door = door;
	}


	

	
	//this.
	//this(); 생성자 내부에서 다른 생성자 부를때
	
}

