package F_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		DrawShape ds = new DrawShape("대웅이 잘생겼다.");
		
	
	}
	public void paint(Graphics g){//drawshape는 frame클래스의 자식, 그래서 뭐든지 frame먼저 올림,오버라이딩		
		//g의 주소가 만들어지는 이유는 graphics 클래스 타입, 그러니까 참조변수 이기에 주소가 만들어짐
		//1. 원 객체를 만드세요(매개변수 두개짜리 생성자를 이용해주세요)
		//(매개변수 두개짜리 생성자를 이용해주세요)
		//150,150 50
		Point p1 = new Point(150,150); //원객체를 생성하려면 포인트클래스의 주소가 필요해서 주소 생성
		Circle c = new Circle(p1,50); 
		
		
		//2.원을 그려주세요 
		//g.drawOval(int, int, int, int)
		//원의 크기가가 Point 클래스에 저장되어있음
		g.drawOval(c.center.x, c.center.y, c.r, c.r);
		
		
		//3.삼각형 객체를 만드세요
		//매개변수 하나짜리 생성자를 이용해주세요
		//100,100 200,200 200,100 직각삼각형
		//점세개에 배열주소를 하나씩 적어줌
//		Triangle[] semo = {new Triangle(new Point(100,100),new Point(200,200),new Point(200,100))};
		
		Point p2 = new Point(100,100);//포인트배열주소 생성
		Point p3 = new Point(200,200);
		Point p4 = new Point(200,100);
		Point[] pp = new Point[3];//배열주소를 담음
		pp[0] = p2; //배열 방에 주소를 넣어줌
		pp[1] = p3;
		pp[2] = p4;
		
		Triangle t1 = new Triangle(pp);
		
		
		//4.삼각형을 그려주세요
		//g.drawLine(int,int,int,int)
		
		g.drawLine(t1.p[0].x,t1.p[0].y,t1.p[1].x,t1.p[1].y);
		g.drawLine(t1.p[1].x,t1.p[1].y,t1.p[2].x,t1.p[2].y);
		g.drawLine(t1.p[2].x,t1.p[2].y,t1.p[0].x,t1.p[0].y);
		
	}
	
	//윈도우창을 띄우고, 도형들 불러들이기
	DrawShape(){
		setTitle("그냥 만들었옹");//제목만드는 것
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.MAGENTA);
		setResizable(false);
	}
	DrawShape(String Title){
		setTitle(Title);//제목만드는 것
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.CYAN);
		setResizable(false);//크기 변경 못하게
	}
	//set-세팅, get-얻어온다
	
}	
class Point{
	int x;
	int y;
	//매개변수 2개짜리 생성자 만들기
	Point(int x, int y){
		this.x = x; //this 지역변수와 인스턴스 변수를 구별함
		this.y = y;
	}
}
class Circle{
	//1. 점하나를 저장할 수 있는 변수 center를 선언
	Point center;// 써클은 포인트를 포함하고 있다.
	//2. 반지름(정수)를 저장할수 있는 변수 r을 선언
	int r;
	//3. 매개변수가 2개인 생성자를 만드세요
	//단 매개변수 두개로 center와 r을 초기화 해주세요
	
	Circle(Point center, int r){
		
		this.center=center;
		this.r=r;
		
	}
	
	//4. 기본생성자를 만들어주세요
	//단, 매개변수가 두개인 생성자를 이용하여 점(50,50)으로 반지름은 100으로 만들어주세요
	
	Circle(){
	
		this(new Point(50,50),100);//this안에 Point의 주소를 불러와야 하는데, new가 주소를 생성함
	}
}

class Triangle{
	//1. 점 세개를 저장할 수 있는 변수 p를 선언
	Point[] p;
	
	//2. 매개변수가 하나인 생성자를 만드세요
	//단 매개변수의 값으로 p를 초기화해주세요
	
	 Triangle (Point[] p){
		 this.p = p;
	 }
	
	
	//3. 매개변수가 세개인 생성자를 만드세요
	//단 매개변수 세개로 p를 초기화해주세요

	 Triangle(Point a,Point b,Point c){
		this.p = new Point[]{a,b,c};
	 }
	 
	 
	 
}
