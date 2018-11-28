package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		fc.water();
		
		Car c = fc;// up-casting
		c.drive();
		
		FireCar fc2 =(FireCar)c; //down-casting
//		FireCar fc3 =(FireCar)new Car(); 이렇게는 못함 이미 주소가 생성된것만 다운캐스팅이 가능
		
		
		
	}
}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("순천으로 가자");
	}
	
	void stop(){
		System.out.println("주차중");
	}
}

class FireCar extends Car{
	void water(){
		System.out.println("물뿌려");
	}
}