package D_array;

public class Array_04 {

	public static void main(String[] args) {
		// 1. 6명의 7과목을 저장할 수 있는 변수 score를 선언 및 생성
		String[] name = { "김재은", "김미란", "이진경", "정다혜", "박연욱", "이초연" };// 6명의 이름
																		// 설정
		String[] sub = { "국어", "영어", "수학", "사회", "과학", "오라클", "자바" };
		int[][] score = new int[name.length][sub.length];//6,7

		// 2. score의 각방을 0점에서 100점 사이의 랜덤한 정수값을 저장

		for (int i = 0; i < score.length; i++) {// 6개의 배열
			for (int j = 0; j < score[i].length; j++) {// 7개의 배열, score[i]=sub.length
					//score[i]는 score의 길이는 이름인 6개이고 score안의 i인 0의 배열안에는 sub길이가 있으니까
				score[i][j] = (int) (Math.random() * 101 + 0);// 각 배열의 값 저장
			}
		}
		// 학생들 합계
		int[] ssum = new int[6];// for안의 sum은 값이 지워지기때문에 sum의 값을 넣을 변수를 만들었음
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
				
			}
			ssum[i] = sum;
		}

		// /학생들 평균
		float[] aavg = new float[6];// for안의 avg값은 밖으로 나가면 값이 지워지기때문에 avg값을 넣을
									// 변수를 생성
		for (int i = 0; i < score.length; i++) {
			float avg = (int)((float)ssum[i]/score.length * 100 + 0.5) / 100f;
			aavg[i] = avg;
		}
		//
		// 과목별 합계
		int[] subsum = new int[7];
		for (int i = 0; i < sub.length; i++) {
			int sum = 0;
			for (int j = 0; j < score.length; j++) {
				sum = sum + score[j][i];
			}
			subsum[i]=sum;
		}
		
		//과목별 평균
		float[]subavg = new float[7];
		for(int i = 0; i < sub.length; i++){
			float avg = (int)((float)subsum[i]/sub.length * 100 + 0.5) / 100f;
			subavg[i] = avg;
		}
		
		for (int k = 0; k < sub.length; k++) {// 과목명저장, 반복이다되면 바로 밑의 for문 가능하게
			System.out.print("\t" + sub[k]);
		}
		System.out.print("\t" + "합계" + "\t" + "평균"+"\t"+"석차");

		for(int i = 0; i < score.length; i++) {
			System.out.println();
			System.out.print(name[i] + "\t");
			// 왼쪽에 각 성명,옆으로 써야되서 ln없애고 쓰기
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(ssum[i]);
			System.out.println("\t" + aavg[i]);
			System.out.println();
		}
		System.out.print("과목합계");
		for(int s=0;s<sub.length;s++){
			System.out.print("\t"+subsum[s]);
		}
		System.out.println();
		System.out.println();
		System.out.print("과목평균");
		for(int a=0; a<sub.length;a++){
			System.out.print("\t"+subavg[a]);
		}
		
	
	
	}

}
