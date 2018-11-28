package C_sentence;

import java.util.Scanner;

public class Sentence_06 {

	public static void main(String[] args) {
		/*
		1. do-while
		-while문의 변형으로 기본구조는 while비슷하다.
		-일단 한번 돌려놓고 조건을 물어봄(while은 앞에 조건)
		-무조건 한번이상 실행할때 사용
		-최소 1회는 블럭{}을 수행한다.
		-구조
		do{
		 	실행할 문장;
		 }while(조건식);
		 
		 2. continue
		 -반복문 내에서만 사용
		 -반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.
		 -for문에선 증감식으로
		  바로, while문은 조건식으로 바로
		 -다음조건으로 넘어감 

		 3.break
		
			
			
		 */
		
		//1. 1~?을 더했을때 합계가 100이상이 되는가?
//		int i =1; 
//		int sum=0;
//		do{
//			i++;
//			sum+=i;	
//		}while(sum<100);
//		
		
		//문자를 입력받는다
		//그 문자를 출력한다
		//문자에 "x"를 입력하면 종료한다.
		
		Scanner sc=new Scanner(System.in);
		String str = "";
		do{
			System.out.println("문자를 입력해주세요");
			str = sc.next();
			System.out.println(str);
			
		}while(!str.equals("x"));//x가 아닌경우 계속 해라
		
		//for문과 while문은 null을 넣으면 안돼 값이 들어가야지 실행이 되는거니까
		
		
		for(int i =0; i<11; i++)
			if(i%2==1){
				System.out.println(i);
			}

		for(int i =0; i<11; i++)
			if(i%2==1){
				continue; //밑에는 전현 안함
				
			}
			System.out.println();
		
			int aa=1;
			int sum =0;
			while(true){//모든 조건이 트루라는건 무한히 하라는것
				sum+=aa;
				if(sum>=100){
					break;
				}
				aa++;
			}
			
			
			
	}

}
