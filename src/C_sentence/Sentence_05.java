package C_sentence;

import java.util.Scanner;

public class Sentence_05 {

	public static void main(String[] args) {
		
		/*
		 1. while문 
		 	-반복횟수를 모를때 사용
		 	-조건식과 수행해야될 블럭{}으로 구성
		 	-for문과 while문 변환 서로 가능
		 	-구조
		 	변수선언(초기화)
		 	while(조건식){ 조건이 만족하는 동안 계속 돌아라
		 		수행할행동 System.out.println(i);
		 		증감식 i++;
		 	}
			 	
		 	
		 	
		
		 */
		
		int sum = 0;
		for(int i =5; i<6; i++){
			sum+=i;
		}
		System.out.println(sum);
		
		//1. 3~33까지의 합계를 구하시오
		
		int sum1 = 0;
		int sum2 = 3;
		while(sum2 < 34){
			sum1+=sum2;
			sum2++;
			
		}
		
		System.out.println(sum1);
		
		//2. 짝수의 합계를 구하시오 3~33
		
		int sum3 = 0;
		int sum4 = 3;
		while(sum4<34){
			if(sum4%2==0){
				sum3+=sum4;
			
			}
			sum4++;
		}
		System.out.println(sum3);
		
		
		//3. for문으로 구구단
		
//		for(int a=2; a<10; a++){
//			for(int b=1; b<10; b++){
//				System.out.println(a + "*" + b + "=" + a*b);
//			}
//		}
		
		//4. while문으로 구구단
//		int a=2;
//		int b=1;
//		while(a<10){
//			while(b<10){
//				System.out.println(a + "*" + b + "=" + a*b);
//				
//				b++;
//		}
//				a++;		
//		}
		
		
//		int a=2;
//		while(a<10){
//			int b = 1;
//			while(b<10){
//				System.out.println(a + "*" + b + "=" + a*b);
//				b++;
//		}
//				a++;
//		}
		
		//5. 짝수단의 홀수곱만 출력하세요
//
//	int a=2;
//	while(a<10){
//		int b=1;
//		while(b<10){
//			if(a%2==0&&b%2==1)
//			System.out.println(a + "*" + b + "=" + a*b);
//		}
//		b++;
//	}
//	a++;				
				//	9404 1845
				
	//3. 1~? 더했을때 100이상이 되는가
	
	int c =0;
	int d =0;
	while(c<100){
		d++;
		c+=d;
		
	}
	
	//종료되는 시점을 모를땐 증감식을 자유자재로 쓸줄 알아야함

	System.out.println(d);	
		
	//4. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요
	
	Scanner sc=new Scanner(System.in);
	System.out.println("시작하는 숫자를 입력하세요");
	int sc1 =sc.nextInt();
	
	System.out.println("끝나는 숫자를 입력하세요");
	int sc2=sc.nextInt();
	
	//5. 시작하는 숫자부터 끝나는 숫자중 5의 배수의 합계를 구하시오
	//	단 while문을 이용하세요.
	
	int sum5 =0;
	while(sc1 < sc2+1){
		if(sc1%5==0){
			sum5+=sc1;
			
			//sc++;
		
		}
		
	}
	 System.out.println(sum5);
	
	
		
	}

}
