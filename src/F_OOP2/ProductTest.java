package F_OOP2;

import java.util.Vector;



public class ProductTest {
	public static void main(String[] args) {
//		System.out.println(t2);//객체 뒤에는 toString이 생략되어있음,출력할때만!
		Tv2 t2 = new Tv2("LGTV", 700);
		NoteBook nb = new NoteBook("Mac", 400);
		MicroWave mw = new MicroWave("LG전자렌지", 200);

		Buyer b = new Buyer("미란",10000); 
		
		b.buy(t2);
		b.buy(nb);
		b.buy(mw);
		
//		//호갱님의 잔여금은 얼마이고 보너스포인트는 얼마입니다.
//		System.out.println("호갱님의 남은돈 : "+b.money);
//		System.out.println("호갱님의 포인트 : "+b.bonusPoint);
//		
//		//호갱님이 구입한 물품 내역
		System.out.println("처음산 물품 : "+b.item.get(0));
		
		//반품
//		b.refund(nb);
		b.summary();
		
	}

	
	
}

class Product{
	String name;//제품 이름
	int price;//제품 금액
	int bonusPoint;//제품 포인트적립
	
	Product(String name, int price){//초기화블럭
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
	}

	@Override
	public String toString() {//alt+shift+s, s, enter 오버라이드
		return name;
	}
	

}
	

class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
	}
		
	@Override
	public String toString() {//alt+shift+s, s, enter 오버라이드
		return name;
		
	}
}	



class MicroWave extends Product{
	MicroWave(String name, int price){
		super(name, price);
	}
		
	@Override
	public String toString() {//alt+shift+s, s, enter 오버라이드
		return name;
	}
}

class Buyer{
	String name;//제품이름
	int money; //가지고온돈
	int bonusPoint;//적립금
//	Vector item = new Vector();//구입한 물건을 저장,오브젝트
	//Vertor<Product> item = new Vector<Product>
	Vector item = new Vector();
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}

	void buy(Product p){//제품들의 여러 메서드를 프로덕트로 통일
		if(money <p.price){
			System.out.println("꺼쪄");
			return;
		}
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		System.out.println(p+"를 구매하셨습니다.");
		item.add(p);//배열의 값을 추가하는건 add
		System.out.println("호갱님의 남은돈: "+money);
		System.out.println("호갱님의 포인트 : " + bonusPoint);
		
	}
	
	//1. 반품 refund 메서드
	//구매물품이 없으면 "구매하신 물품이 없습니다"
	//구매물품은 있으나 우리 매장에서 산게 아니다
	//반품되었습니다.
	//contains를 첫번째 조건, isEmpty를 두번째 조건, 반품이 세번째조건
	void refund(Product p){//순서에 관해서 물어보기!!!!!!!!!!!!!!!********
		if(item.isEmpty()){
			System.out.println("구매하신 물품이 없습니다.");
			 return ; //아무것도 반환하지 말고 조건문을 나가라.
		}else if(item.contains(p)==false){//반품할려고 하는 객체를 포함하고 있으면 true
			System.out.println("우리 매장에서 산게 아닙니다.");

			
//			for(int i =0; i<item.size(); i++){
//				if(item.get(i) ==p){
//					item.remove(i);//item.remove(p)로 하려면 제품이름이 중복일떼 전체가 삭제될수 있음
//					Product p2 = (Product)item.remove(i);
//					return;//반품후 리턴,리턴 안써주면 같은 제품을 몇개 사든 전부 지워짐
//				}
//			}
//		if(item.remove(p)){//아이템이 지워지면 실행
//			money += p.price;
//			bonusPoint -=p.bonusPoint;
//			System.out.println(p+"를 반품하셨습니다.");
			
//		}else{//아이템이 지워지지 않으면 실행
//			System.out.println("우리매장에서 산게 아닙니다.");
//			
//			
//		}
			
			
		}else{
			item.remove(p);
			money += p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
			System.out.println("호갱님의 남은돈: "+money);
			System.out.println("호갱님의 포인트 : " + bonusPoint);
		}
	}
	
	//2.summary 영수증 메서드
	/* 
	 		영 	수	 증
	 	구매물품 LGTV 		700만원
	 			Mac 		400만원
	 			LG전자렌지 	200만원
	 			
	 	총 구매금액 			1300만원
	 	고객님의 남은돈 		8700만원
	 		포인트			130만점
	 	또 오십시오 호갱님~
	 */
	
	
	void summary(){
		System.out.println("\t영\t수\t증");
		System.out.print("구매물품");
		for(int i=0;i<item.size();i++){
			System.out.println("\t "+((Product)item.get(i)).name+"\t"+((Product)item.get(i)).price+"만원");
		}
		System.out.println();
		int sum=0;
		for(int i=0; i<item.size();i++){
			Product cc = (Product)(item.get(i));
			sum += cc.price;
			//sum+=((Product)item.get(i)).Price;
		}
		System.out.println("총 구매금액"+"\t"+sum+"만원");
		System.out.println();
		System.out.println("고객님의 남은돈"+"\t"+money+"만원");
		System.out.println("고객님의 포인트"+"\t"+bonusPoint+"만점");
		System.out.println("또 오십시오!");
		
	}
	
	//3.사람 여러명을 관리할 수 있는 클래스를 작성해주세요- 호출하는부분이 변경이됨
	//사람은 이름으로 구분

	
	
	
	//4.물품을 관리할 수 있는 클래스를 만드세요
	//프로덕트형으로 만들어서 재고관리, 삭제, 유지, 입고
	
	//5.
	
}
	
	
	
