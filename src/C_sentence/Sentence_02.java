package C_sentence;

import java.util.Scanner;

import com.sun.xml.internal.stream.Entity.ScannedEntity;

public class Sentence_02 {

	public static void main(String[] args) {
		/*
		 1.반복문(for, while, do-while)
		 -어떤 작업이 반복적으로 수행도되록 할때 사용
		 -주어진 조건이 만족되는 동안 수행함으로 조건식을 포함
		 -for문은 주로 반복횟수를 알고 있을때 while문은 반복횟수를 모를때 사용
		 -비슷한문장을 반복할때 사용
		 
		 2.for문
		 -기본구조
		 for(초기화;조건식;증감식){
		 	수행될문장
		 }
		 초기->조건식->수행->증감식->조건식->수행->증감문..false가 나오면 종료
		 
		  */
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		//초기화:int i = 0;
		//조건식:i<11  11보다 작을때까지 실행
		//수행될문장: system.out.println(i)
		//증감식:i++
		
		for(int i=0; i<11; i++){ //++이 앞에 붙어도 되고 뒤에 붙어도됨, 혼자서 값이 변하기 때문에
			System.out.println();
		}
		//초기화:int i2 =0;
		//조건식:i2<11
		//수행될문장:system.out.println(i2%2==1)
		//증감식:++i
		
		for(int i2 =0; i2<11; i2++){
			System.out.println(i2%2==1 ? i2++:"");
		}

		for(int i3 =0; i3<11; i3++){
			if(i3%2==1){
				System.out.println(i3);
			}
				
		}
		
		/*
		 
		 import scanner
		 다른곳에 있는 값을 가져와서 사용할때
		 
		 
		 */
//	Scanner sc=new Scanner(System.in);// 주소를 받아올준비
//	System.out.println("문자를 입력해주세요");
//	//String str =sc.next();주소를 받아오면 적어놓을 준비, 콘솔에 작성하면 str에 저장이 되고 str이 출력
//	//System.out.println(str);
//	
//	int result = sc.nextInt();//숫자만 적용 
//	System.out.println(result);
//	
//	
//	//1.사용자로부터 숫자를 입력받아서 0~입력받은수까지 출력해주세요.
//	for(int sc2=0; sc2 <result+1; sc2++){
//		System.out.println(sc2);
//	}
		
	
	//초기화, 조건식, 증감식
	
	//2. 5~15까지의 합계를 구하시오
	//int sum = 0;
//	sum += 5;
//	sum += 6;
//	sum += 7;
//	sum += 8;
//	sum += 9;
//	sum +=10;
//	sum +=11;
//	sum +=12;
//	sum +=13;
//	sum +=14;
//	sum +=15;
	int sum = 0;
	for(int sum1 =5; sum1<16; sum1++){
		sum+=sum1;
		System.out.println(sum);
	}
	//초기화 5, 조건식16, 증감식1
	
	
	//2.6~사용자가 입력한 수까지의 홀수의 합을 구하시오
	Scanner sc = new Scanner(System.in);
	
	System.out.println("문자를 입력해주세요");
	int result = sc.nextInt();
	int sum1 =0;
	for(int sum2=6; sum2<result+1; sum2++){
		if(sum2%2==1){
			System.out.println(sum1+=sum2);
		}
		
		
	}

	
	//초기화 1, 
	
			
	}

}
