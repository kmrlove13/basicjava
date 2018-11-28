package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx01 {
	public static void main(String[] args) {
		Button b = new Button(); 
		ActionListener a = new EventHandler(); //인터페이스 타입의 참조변수로 그를 구현한 구현체(클래스)에 인스턴스를 참조할 수 있다.
		b.addActionListener(a); //액션을 읽어주는 메서드
		
		//1. 얘를 먼저 임플리먼트 하는 클래스를 만들고
		
		
	}
}

class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼눌림");
	}
	
}