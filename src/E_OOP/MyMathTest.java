package E_OOP;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		
//		MyMath.add();
//		
//		MyMath mm =new MyMath();//인스턴스 메쏘드를 출력하기 위해선 인스턴스화 해서 인스턴스를 만들어야함
//		mm.add2(10);//10을 인자값
//		MyMath.add3(1, 1.3f);
//		 mm.add4(1, 1, 'A');
//		int mmm = MyMath.add5(7);//반환받을값이 int이기 때문에 int타입으로.전환값이 있는 변수는 따로 변수에 저장해야함
//		System.out.println(mmm);
//	
//		int m1 =mm.add6(5,6);//반환받을 값이 int이기 때문에 int타입으로 저장. 전환값이 있는 변수는 따로 변수에 저장해야함
//		long mmmm =mm.multiply(300000000, 3000);
//		System.out.println(mmmm);
//		
//		float m2 =mm.divide(10,4);//반환받을 값이 float이기 때문에 float타입으로 저장.
		
		
		
		
		//계산기
		
		
		MyMath cal = new MyMath();
//		cal.calcu();
		
		boolean i = true;
		while(i){
			int num1 = cal.num();
			String str2 = cal.stri();
			int num2 = cal.num();
			
			if(str2.equals("-")){
				System.out.println(cal.add6(num1,num2));
			}else if(str2.equals("*")){
				System.out.println(cal.multiply(num1,num2));
			}else if(str2.equals("/")){
				System.out.println(cal.divide(num1,num2));
			}else if(str2.equals("+")){
				System.out.println(cal.add7(num1,num2));
		
			}else if(str2.equals("x")){
				break;
			}else{
				System.out.println("문자를 잘못입력하셨습니다.");
			}

		
		}

	}
}

class MyMath{

	
	static int number = 50;
	static void add(){
		System.out.println(number*2);
	}
	void add2(int a){//매개변수 int a, a라는 값을 받아서 10과 매핑해준다
		System.out.println(number*a);
	}
	static void add3(int a, float c){//클래스 메서드
		System.out.println(a*c); 
	}
	void add4(int c, int d, char e){
		System.out.println(c+d+e);//char가 int보다 작기때문에 char의 유니코드값이 계산됨
	}
	
	//클래스 메서드명은 add5, 매개변수는 int 하나, 수행내용은 매개변수와 전역변수 number의 합을 반환
	static int add5(int b){
		int result=b+number;
		return result;
	}
	
	// 메서드명 add6
	// 매개변수 int두개
	// 앞에 받은 값에서 뒤에 받을 값을 뺀 결과를 반환하는 메서드를 만드세요
	
	int add6(int a, int b){
		int re = a-b;
		return re;
	}
	
	//인스턴스메서드 multiply
	//int 두개
	//두개의 수를 곱해서 반환해주세요
	//단, overflow를 고려해주세요
	
	long multiply(int a, int b){//overflow 예방하기 위해선 타입을 크게
		long ree =(long)a*b; //기본값이 int이기 때문에 long을 꼭 붙이기!
		return ree;
	}
	
	//인스턴스 메서드 divide
	//int값 두개
	//앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	//단, 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
	

	float divide(int a, int b){
		float reee = (int)((float)a/b*100+0.5)/100f;
		return reee;
	}
	
	int add7(int a, int b){
		int result = a+b;
		return result;
	}
	
	
	static Scanner sc=new Scanner(System.in); 
	
	String stri(){
		System.out.println("문자를 입력해주세요");
		String res = sc.next();
		return res;
	}
	int num(){
		System.out.println("숫자를 입력해주세요");
		int num=sc.nextInt();
		return num;
	}
	


}
	
//	
//	void calcu(){
//		for(;;){
//		System.out.println("숫자를 입력해주세요");
//		int a=sc.nextInt();
//		System.out.println("문자를 입력해주세요");
//		String str=sc.next();
//			if(str.equals("x")){
//				break;
//			}
//		System.out.println("숫자를 입력해주세요");
//		int b=sc.nextInt();
	
	
//		
//		if(str.equals("-")){
//			System.out.println(add6(a,b));
//		}else if(str.equals("*")){
//			System.out.println(multiply(a,b));
//		}else if(str.equals("/")){
//			System.out.println(divide(a,b));
//		}else if(str.equals("+")){
//			System.out.println(add7(a,b));
//			
	

	
		
	

	
	
	

	
	
	
	//숙제. jvm을 그리기 위에값을  인자값, 매개변수=지역변수 
	//MyMathTest 부분에 
	//사용되야할 메쏘드는 +,-,/,*
	//무한계산기만들기 메쏘드를 호출하는 형태로 
	//x를 누르면 멈춰지게
	//처음에 숫자를 입력받고 누적계산기 계속 콘솔창에 입력창에, 실제 계산기처럼
	
	

	

