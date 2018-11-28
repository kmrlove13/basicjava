package E_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
		
		int result =1;
		for(int i=5;i<5;i-- ){
			result *=i;
		}
		System.out.println(result);
		
		
		long result22 = factorial(8000); //같은클래스명에서 호출된거라 클래스명은 생략가능
		System.out.println(result22);
		
		
		
		
		
		
		
	}
	//재귀호출은 메모리 할당이 큼, 그래서 for문이 효율적
	static long factorial(int num){
		long result =0L;
		if(num==1){
			result =1;
		}else{
			result = num *factorial(num-1); //자기 메소드 안에서 자기 메소드를 다시 호출하는 재귀호출
		}
		return result;
	}
	
	
	
	
	
}
