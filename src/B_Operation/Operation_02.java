package B_Operation;

public class Operation_02 {
	public static void main(String[] arg){
		/*
		 * 변형이 되는것을 피연산자
		 1. 증감연산자(++,--) 값과 값사의 +,-는 띄어쓰기할것
		  - 증가연산자 (++) : 피연산자의 값을 1 증가시킨다, 
		  ++가 앞에 있으면 적용 먼저하고 계산, ++가 뒤에있으면 계산 후 적용 
		  -	감소연산자 (--) : 피연산자의 값을 1 감소시킨다.
		  --가 앞에 있으면 적용 먼저하고 계산, --가 뒤에있으면 계산 후 적용
		 	 */
		
		//int타입의 변수 i1에 50의 값을 저장해주세요.
		//증가++가 앞이든 뒤이든 상관x
		
		int i1 =50;
		System.out.println(i1);
		i1++;
		System.out.println(i1);
		++i1;
		System.out.println(i1);
	
		int i2 =10;
		int i3 =++i2+5;
		System.out.println(i2+" : "+i3);
		
		int i4=11;
		int i5= 6+i4++;
		System.out.println(i4+" : "+i5);
		
		int i6=20;
		int i7=30;
		int i8= ++i6 + 5 + i7++ + i6++;
		System.out.println(i6+":"+i7+":"+i8);
		
		/*
		 2.비트전환 연산자(~)틸트 기사***
		 	컴터는 음수를 이해하지 못한다.
		 	컴터가 인지하는 -를 계산할때 사용.
		 	정수형과 캐릭터형에만 사용할 수 있다.
		 	실수형식은 방법이 다름, boolean은 논리형이라 사용x
		 	피연산자를 2진수로 표현했을때 0은 1로 1은 0으로 변경해준다.
		 	비트라는 말이 들어가면 무조건! 2진수로
		 	
		  
		 */
		
		byte b1=10;
		int i10= ~b1;
		//byte i10= b1;
		
		// byte i10은 계산이 안됨. 연산은 int로 계산이 되기때문에
		
		/*
		 3.논리부정연산자
		 	-boolean형에만 사용
		 	-true->false, false->true
		 	=!not 여러개붙여도 됨, 그때마다 값이 바뀜
		 	
		*/
		//power변수를 선언하고 true의 값으로 초기화 하세요
		
		boolean power = true;
		power = !power;
		
		System.out.println(power);
		
		/*
		 4. 산술연산자
		 -사칙연산 +, -, *, /
		 -나머지 연산자%, 쉬프트연산자(<<,>>,>>>)옆으로 화면을 옮길때>>>
		 -이항연산자는 피연산자의 크기가 4byte보다 작은 것들의 연산시에는 4byte인 int형으로 변환후에 연산을 수행한다.
		 
		 5. 사칙연산
		 	- +,-,*,/
		 	-int형보다 크기가 작은 자료형은 int형으로 형변환 후에 연산을 진행한다.
		 	byte+byte=> int+int
		 	-두개의 피연산자중 자료형의 표현범위가 큰쪽에 맞춰서 형변환 후에 연산을 진행한다.
		 	byte+long
		 	-정수형 값을 0으로 나누는 것은 금지되어 있다.
		 	
		 */
		
		int a = 5/1;
		System.out.println(a);
		
		//1. byte 타입의 변수에 10의 값으로 초기화해주세요.(aa1)
		byte aa1=10;
		//2. short 타입의 변수 aa2에 250의 값으로 초기화 해주세요
		short aa2=250;
		//3. aa1과  aa2의 합을 저장할수 있는 result변수를 선언해주세요.
		int result=aa1+aa2;
		System.out.println(result);
		//왼쪽타입은 오른쪽값이 저장할수 있는 타입으로 꼭 해주기!
		
		
		//4. 3.141592를 저장할 수 있는 변수를 선언 및 초기화해주세요 aa3
		float aa3=3.141592f;
		//5. aa3와 aa1의 합을 저장할 수 있는 result2변수를 선언 및 초기화해주세요.
		//변수에는 f 붙이면 안됨, 값에 이미 f가 있음.
		float result2 = aa3+aa1;
		System.out.println(result2);
		//6. '초' 글자와 '연'글자의 합계를 구해주세요 result3
		//한번만 쓸거면 변수선언 안해도됨,직접적으로 계산함
		int result3 ='초'+'연';
		System.out.println(result3);
		//7
		int aaa=10;
		int bbb=20;
		float result4 = (float)aaa / bbb;
		System.out.println(result4);
		
		/*
		6. 나머지 연산자(%)
		- 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려준다.
		- bloolean형을 제외한 모든 기본형 변수에 사용가능
		- 홀짝구분할때 많이 씀 
		
	 	7.쉬프트연산자(<<,>>,>>>) 기사**
		 -정수형에만 가능
		 -피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동
		 -매우매우 계산이 빠르다, 2^을 나누고 곱할때 활용
		 -10<<2 = 10*2^2, 왼쪽으로 2칸,  
		 -10>>2 = 10/2^2  오른쪽으로 2칸 
		 -<< : x << n은 * 2^n의 결과와 같다.(overflow주의)
		 ->> : x >> n은 / 2^n의 결과와 같다.
		 
		8. 비교연산자
		-두개의 변수 또는 리터럴을 비교하는데 사용되는 연산자
		-주로 조건문과 반복문의 조건식에 사용 true와 false의 결과를 얻는다.
		-이항연산자
		
		9.대소비교연산자(<,>,<=,>=)
		-기본형중 boolean을 제외한 나머지 자료형에 사용가능하다.
		-참조형은 사용할 수 없다.
		
		10.등가비교연산자 (==,!=)
		-모든(기본,참조)자료형에 사용가능
			수식		|	연산결과
			x > y		x가 y보다 클때만 true 그 외에는 false	
			x < y       x가 y보다 작을때만 true
			x >= y      x가 y보다 크거나 작을때 true
			x <= y		x가 y보다 작거나 같을때 	true
			x == y		x는 y가 같을때 true
			x != y		x는 y가 같지않을때 true
	
		11. 비트연산자(논리회로에 많이 쓰임,&,|,^)
		-이진비트 연산 수행
		-실수형 제외한 모든 기본형에 사용가능
		
		&(AND연산) : 피연산자중 양쪽의 값이 1이면 1의 결과를 얻는다.
		|(OR연산) : 피연산자중 한쪽의 값이 1이면 1의 결과를 얻는다.
		^(XOR연산) : 피연사자의 값이 서로 다를때만 1의 결과를 얻는다
		
		3 ->00000011 
		5  ->00000101
		
		12. 논리연산자(&&,||)
		-피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만을 허용
		-범위에 있는 것들을 처리할때 0<=x && X<=15 
		-둘다 false일때는 false
		-'&&'연산이 '||'보다 우선순위가 높음
		||(OR결합) : 피연산자 어느 한쪽만 true이면 true의 결과를 얻음
		&&(AND결합): 피연산자 양쪽 모두 true일때만 true이다.
		
		13. 삼항연산자
		-세 개의 피연산자를 필요로 하기 때문에 삼항연산자
		-조건식이 필요함 조건식 ? true실행 : false실행
		-기본구조
			(조건식) ? 식1 : 식2
			
		14. 반올림
		-자릿수에 상관없이 5>= 면 올림	
		
		15.random
		자바에서 지원하는 메쏘드 Math.random() .의 표현은 메쏘드안에 클래스인 random 들어가있다.
			0<= math.random()<1
			0<= m*6+1<7
			
		16. = ,op=
		int aa6 =10
		aa6=aa6+5 -> aa6=aa6+=5;  내자신에 값을 더한것을 내자신에 넣어준다.	
			
		*/
		
		//주사위 
		//1~6
		//포함 -미포함 1~7
		///뒤-앞 개수 :6
		//시작 :1
		
	int result7= (int)(Math.random()*6+1);
	
		System.out.println("정답은"+result7);
		
		
		//소수점 4째자리에서 반올림하여 셋째자리까지 표현 
		float x6 =37.1547f;
		float x5 =x6*1000;
		int x4 =(int)(x5+0.5);
		float x7 = x4/1000f;
		System.out.println("정답은 " + x4);
		
		float x2 = 37.65f;
		int result5 =(int)(x2+0.5);
		System.out.println(result5);
		
		
		int x =10;
		int absx = x>0 ? x : -x;
		System.out.println(absx);
		
		System.out.println("x>0 ? x : -x= " + (absx));
		
		
		//1. 변수 ab1에 10의 값을 저장해주세요
		int ab1=10;
		//2. 변수 ab2에 8의 값을 저장해주세요.
		int ab2=8;
		//3. 변수 share에 ab1을 ab2로 나눈 결과를 저장해주세요
		int share = ab1/ab2;
		//4, 변수 remain에 ab1을 ab2로 나누고 난 나머지 값을 저장해주세요
		int remain= ab1%ab2;
		
		float dd= (float)ab1/ab2;
		
		//5. 위의 변수 4개를 전부 활용하세요
		// 10을 8로 나눈 몫은 1이고 나머지는 2이다.
		System.out.println(dd);
		
		 System.out.println(ab1+"을 "+ab2+"로 나눈 몫은 "+share+"이고 나머지는 "+remain+"이다");
		 
		 
		//1. 'J'를 저장할수 있는 변수 ab4를 선언 및 초기화 해주세요.
		char ab4='J';
		//2.ab4의 값이 대문자일때 true의 결과를 얻는 조건식을 만드세요.
		System.out.print('A'<=ab4&&ab4<='Z');
		//3.ab4의 값이 소문자인지 판단
		System.out.println('a'<=ab4&&ab4<='z');
		//4.ab4가 영문자인지 아닌지 판단
		System.out.println('A'>=ab4&&ab4<='Z'||'a'>=ab4&&ab4<='z');
		//5.ab4가 숫자형인지 아닌지 판단
		System.out.println('0'>=ab4&&ab4<='9');
		//6.
		char ab44='a';
		int a3333=ab44;
		
		System.out.println(a3333);
		
		
	/*1 레벨1
		2,3, 3,2,2,1,2,4,4,4,5,5,5,
		우선 레벨4까지는 풀어오고 수요일까지 5레벨은 금요일까지
		*/
		
	}
}
