package C_sentence;

import java.util.Scanner;

public class Sentence_04_Self {

	public static void main(String[] args) {
		//1.숫자를 입력받는다.
		//2. 사칙연산을 입력받는다.(+ - * /)
		//3. 숫자를 입력받는다.
		//4. 123-> 출력
		//단, 2번째 x를 입력시 종료하세요.
	
	 Scanner sc=new Scanner(System.in);
	
	 
	//초기화 0, 조건식, 증감식
	
	 for(;;){
		 System.out.println("숫자를 입력해주세요.");
		 int num =sc.nextInt(); 
		 System.out.println("문자를 입력해주세요");
		 String str = sc.next();
		 	if(str.equals("x")){
		 			break;
		 			
		 	}
		 System.out.println("숫자를 입력해주세요.");
		 int num2 =sc.nextInt(); 
		 
		 if (str.equals("*")){
			 System.out.println(num*num2);
		 }else if (str.equals("-")){
			 System.out.println(num-num2);
		 }else if(str.equals("/")){
			 System.out.println(num/num2);
		 }else if(str.equals("+")){
			 System.out.println(num+num2);
		 }
	 
		
		 }
//	 Scanner sc2 = new Scanner(System.in);
//	 
//	 System.out.println("숫자를 입력해주세요");
//	 int num =sc.nextInt();
//	 System.out.println("문자를 입력해주세요");
//	 String str = sc.next();
//	 System.out.println("숫자를 입력해주세요");
//	 
			 
	 
	 
	 
	 
	 
	 
	 }
 
}	

