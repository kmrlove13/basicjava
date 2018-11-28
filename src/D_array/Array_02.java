package D_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {

		/*
		 1. 정렬
		 	-어떤 데이터를 빠르고 쉽게 찾기위해 순서대로 데이터들을 가지런히 나열하는 작업
		 	-버블정렬, 삽입정렬(간단히), 선택정렬
		 	
		 	
		 2. 버블정렬(bubble sort)
		 	-인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
		 	-회전이 진행됨에 따라 가장 큰값이 뒤로 보내진다.
		 	-오름차순 구하기
		 
		 3. 선택정렬(select sort)
		 	-정렬의 대상에서 최솟값을 찾아서 맨앞의 내용과 교체하는 방식이다.
		 	-회전이 진행됨에 따라 가장 작은값이 앞에 확정된다.
		 	
		 	52314
		 	1회전 1번 최솟값이 저장되어 있는 방번호를 찾는다. 3번방
		 */
		
		//1. 5,2,3,1,4 숫자 5개를 저장할 수 있는 변수를 선언 및 생성
//		int[] f={5,2,3,1,4}
//		
//		//2. 1회전 진행하세요.
//		int[] f={5,2,3,1,4};
//		int x=0;
//		if(f[0]>f[1]){
//			x=f[1];
//			f[1]=f[0];
//			f[0]=x;
//		}
//		//3. 2회전
//		if(f[1]>f[2]){
//			x=f[2];
//			f[2]=f[1];
//			f[1]=x;
//		}
//		
//		//3. 3회전
//		if(f[2]>f[3]){
//			x=f[3];
//			f[3]=f[2];
//			f[2]=x;
//		}
//		//4. 4회전
//		if(f[3]>f[4]){
//			x=f[4];
//			f[4]=f[3];
//			f[3]=x;
//		}

		//5. 반복문
		int[] f={5,2,3,1,4};
//		int x =0;
//		for(int i=0, j=1; i<4; i++,j++){
//			if(f[i]>f[j]){
//				x=f[j];
//				f[j]=f[i];
//				f[i]=x;
//			}
//		}
	
		
//	for(int i=0; i<f.length; i++){
//		int x =0;
//		if(f[i]>f[i+1]){
//			x=f[i];
//			f[i]=f[i+1];
//			f[i+1]=x;
//		}
//		for(int j=0; j<f.length;j++){
//			System.out.println(f[j]+"");
//		}
//		System.out.println();
//	}
// 하나씩 줄어들면서, 확장개념	
	for(int k=0; k<f.length-1;k++){//회전
		System.out.println(k+1+"회전");
		for(int i=0;i<f.length-1-k;i++){//변경횟수
			if(f[i]>f[i+1]){
				int x=f[i];
				f[i]=f[i+1];
				f[i+1]=x;
			}
			for(int j=0; j<f.length; j++){
				System.out.print(f[j]+" ");
			}
			System.out.println();
		}
	}
	
		
//	for(int j=1; j<i+1; j++){	
//		System.out.print(f[0]);
//		System.out.print(f[1]);
//		System.out.print(f[2]);
//		System.out.print(f[3]);
//		System.out.print(f[4]);
//		
//	for(int i2=0; i2<f.length; i2++){
//		System.out.print(f[i2]);	
//	}
//	
		
//선택정렬

	//1. 선택정렬 변수 
	int[] sel={5,2,3,1,4};
	//2.1회전진행
//	int min = sel[0];
//	if(min>sel[1]){
//		min=sel[1];
//	}
//	int min =sel[1]
//	if(min>sel[2]){
//		min=sel[2]
//	}
	
//	System.out.println(min);
	//3.1회전진행 반복
	int min = sel[0];
	int minBang=0;
	for(int i=1; i<sel.length; i++){
		if(min>sel[i]){
			min=sel[i];
			minBang = i; //최소값이 들어있는 방
		} 
	}
	int temp = sel[0];
	sel[0]=sel[minBang];
	sel[minBang] = temp;
	System.out.println(Arrays.toString(sel));
	///////////////////////////////////////////
	
//	int min = sel[1];
//	int minBang=1;
//	for(int i =2; i<sel.length-1;i++){
//		if(min>sel[i]){
//			min=sel[i];
//			minBang = i;
//		}	
//	}
//	int temp =sel[1];
//	sel[1]=sel[minBang];
//	sel[minBang]=temp;
	
			
			
			
		
	
	
	}
}
