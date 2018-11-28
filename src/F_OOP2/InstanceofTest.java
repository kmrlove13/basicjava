package F_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		if(fc instanceof FireCar){//fc는 파이터카에 포함되어 있는가
			System.out.println("fc는 FireCar의 인스턴스이다");
			FireCar fc2 = fc;
		}
		
		if(fc instanceof Car){
			System.out.println("fc는 Car의 인스턴스이다.");
			Car c2 = fc;//up-casting이 생략되어잇다.
		}
		
		if(fc instanceof Object){
			System.out.println("fc는 Object의 인스턴스이다.");
			Object o2 = fc; //up-casting이 생략
		}
		
		Car c = new Car();
		if(c instanceof Car){
			System.out.println("c는 Car의 인스턴스이다.");
			Car c3 = c;
		
		}
		
		
		if(c instanceof Object){
			System.out.println("c는 Object의 인스턴스이다.");
		 Object o3 = c;
		
		}
		
		if(c instanceof FireCar){
			System.out.println("c는 FireCar의 인스턴스이다.");
//			FireCar f1= c; c는 부모타입이고 파이어카보다 높다 
		}
		
		
		
	}
}
