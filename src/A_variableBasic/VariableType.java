package A_variableBasic;

/**
 * @author PC07
 *
 */
public class VariableType {

	public static void main(String[] args) {
		/*
		  메모
		 */
		
		boolean power=true;
	
		boolean power2=false;
		
//		code라는 변수에 'A'를 저장하시오, 무조건 한글자만
		
		char code='A';
		char code2='\u0041';
		char code3=65;
		int code4= code;
		
				
				
		System.out.println(code2);
		System.out.println(code);
		System.out.println(code3);
		System.out.println(code4);
		
//		byte타입의 변수 b1에 150의 값을 저장해주세요
//		=false
		
		byte b1 = 100;
		
		long b2 = 950831211111L;
		
		double b3 =3.14159254863;
		float b4=31.4159254863f;
		
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		double d2 = 0.1;
		float f2=0.1f;
		
		System.out.println(d2==f2);
		System.out.println(f2);
	
//		문자열 String
		
//		String str="문자열";
		
		String str="=======\\n-----";
		System.out.println(str);
		
//		오버플로우는 자신이 표현할 수 있는 값을 넘었을때 최소값으로 
//		돌아가는 현상
		
		byte b21 = 126;
		System.out.println(b21); // 126
		
		b21++;
		System.out.println(b21); //127
		
		b21++;
		System.out.println(b21); //-128
		
		b21++;
		System.out.println(b21); //-127
		
		
		int a2 = 40000;
		byte b24 = (byte) a2;
		System.out.println(b24);
		
		int a3=65;
		char c3=(char) a3;
		System.out.println(c3);
		
		long aa =180;
		float ff = aa;
		System.out.println(ff);

		
		System.out.println(55+10);
		System.out.println("하이"+55);
		System.out.println("45"+20);
		System.out.println(""+45);
		System.out.println(true+"34");
		System.out.println('T'+"G"+45);
		System.out.println('A'+4+"44");
	}
}

