package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		
		//throwDice메서드를 호출해라
		
//		DoubleDice d1= new DoubleDice();
//		int d2=d1.throwDice();
//		System.out.println(d2);
		
//		주사위 두개 던져서 합을 구해라
		int sum= 0;
		while(true){
			int dice = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			System.out.println("주사위1 "+dice);
			System.out.println("주사위2 "+dice2);
			
			
			if(dice==dice2){
				sum += dice+dice2;
				continue;
			}
			sum = sum + dice + dice2;
			System.out.println(sum);
			break;
		}
		
		
	}
}



class DoubleDice {
	
	//인스턴스메서드 throwDice, 주사위를 던져서 나온 두개의 값을 합해서 반환 , 재귀호출로 만드세요
	
	//두개의 숫자가 같은 숫자가 나오면 한번더 던질수 있음
	
	//처음 3,3 나왔어 4,4 나오고 2,2 나오고 1,1 나오고 6,6 나오고 1,2 그럼 35개의 합해서 반환
	
	
	
//	
	
	/*int throwDice(){//인자값이 없으므로 매개변수를 넣어줄 필요가 없다.
		
		int dice = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		int sumdice =dice+dice2;
		if(dice==dice2){
			sumdice+=throwDice();
		}
		return sumdice;
	}*/
	
	
	
	
}