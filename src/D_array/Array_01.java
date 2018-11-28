package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		/*
		 1.배열(array)이란?
		 -같은 타입의 여러 변수를 하나의 묶음으로 다루는것.
		 ex)5명의 점수
		 	int score1 =100;
		 	int score2 =50;
		 	int score3 =30;
		 	int score4 =70;
		 	int score5 =63;
		 	
		 	라면을 담아갈때의 박스라고 생각하면됨
		 	대신 그 박스에 있는것을 반복문으로 출력
		 	
		 2. 배열의 선언(2가지이지만 쓰는방법은 하나로 통일)
		 	-원하는 타입의 변수를 선언하고 변수 또는 타입의 배열임을 의미하는 []를 붙여준다.
		 	-int score[];, int[] score  int타입을 많이 가지고 있는 배열->int형 배열
		 	-int[] score; 이 방법을 많이 사용
		 
		 3. 배열의 생성( 변수는 값을 넣는것을 초기화라고 하는데 배열은 생성)
		 	-배열을 선언한 다음에는 배열을 생성
		 	-배열 생성을 위해서는 'new'연산자와 함께 배열의 타입과 크기를 지정해 주면된다.
		 	-int[] score =new int[3]; int타입을 3개 넣을 수 있음.
		 	-인덱스 개념이 있어서 0번부터 시작, 각방에 int타입의 기본값이 들어가있음(0)
			-int[] s2 = new int[]{3,4,5}; 원하는 값으로 바로 넣을때
		 
		 */
		
		int[] s1 =new int[3]; //우선은 이걸로 만들어보자
		int[] s2 = new int[]{3,4,5};
// 위 두가지는 선언먼저하고 초기화 할수있지만 밑에 방법은 못함
		
		int[] s3 = {3,4,5};
// 한번에 할때는 new int 생략할 수 잇다.		
		
		
		
		int[] score = new int[4];
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
		
		//반복문으로 바꿔라
		
		for(int i = 0; i<4; i++){
			System.out.println(score[i]);
		}
			
		//1.score의 0번째 방에 10을 저장해주세요
		score[0]=10;
		//2.score의 1번째 방에 20을 저장해주세요
		score[1]=20;
		//3.score의 0번째 방에 30을 저장해주세요
		score[2]=30;
		//4.score의 0번째 방에 40을 저장해주세요
		score[3]=40;
		
		
		//반복문으로 바꿔라
		
		
		for(int i=0; i<4; i++){
			score[i]=(i+1)*10;
		}
				
		for(int i=0; i<score.length; i++){ //배열엔 방이 늘어날수 있기때문에 일일이 고치기 힘드니까, 방개수에 score.length 넣기
			score[i]=(i+1)*10;
		}
	
		
		//1.207호의 자바초급 점수를 저장할 수 있는 변수를 선언 및 생성해주세요(17명)
//		int[] b1= new int[17];
		
		//2.각 사람의 점수를 0~100점 사이의 랜덤한 정수값으로 저장해주세요
//		b1[0] = (int)(Math.random()*101+0);
//		b1[1] = (int)(Math.random()*101+0);
//		b1[2] = (int)(Math.random()*101+0);
//		b1[3] = (int)(Math.random()*101+0);
//		b1[4] = (int)(Math.random()*101+0);
//		b1[5] = (int)(Math.random()*101+0);
//		b1[6] = (int)(Math.random()*101+0);
//		b1[7] = (int)(Math.random()*101+0);
//		b1[8] = (int)(Math.random()*101+0);
//		b1[9] = (int)(Math.random()*101+0);
//		b1[10] = (int)(Math.random()*101+0);
//		b1[11] = (int)(Math.random()*101+0);
//		b1[12] = (int)(Math.random()*101+0);
//		b1[13] = (int)(Math.random()*101+0);
//		b1[14] = (int)(Math.random()*101+0);
//		b1[15] = (int)(Math.random()*101+0);
//		b1[16] = (int)(Math.random()*101+0);
//	
//		for(int i =1; i<b1.length; i++){
//			b1[i]=(int)(Math.random()*101+0);
//			
//			}
//		
			
		
		//2.5 각 사람의 점수를 출력하시오
//		System.out.println(b1[0]);
//		System.out.println(b1[1]);
//		System.out.println(b1[2]);
//		System.out.println(b1[3]);
//		System.out.println(b1[4]);
//		System.out.println(b1[5]);
//		System.out.println(b1[6]);
//		System.out.println(b1[7]);
//		System.out.println(b1[8]);
//		System.out.println(b1[9]);
//		System.out.println(b1[10]);
//		System.out.println(b1[11]);
//		System.out.println(b1[12]);
//		System.out.println(b1[13]);
//		System.out.println(b1[14]);
//		System.out.println(b1[15]);
//		System.out.println(b1[16]);
		
		
		//3.모든 사람의 합계를 구해주세요 합계를 저장할수 있는 변수선언하고 1번방에서 꺼내오고 2번방에서 꺼내오고
//		int sum=0;
//		for(int i=0; i<b1.length; i++){
//			sum+=b1[i];
//		}
//		
//		System.out.println("배열합계는"+sum);
		
		//1. 사용자로부터 7개의 정수를 저장할수 있는 변수 input을 선언 및 생성해주세요.
		int[] input=new int[7];
		
		
		//2. input변수의 각각의 방을 사용자로부터 입력받아 저장해주세요.
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<input.length; i++){
			System.out.println("숫자입력해");
			input[i]=sc.nextInt();
		}
		
		//3.출력해라
		for(int i=0; i<input.length; i++){
			System.out.println(input[i]);
		}
				
		//4. 합계를 구해라
		
		int sum=0;
		for(int i=0; i<input.length; i++){
			sum+=input[i];
		}
		System.out.println(sum);
		
		//5. 평균을 구해라
		
		
		float avg=(int)((float)sum/input.length*100+0.5)/100f;
		
		System.out.println(avg);
		
		//6. 최대값을 구해라
//		
//		int max= input[0];
//			if(max<input[i]){
//				max=input[i]
//			}
//				
		
		int max = input[0];
		for(int i =1; i<input.length; i++){
			if(max < input[i]){
				max=input[i];
			}
		}
		System.out.println(max);
	
		int min = input[0];
		for(int i =1; i<input.length; i++){
			if(min>input[i]){
				min=input[i];
			}
		}
		System.out.println(min);
		
		
	}
}