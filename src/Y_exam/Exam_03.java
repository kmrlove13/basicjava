package Y_exam;

public class Exam_03 {

	public static void main(String[] args) {
		/*
		[3-1] 다음 연산의 결과를 적으시오.
		[연습문제]/ch3/Exercise3_1.java
		class Exercise3_1 {
		public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65                                       
		System.out.println(1 + x << 33); 왼쪽부터 계산, 3<<33기본연산식은 int(32bit),<<2^33,int는 범위가 32까지니까3*2^32*2^1=6
		ex) 14<<67 , 14*2^32*2^32*2^3 = 14*1*1*8 =112
		System.out.println(y >= 5 || x < 0 && x > 2);&&두값 모두true여야 true,(x는 0보다 작고, 2보다크다)2조건 모두 틀림
			|| y는 5보다크거나 작다 true, || 두값중 하나가 true면 true, y의 값이 트루여서 최종결과는 true
		System.out.println(y += 10 - x++);단항먼저계산, y=y+10 - 2(++뒤여서 나중에 대입) y=5+10-2  y=13
		System.out.println(x+=2); x=x+2, 바로전 문제가 2++여서 1증가, x=3+2 x=5
		System.out.println( !('A' <= c && c <='Z') ); 'A'<= c <='Z','A'<='A'<='Z' 두조건모두TRUE, i가 붙어서 논리부정연산 결과 false
		System.out.println('C'-c);이항연산자는 두 피연산자의 타입이 일치되야함'C'의 정수값 67, c변수의 정수값 65, char와 char의 계산은 int로 계산, 결과는 2
		System.out.println('5'-'0');char와 char의 계산은 int로 계산, 5의정수값53, 0의정수값48, 53-48, 결과는 5
		System.out.println(c+1);char와 int(연산식의기본타입), 큰값 int으로 변환, 결과 66
		System.out.println(++c);단항연산자는 산술변환이 되지 않는다. char의 유니코드값이 66으로 증가되어 결과는 B
		System.out.println(c++);증가연산자가 뒤에 붙었기에 결과는 그래도 B
		System.out.println(c);위에변수의 값이 증가되어 C
		}
		}
		 */
		int x = 2;
		int y = 5;
		char c = 'A';
		System.out.println(1 + x << 33); 
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		/*[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
		사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
		가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_2.java
		class Exercise3_2 {
		public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (); // 모든 사과를 담는데 필요한 바구니의 수
		//System.out.println("필요한 바구니의 수 :"+numOfBucket);
		*/
		
		int numOfApples = 149; 
		int sizeOfBucket = 10; 
		int numOfBucket = numOfApples/sizeOfBucket+((numOfApples%sizeOfBucket)== 0? 0 : 1);
		
		// 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		
		/*
		[3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
		자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		[Hint] 삼항 연산자를 두 번 사용하라.
		[연습문제]/ch3/Exercise3_3.java
		class Exercise3_3 {
		public static void main(String[] args) {
		int num = 10;
		System.out.println();
		}
	/}
	 */
		
		int num = 10;
		System.out.println(num==0 ? "0": num<10 ? "음수" : "양수");
		
	
		/*
		[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
		의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
		시오.
		[연습문제]/ch3/Exercise3_4.java
		class Exercise3_4 {
		public static void main(String[] args) {
		int num = 456;
		System.out.println();
		 }
		}
		*/
		
		int num2 = 111;
		System.out.println((int)(num2*0.01)*100);
		int num9 = 456;
		System.out.println((num9/100)*100);
		
		System.out.println(num2*0.01);
		
		/*
		[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
		값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_5.java
		class Exercise3_5 {
		public static void main(String[] args) {
		int num = 333;
		System.out.println(  );
		 }
		}
		[실행결과]
		331
		*/
		int num3 = 777;
		System.out.println((int)(num3*0.1)*10+1);
		System.out.println(num3*0.1);
		
		
		
		/*
		[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
		뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
		다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
		수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
		[Hint] 나머지 연산자를 사용하라.
		[연습문제]/ch3/Exercise3_6.java
		class Exercise3_6 {
		public static void main(String[] args) {
		int num = 24;
		System.out.println();
		 }
		}
		*/
		int num6 = 23;
	//	System.out.println (num6+10-num6%10-num6); 10-num%10 -num6
		
		int num00 = 23;
		System.out.println ((num00+num00/10+num00%10)-num00);
	
		int num5 = 24;
		System.out.println(((num5/10)+1)*10-num5);
		
		
		/*[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
		5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
		셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
		[연습문제]/ch3/Exercise3_7.java
		class Exercise3_7 {
		public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = ();
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		 }
		}연산의 기본타입은 int,
		celcius의 타입은 float, 5/9만 작성하면 연산의기본이 int여서 0만 계산이 됨, 그래서 5/9에 f를 붙여 float의 타입으로 둘다 변환시켜서 계산.
		1.(5/9f*(fahrenheit-32)*100)-37.7778int 계산이 아니라 소수점이 나와야하는 f계산이라, f그대로 유지해서 모든정수들의 타입이 변환되어 계산,
			반올림(0.5)을 하기위해 소수점의 자리를 옮기기위해 100을 곱합
		2.((5/9f*(fahrenheit-32)*100)+0.5)-3777.78 가로안 계산 먼저한 후 0.5를더함 ->3778.28(여전히 int로 값이 바뀌면 안되기에 f를 유지)
		3.(int)((5/9f*(fahrenheit-32)*100)+0.5) 소수점자리 버리기위해 int로 형변환
		4.(float)((int)((5/9f*(fahrenheit-32)*100)+0.5))/100 다시 소수점을 만들기 위해 100을 나눔, 소수점도 나타나게 하기위해
		 (float) 형변환하기.(형변환 안하면 int값으로 들어감, 형변환 먼저하고 /연산함, 소수점을 유지하기 위해 float를 형변환
		 
		
		
		[실행결과]
		6
		[실행결과]
		Fahrenheit:100
		Celcius:37.78
		*/
		int fahrenheit = 100;
		float celcius =(float)((int)((5/9f*(fahrenheit-32)*100)+0.5))/100;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		System.out.println((float)((int)((5/9f*(fahrenheit-32)*100)+0.5)));
		
		/*
		 [3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		[연습문제]/ch3/Exercise3_8.java
		class Exercise3_8 {
		public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = a + b; -> 연산의 기본은 int타입이라, byte를 int로 변경
		char ch = 'A';
		ch = ch + 2; -> char보다 int의값이 더 크기에 int로 변환되어서 계산, c가 결과에 나오기위해선 int로 변환된 값을 char로 형변환
		float f = 3 / 2;-> 연산의 기본인 int로 변경되기에 int보다 큰 값인 float으로 변환되게해서 소숫점자리까지 나오게 해야함
		long l = 3000 * 3000 * 3000; ->연산의 기본타입인 int로 변환, 변환되지않게 한값에 L를 붙여서 L타입으로 변환해서(맨앞에다 붙이기!)앞에서 넘어갈수있어 계산
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2; ->정수형과 달리 실수형은 근사값으로 저장되어서 오차가 발생할 수 있다.(2진수로 변환하는 과정에서 오차 발생),F타입을 더블타입으로 변경해도 0.1그대로.
		 그래서 형변환해야함
			d타입을 f타입으로 형변환한후 비교해야 true 
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		실행결과
				c=30
				ch=C
				f=1.5
				l=27000000000
				result=true
		}
		}
		*/
		
		byte a = 10;
		byte b = 20;
		int c1 = a + b;
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = (float)3 / 2;
		long l = 3000 * 3000 * 3000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d!=f2;
		System.out.println("c="+c1);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		
		
		
		
		/*[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
		의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_9.java
		class Exercise3_9 {
		public static void main(String[] args) {
		char ch = 'z'; -> 숫자형 ''한글자만 가능함 0보다같거나크고 9보다 같거나 작고, 대문자 A보다 같거나 크고, Z보다 같거나 작고, a보다 같거나 크고 z보다 같거나 작고.
		boolean b = ( );
		System.out.println(b);
		}
		}
	
		[실행결과]
		true
		*/
		char ch2 = 'z';
		boolean b2 =('0'<=ch2&&ch2<='9'||'A'<=ch2&&ch2<='Z'||'a'<= ch2&&ch2<='z');
		System.out.println(b2);
		
		
		
		/*
		 [3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
		인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
		들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_10.java
		class Exercise3_10 {
		public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = ( ) ? () : ch; ch3이 a보다크거나 작고, z보다작거나 같으면 대문자+32를 더해 소문자가 아니면 대문자
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		}
		}
		[실행결과]
		ch:A
		ch to lowerCase:a
		
		*/
		char ch3 = 'A';
		char lowerCase = 'A'<=ch3&&ch3<='Z' ? (char)(ch3+32) : ch3;
		System.out.println("ch3:"+ch3);
		System.out.println("ch3 to lowerCase:"+lowerCase);
		 
		System.out.println((char)(ch3+32));
		
				
		


	}

}
