package C_sentence;

public class Sentence_03 {

	public static void main(String[] args) {
		
		//초기화 5, 조건식 i<10, 증감식 i*=5
	
//		System.out.println(2+"*"+1+"="+2*1);
//		System.out.println(2+"*"+5+"="+2*5);
//		System.out.println(2+"*"+3+"="+2*3);
//		System.out.println(2+"*"+4+"="+2*4);
//		System.out.println(2+"*"+5+"="+2*5);
//		System.out.println(2+"*"+6+"="+2*6);		
//		System.out.println(2+"*"+7+"="+2*7);
//		System.out.println(2+"*"+8+"="+2*8);
//		System.out.println(2+"*"+9+"="+2*9);
//		

//		for(int a3=1; a3<10; a3++){
//			System.out.println(3+"*"+a3+"="+3*a3);
//			
//		}
//		for(int a4=1; a4<10; a4++){
//			System.out.println(4+"*"+a4+"="+4*a4);	
//		}
//		for(int a5=1; a5<10; a5++){
//			System.out.println(3+"*"+a5+"="+3*a5);
//			
//		}
//		for(int a6=1; a6<10; a6++){
//			System.out.println(6+"*"+a6+"="+6*a6);
//			
//		}
//		
//		for(int a7 =1; a7<10; a7++){
//			System.out.println(7+"*"+a7+"="+7*a7);
//		}
//		for(int a8 =1; a8<10; a8++){
//			System.out.println(8+"*"+a8+"="+8*a8);
//			
//		}
		for(int j =2; j<10; j++){//if(j%2==0) 여기다가 넣어도됨, 증감식은 잘 안건들임
			for(int i =1; i<10; i++){
				if(j%2==0){// if(j%2==0 && i%2==1)
					if(i%2==1){
						System.out.println(j+"*"+i+"="+j*i);
					}
					
				}
			}	
		}
			
		
		
		
//		
//		for(int i = 1; i<10; i++){
//			System.out.println(5+"*"+i+"="+5*i);
//		}	
//		for(int i=5; i<10; i++){
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		for(int i=5; i<10; i++){
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		for(int i=5; i<10; i++){
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		for(int i=5; i<10; i++){
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		for(int i=5; i<10; i++){
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		for(int i=5; i<10; i++){
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//		
			
		
//1. 숫자를 입력받는다
//2. 사칙연산을 입력받는다(*/+-)
//3. 숫자를 입력받는다
//4. 1 2 3 = 출력
//5. 단 2번에서 x를 입력시 종료한다.
		
//문자열을 비교할때 if(abc.equals("*"))
		
//String str ="12345"
		//str.charAt(0);
		//str.lenght().5	
		
		
	
		double avg1=15.21123;
		System.out.println((int)(avg1*100));
	}

}
