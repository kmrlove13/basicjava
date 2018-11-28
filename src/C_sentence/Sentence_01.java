package C_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
		/*
		 
		  1. 조건문 if, switch
		  	-조건식과 실행될 문자를 포함하는 블럭{}으로 구성되어 있다.
		  	-조건식의 결과에 따라서 프로그램을 실행하는 흐름이 달라짐.
		  	-만족하는 조건식이 나오면 그 밑에 있는 조건식은 무시함
		  	
		  2.if문 (그리고)
		  	-구조
		  	 1)기본
		  	  if(조건식){
		  	  
		  	  
		  	  }
		  	  2)1단변형
		  	  	if(조건식){
		  	  	조건식이 true일때 수행
		  	  	} else{
		  	  	조건식이 false일때 수행
		  	  	
		 	  }
		 	  
		 	  
		 	   3)2단변형
		  	  	if(조건식1){
		  	  	조건식1이 true일때 수행
		  	  	} else if(조건식2){
		  	  	조건식1이 false이고 조건식2가 true일때 수행
		  	  	} else {
		  	  	조건식1이 false이고 조건식2가 false일때 수행
		  	  	
		  	  	}else if는앞에것이 부정당했을때, 무한히 늘릴수도 있지만, 느려짐
		  	  	
		  	  
		  3.switch-case
		  	-조건의 수가 많을때는 if문 보다는 switch문을 많이 사용
		  	-만족하는 값을 찾았어도 계속 비교를 하기때문에 값을 찾으면 멈추라는 뜻의 break가 case문마다 들어가야함
		  	-범위를 정할 수 없음
		  	-구조
		  	 switch(조건식){//조건식이라고 써있지만 연산결과나 값이 들어옴
		  	 	case 값1 :
		  	 		조건식==값1을 수행
		  	 		break;
		  	 	case 값2 :
		  	 		조건식==값2을 수행
		  	 		break;
		  	 	case 값3 :
		  	 		조건식==값3을 수행
					break;
				default :
					조건식과 만족하는 값이 없을때 수행
					맨 마지막 녀석이라 break생략가능
		  	 
		  	  */
		
		int a3=2;
		switch(a3){
		case 1:
			System.out.println("a3는 1이다");
			break;
		case 2:
			System.out.println("a3는 2이다");
			break;
		case 3:
			System.out.println("a3는 3이다");
			break;
		default :
			System.out.println("a3 1,2,3이 아니다");
			}

		//문제1
		//1. 1~5사이의 랜덤한 정수값을 a4변수에 저장해주세요
		int a4 =(int)(Math.random()*5+1);
			System.out.println(a4);
		
		//2. a4의 값이 5이면 "강남에 32평 아파트 당첨"
		switch(a4){
		case 5:
			System.out.println("강남에 32평 아파트 당첨");
			break;
		//	 a4의 값이 4이면 "강남에 24평 아파트 당첨"
		case 4:
			System.out.println("강남에 24평 아파트 당첨");
			break;
		//	 a4의 값이 3이면 "포르쉐 파나메라 당첨(풀옵)"
		case 3:
			System.out.println("포르쉐 파나메라 당첨(풀옵)");
			break;
		//	a4의 값이 2이면 "200만원대 자전거 당첨"
		case 2:
			System.out.println("200만원대 자전거 당첨");
		//	 a4의 값이 1이면 "영민빌딩 내놔"
		case 1:
			System.out.println("영민빌딩 내놔");
			break;
		}
		
		//문제2(힌트 반올림)
		//위의 if문을 switch 바꿔오세요
		//1.변수a22를 선언하고 a2에 0~100사이의 랜덤한점수로 초기화하세요
		int a22=(int)(Math.random()*101+0);
		System.out.println(a22);		
		//2. a22의 값이 90이상이면 "A"를 출력하세요
		switch(a22/10){  //실행되는 값이 같을경우 case 10: case9:   
						 //system.out.println("A")
		case 10 :
			System.out.println("A");
			break;
		case 9 :
			System.out.println("A");
			break;	
		case 8 :
			System.out.println("B");	
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("나가");
			break;
			
		
		
		}
		
		
		//3. a2의 값이 80이상이면 "B"를 출력하세요
		
		//	  	 70이상이면 "C"
		
		//		 60이상이면 "D"
		
		//		 60미만이면 "나가"
		
		
		
		//1. 변수 a1에 정수값을 입력
		int a1 = 2;
		
		//2. 변수 a1의 값이 음수이면 "음수이다" 출력, 양수이면 "양수이다" 출력, 0이면 "0이다"출력
	
		if(a1<0){//음수
			System.out.println("음수이다");
		}else if (a1>0){
			System.out.println("양수이다");
		} else { 
			System.out.println("0이다");
			
		}
	
		//1.변수a2를 선언하고 a2에 0~100사이의 랜덤한점수로 초기화하세요
		
		int a2 = (int)(Math.random()*101+0);
		
		//2. a2의 값이 90이상이면 "A"를 출력하세요 
		
		if (a2>=90){
			System.out.print("A");
			
			if(a2>=95){//A에서 +를 줄지 -를 줄지
				System.out.print("+");//ln은 라인을 바꾸라는 뜻,ln을 안찍으면 줄바꿈없이 해야함
			}else{
				System.out.print("-");
			}
		//3. a2의 값이 80이상이면 "B"를 출력하세요
					
		}else if(a2>=80){// 90미만이란건 이미 담고있어, 80<=a2<90
			System.out.print("B");
			if(a2>=85){
				System.out.print("+");
			}else{
				System.out.print("-");
			}
			
		// 		  	 70이상이면 "C"
		}else if(a2>=70){// 80미만이란건 이미 담고있어, 70<=a2<80(조건식 위에 1,2번 모두 부정)
			System.out.print("C");
			if(a2>=75){
				System.out.print("+");
			}else{
				System.out.print("-");
			}
	
		//			 60이상이면 "D"
		}else if(a2>=60){// 60<=a2<70
			System.out.print("D");
			if(a2>=65){
				System.out.print("+");
			}else{
				System.out.println("-");
			}
			
		//			 60미만이면 "나가"
		}else{// 60>a2
			System.out.println("나가");
			
		}
		
		
		int a =5;
		if(a%2==0){
				//짝수이다
			System.out.println("짝수이다.");
			
		}else{
			System.out.println("홀수이다.");
		}
		
		
		
		}

	}

