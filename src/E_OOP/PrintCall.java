package E_OOP;

public class PrintCall {

	int a1 =3;
	int b1=5;
	
	long a2=6L;
	long b2=8L;
	
	//메서드명 add
	// 매개변수 int한개
	//매개변수와 a1의 합계를 반환하하는 메서드를 만드세요.
	int add(int a){
		int res = a1+a;
		return res;
	}
	
	//2.메서드명 add
	//매개변수 long 하나
	//매개변수와 a2의 합을 반환하는 메서드
	long add(long a){
		long res = a2+a;
		return res;
	}
	//3.메서드명 add
	//매개변수 int 두개
	//매개변수 두개와 a1,b1의 합을 반환하는 메서드
	int add(int a, int b){
		int res = a+b+a1+b1;
		return res;
	}
	//4.메서드명 add
	//매개변수 int 하나 long 하나
	//매개변수 두개의 합을 반환하는 메서드
	long add(int a, long b){
		long res= a+b;
		return res;
	}
	//5.메서드명 add
	//매개변수 int 두개
	//매개변수 두개와 b2의 합을 반환하는 메서드
//	long add(int a, int b){
//		long res=a+b+b2
//		return res;
//	} 3과 매개변수 타입과 이름도 같기 때문에 만들수 없다. 반환값은 상관없다.
	
	
}
