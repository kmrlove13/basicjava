package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx02 {
	public static void main(String[] args) {
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {
			//원래 인터페이스는 임플리먼트를 하고 사용할수 있었는데 그거없이 바로 생성해서 사용 그래서 클래스 이름은 없음 그래서 익명클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");//버튼 눌림 클래스를 만들면 한클래스에 버튼 눌림 한번인데, 클래스 생성과 동시에 버튼눌림 사용가능하며 여러번 수백번 사용가능함
				
			}
		}
		
				);
	}
}
