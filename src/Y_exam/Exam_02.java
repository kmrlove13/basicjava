package Y_exam;

public class Exam_02 {

	public static void main(String[] args){
		
		/*
		 [2-1]
		 		1byte	2byte	4byte	8byte
		 논리형	boolean
		 문자형			char
		 정수형	byte	short	int		long	
		 실수형 					float	double	
		 
		 */
		
		/*
		[2-2]
			주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는
		 	어떤 자료형(data type)을 선택해야 할까? 
		 	주민등록번호는 소수점이 없기에 정수형으로 하고, 13자리의 글자크기라서 범위가 가능한
		 	long의 변수타입으로 선언을 해야한다. 
			
		 	regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.
			 */
	
		long regNo=8907232357700L;
		
		/*[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
			int i = 100;
			long l =100L;
			final float PI = 3.14f;
			- 리터럴 :100, 100L, 3.14f
			- 변수 :i, l
			- 키워드 :final, int, long, float
			- 상수:PI
			*/
		int i =100;
		long l = 100l;
		final float PI = 3.14F;
		
		/*
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
			b번은 대문자로 시작했기에 정답이 아님
		a. int                                
		b. Byte
		c. double
		d. boolean

		[2-5] 다음 문장들의 출력결과를
		
		System.out.println(“1” + “2”) → ("12")string+string 결합이기에 문자열 12가 나옴
		System.out.println(true + “”) → ("true")
			boolean+string 은 boolean이 string보다 작기때문에 ""공백이어도 string타입으로 변경되어 문자열true가 된다 
		*****System.out.println(‘A' + 'B') → (131) 두 변수 모두 char타입이지만 문자를 내부적으로 유니코드(정수)로 저장하기에 정수형처럼 계산이 된다.
		System.out.println('1' + 2) → (51)char+int(숫자의 기본형은 int), char의 값이 큰값인 int로 변환되어서 유니코드값(49)+2로 더해진다 
		System.out.println('1' + '2') → (99)char+char의 결합이지만 결과가 문자가 나오는경우 string타입만이기에 1과 2의 유니코드인 49, 50이 더해져 99가된다
		System.out.println('J' + “ava”) → ("java")char+string은 char이 큰타입인 string으로 변환되어서 문자열과 문자열이된다. 
		System.out.println(true + null) → (오류)null값은 예약어라 수식이 성립되지 않는다.
			null은 모든 참조형의 기본값, 주소가 되기전의 값이기때문에 주소랑 숫자는 더할수 없고, 원래는 기본형과 연산이 가능함. string만 가능함
			boolean은 논리형이기에 연산할수없다. 가능한 경우는 string만 할수있다.
			
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
			키워드(예약어)는 작성할때 자주색으로 색이 변하는데, b랑 d는 첫글자가 대문자, c는 전체가 대문자, System은 대문자와 상관없어 키워드가 아니다.
		a. if
		b. True
		c. NULL
		d. Class
		e. System
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
				a,c,e,g
		a. $ystem - 가능, 특수문자는 $와 _는 가능하다.
		b. channel#5 -불가, #은 사용할수 없는 특수문자이다.
		c. 7eleven -불가, 숫자로 시작되어서는 안된다.
		d. If -가능, if는 예약어지만, 자바는 대소문자를 구별하기에 앞글자가 대문자인 If는 가능하다.
		e. 자바 -가능, 사용은 가능하지만, 개발자간의 암묵적인 약속으로 사용하지 않는 것을 권장한다.
		f. new -불가, 예약어이기에 사용이 불가능하다.
		g. $MAX_NUM -가능, 특수문자$,_가능하고,대문자 변수는 가능하지만 변수가 상수일때 권장한다.
		h. hello@com -불가, 특수문자라서 @ 불가능하다.
	
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)
			참조형변수는 4byte 정수의 주소를 저장한다.
		a. int -가능, 4byte
		b. long -불가, 8byte 
		c. short -불가, 2byte
		d. float -가능, 4byte(실수형이긴 하지만, 조건은 크기이기 때문에)
		e. double -불가, 8byte
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
				b,e
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		a. b = (byte)i; -불가, 변수b의 byte는 1byte고, 값i는 타입이 4byte 
		b. ch = (char)b; -불가능, 변수ch의 타입은 2byte인 char이지만 범위가 음수가 없기에
		,				 값 b의 타입은 1byte이지만 음수가 있기에 변환이 안됨
		c. short s = (short)ch; -불가, short와 char는 같인 2byte이지만 short의 범위가 넓어서 불가.
		d. float f = (float)l; -가능, float f는 4byte, long l은 8byte이지만 범위는 float이 더 크기 때문에 가능 
		e. i = (int)ch; -가능, char ch는 2byte, int i는 8byte
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
			char는 음수가 없어서, 0~2^16-1, 0~65535
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
			a,b,c,d
		a. byte b = 256; 1바이트, 8비트, 2의7승+1 -128~127까지
		b. char c = ''; -문자가 꼭 들어가야함
		c. char answer = 'no'; char의 값은 한글자만 가능.
		d. float f = 3.14 실수형의 기본형식은 double이기에, float형식을 지정해줘야한다.
		e. double d = 1.4e3f; e는 1.4*10^3임
		 	
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
			c,d,e
		a. boolean - false
		b. char - '\u0000'
		c. float - 0.0 - 0.0에 f를 붙여서 0.0f
		d. int - 0
		e. long - 0
		f. String - "" -null이 기본값	
		*/
	
		
//		int channel#5=0;
	    boolean k=true;
		//char kk = 'no';
		byte mm= -1;
		//char kkkk= mm;
		
		double d = 1.4e3d;
		
		
		System.out.println();
		

		/*
		
		1.레벨2 풀이
		2. 3 풀이3
		3. 2 풀이2
		4. 2 풀이2
		5. 2 풀이2
		6. 3 풀이4
		7. 4 풀이
		8. 3
		9. 3
		10. 3
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
