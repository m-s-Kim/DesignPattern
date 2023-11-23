package Strategy;

import javax.swing.event.AncestorEvent;

public class strategy {
	public static void main(String[] args) {
		// 기능에 대한 선언과 구현 분리
		// 기능사용 통로
		Ainterface ainterface = new AinterfaceImpl();
		
		ainterface.funcA();
		
		AObj a = new AObj();
		a.funcAA();
	}
}
