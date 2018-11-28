package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		
		Point3D p3d = new Point3D(10,20,30);
		
		
		
	}
}


class Point2{//같은 패키지안에 같은 이름의 클래스가 있으면 안됨
	
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
		
	}
}

class Point3D extends Point2{
//	Point3D(){ 클래스를 생성하면 컴파일하면서 자동적으로 기본생성
//		super(); {기본생성자안에 컴파일하면서 자동적으로 부모의 기본생성자가 생성
//		
//	}

	int z;
	Point3D(int x, int y, int z){ //변
		super(x,y);
//		super.x=100; super(x,y)대신에 이렇게들 사용할 수 있음 
//		super.y=200;
//		this.x =100; 자식클래스에 인스턴스x가 없기에 부모x를 불러옴
//		this.y=200; 자식클래스에 인스턴스x가 없기에 부모x를 불러옴
		
		this.z=z;
	}



}