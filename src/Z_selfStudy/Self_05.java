package Z_selfStudy;

public class Self_05 {
	public static void main(String[] args) {
		
//		int sum=0;
//		sum=sum+score[0][0]
//		sum=sum+score[1][0]
//		sum=sum+score[2][0]
//		sum=sum+score[3][0]
//		sum=sum+score[4][0]
//		sum=sum+score[5][0]
//		sum=sum+score[6][0]
//		for(int j=0; j<score.length; j++){
//			sum=sum+score[j][0]		
//		}
//		System.out.print(sum)	
//		score[1][0]=sum
//		score[1][1]=(int)(Math.random()*101+0);
//		score[1][2]=(int)(Math.random()*101+0);
//		score[1][3]=(int)(Math.random()*101+0);
//		score[1][4]=(int)(Math.random()*101+0);
//		score[1][5]=(int)(Math.random()*101+0);
//		score[1][6]=(int)(Math.random()*101+0);
		
//		for(int j=0; j<score.length; j++){
//			score[1][j]=(int)(Math.random()*101+0);
//		}
//		score[2][0]=(int)(Math.random()*101+0);
//		score[2][1]=(int)(Math.random()*101+0);
//		score[2][2]=(int)(Math.random()*101+0);
//		score[2][3]=(int)(Math.random()*101+0);
//		score[2][4]=(int)(Math.random()*101+0);
//		score[2][5]=(int)(Math.random()*101+0);
//		score[2][6]=(int)(Math.random()*101+0);
		
//		for(int j=0; j<score.length; j++){
//			score[2][j]=(int)(Math.random()*101+0);
//		}
		
//		score[3][0]=(int)(Math.random()*101+0);
//		score[3][1]=(int)(Math.random()*101+0);
//		score[3][2]=(int)(Math.random()*101+0);
//		score[3][3]=(int)(Math.random()*101+0);
//		score[3][4]=(int)(Math.random()*101+0);
//		score[3][5]=(int)(Math.random()*101+0);
//		score[3][6]=(int)(Math.random()*101+0);

//		for(int j=0; j<score.length; j++){
//			score[3][j]=(int)(Math.random()*101+0);
//		}
		
//		score[4][0]=(int)(Math.random()*101+0);
//		score[4][1]=(int)(Math.random()*101+0);
//		score[4][2]=(int)(Math.random()*101+0);
//		score[4][3]=(int)(Math.random()*101+0);
//		score[4][4]=(int)(Math.random()*101+0);
//		score[4][5]=(int)(Math.random()*101+0);
//		score[4][6]=(int)(Math.random()*101+0);
////		
//		for(int j=0; j<score.length; j++){
//			score[4][j]=(int)(Math.random()*101+0);
//		}
		
		
//		score[5][0]=(int)(Math.random()*101+0);
//		score[5][1]=(int)(Math.random()*101+0);
//		score[5][2]=(int)(Math.random()*101+0);
//		score[5][3]=(int)(Math.random()*101+0);
//		score[5][4]=(int)(Math.random()*101+0);
//		score[5][5]=(int)(Math.random()*101+0);
//		score[5][6]=(int)(Math.random()*101+0);
		
//		
		
	int[] arr = new int[100];
	arr[0]=1;
	arr[1]=2;
	
	int sum=0;
	for(int i=0; i<arr.length; i++){
		sum=arr[i];
	}
	System.out.println(sum);
		
	
	//총합과 평균
	int sum1=0; // 총점을 저장하기 위한 변수
	float average = 0f;//평균을 저장하기 위한 변수
	
	int[] score ={100,88,100,100,90};
	
	for(int i=0; i<score.length; i++){
		sum+=score[i];
	}
	average = sum/(float)score.length ;//계산결과를 float으로 얻기 위한 형변환
	
	System.out.println(sum);
	System.out.println(average);
	
	//최대값과 최소값
	int[] score1 ={79,88,91,33,100,55,95};
	
	int max = score1[0]; //배열의 첫번째 값으로 최대값을 초기화
	int min = score1[0];// 배열의 첫번째 값으로 최소값을 초기화
	
	for(int i=1; i<score1.length; i++){//1번인덱스부터 0번인덱스랑 비교를 함 그래서 초기화1
		if(score1[i]>max){//i번배열방의 값이 max값보다 크다면, max에 i번 값을 넣어라
			max=score1[i];
		}else if(score1[i]<min){//i번 배열방이 min보다 작다면, 배열방에 i번 배열방값을 넣어라
			min=score1[i];
		}
	}//end of for
	System.out.println(max);
	System.out.println(min);
	
	
	//섞기
	int[] numArr=new int[10];
	
	for(int i =0; i<numArr.length; i++){
		numArr[i] =i;//배열을 0~9의 숫자로 초기화
		System.out.print(numArr[i]);
	}
	System.out.println();
	
	for(int i=0; i<100; i++){
		int n =(int)(Math.random()*10);//0~9중의 한 값을 임의로 얻는다.
		int tmp = numArr[0];
		numArr[0]=numArr[n];
		numArr[n]=tmp; //빈 tmp에 0번값을 저장하고 빈 0번방에 n번방을 저장하고, 빈n번방에 tmp를 저장, 결국 서로 바꿈
	}
	for(int i=0; i<numArr.length; i++){
		System.out.print(numArr[i]);
	}
	
	
	
	
	
	}
}
