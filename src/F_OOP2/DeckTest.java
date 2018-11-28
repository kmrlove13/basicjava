package F_OOP2;

import java.util.Arrays;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

public class DeckTest {//카드 한벌
	public static void main(String[] args) {
		//Deck객체를 만들어주세요
		Deck d = new Deck();
//		//4,5,6,7번에서 만들어진 메서드를 호출해주세요.
		System.out.println(Arrays.toString(d.c));//카드가 순차적으로 잘 들어갔는지 확인
		//4.입력받은 방번호의 카드를 반환하는 메서드
		Card d1 = d.pick(1);
		System.out.println(d1);
//		//5.랜덤한 방의 카드 한장을 반환하는 메서드
		Card d2 = d.pick();
		System.out.println(d.pick());//랜던메서드가 잘 되었는지 확인
//		//6.카드를 섞기
		d.shuffle();
		System.out.println(d.pick(1));//카드가 잘섞였는지 확인
//		//7. 랜덤 두장으로 카드를 섞기
		d.shuffle(200);
		System.out.println(d.pick(1));//카드가 잘섞였는지 확인
//		//그려
	}
}

class Card{//구구단을 생각해보자 카드 한무늬당 1~13자리
	static final int KIND_MAX = 4;//카드무늬수
	static final int NUM_MAX = 13;//무늬별 카드수 	
	
	static final int SPADE = 1;	
	static final int DIAMOND = 2;	
	static final int HEART =3;	
	static final int CLOVER =4;	

	int kind;
	int number;

	//1. 매개변수가 두개인 생성자를 만들어주세요
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	//2. 기본생성자를 만들어주세요
	//단, 매개변수가 두개인 생성자를 이용하여 1,1로 만들어주세요
	Card(){
		this(2,3); //this(SPADE,1)
	}
	@Override
	public String toString(){
		String kind ="";
		String number ="";
		switch (this.kind) {
		case 1:
			kind="SPADE";
			break;
		case 2:
			kind="DIAMOND";
			break;	
		case 3:
			kind="HEART";
			break;
		case 4:
			kind="CLOVER";
			break;
		default:
			break;
		}
		switch (this.number) {
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default :
			number = ""+this.number;//숫자를 문자열로 하는 방법은 "",
			//number+=this.number;
			break;
		}
		return kind+","+number;
	}
}
class Deck{//1차원 배열
	//1.카드 수량을 저장할수 있는 변수 CARD_NUM선언 및 초기화
	//단, 초기화시 Card클래스의 상수를 이용
	static final int CARD_NUM = Card.NUM_MAX*Card.KIND_MAX;
	//2. 카드 52장을 저장할 수 있는 변수 c를 선언 및 생성
	//단, CARD_NUM을 이용해주세요
	Card[] c = new Card[CARD_NUM];//52개의 값을 가진 카드
	//3.기본생성자를 만들어주세요
	//c의 각방을 카드로 채워주세요
	Deck(){
		int t = 0;
		for(int i=1; i<=Card.KIND_MAX ;i++){
			for(int j=1; j<=Card.NUM_MAX ; j++){
				c[t]=new Card(i,j);//Card(int,int)생성자
				t++;
				
			}
		}
	}
	//4.입력받은 방번호의 카드를 반환하는 메서드를 만드세요 pick
	Card pick(int num){		
		return c[num]; 
	}
	//5.랜덤한 방의 카드 한장을 반환하는 메서드를 만들어주세요 pick
	// 단, 4번에서 만든 pick메서드를 이용하세요
	 Card pick(){
		 return pick((int)(Math.random()*52+1));
	 }
	//6.카드를 섞어주세요 shuffle
	//단, 연습문제 5-5의 형태로 섞어주세요
	void shuffle(){
		 for(int i=0; i<CARD_NUM; i++){
				int j = (int)(Math.random()*CARD_NUM) ;
				Card tmp = c[i];
				c[i]=c[j];
				c[j]=tmp;
	 }
	 }
	
	//7.카드를 섞어주세요 shuffle
	//단, 랜덤한 방 두개를 교환하는 방식으로 사용자로부터 입력받은 수만큼 반복해주세요
	void shuffle(int num){
		for(int i=1; i<=num; i++){//반복하는수
			int j=(int)(Math.random()*CARD_NUM);
			int y=(int)(Math.random()*CARD_NUM);
			Card tmp=c[j];
			c[j]=c[y];
			c[y]=tmp;
			
		}
	}		 	 
}