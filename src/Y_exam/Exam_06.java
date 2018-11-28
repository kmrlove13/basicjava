package Y_exam;

public class Exam_06 {
	public static void main(String[] args) {
	
		SutdaCard card1 =new SutdaCard(3,false);
		SutdaCard card2 =new SutdaCard();
		 
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		Student s = new Student("홍길동",1,1,100,60,76);
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		System.out.println(s.info());
		
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2,2));

/*
 6-8 클래스변수(static 변수): width, height
 	인스턴스변수: kind, num
 	지역변수:k, n, card
  
 */

/*
6-9

static을 붙인다는것은 클래스타입인거고,
모든 인스턴스들이 공통적인 값을 가져야 한다는 뜻
그러므로 모든 병사의 공격력과 방어력이 같다는건 공통적인 값을 가져야 하는거니까

weapon변수와, armor변수,메서들도
  
		  
		  
*/
	}
}


//6-1,6-2
class SutdaCard{
	int num;
	boolean isKwang ;
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int a, boolean b){
		num = a;
		isKwang = b;
	}
	String info(){
		return isKwang==true? num+"k":num+"";//리턴값은 수식도 리턴이 된다.
 
	}
}

//6-3,4,5

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal(){
		
		int sum = kor+eng+math;
		return sum;
		
	}

	float getAverage(){
		int sum = kor+eng+math;
		float avg =(int)((float)sum/3*10+0.5)/10f;
		return avg;
	}

	Student(String a,int b, int c, int d, int e, int f){ //생성자
		String name=a;
		 ban=b;
		 no=c;
		 kor=d;
		 eng=e;
		 math=f;
	}
	
	String info(){//메서드
		
		String str = name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
		//메서드안에 메서드를 호출할수 있다.
		return str;
	}
}
//6-6,6-7 피타고라스 정리
class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
	this.x = x;
	this.y = y;
	}
	
	double getDistance(int x, int y) {
	
		double res =(double)x-this.x;
		double res1 =(double)y-this.y;
		double res2 =Math.sqrt(res+res1);
				return res2;
	}	
}



