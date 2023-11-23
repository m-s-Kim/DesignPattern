package command;

import java.awt.MultipleGradientPaint.ColorSpaceType;

public class Main {
	public static void main(String[] args) {
		// 하나의 명령을 객체화한 패턴
		// 객체는 전달할수 있고 보관할수 있음 즉 명령을 전달하고 보관할수 있게댐
		// 배치실행, undo, redo 우선수위가 높은명령을 먼저 실행하기등이 가능해짐
		
		Command clearcmd = new ClearCommand();
		clearcmd.run();
		
		
		Command moveCmd = new MoveCommand(10, 1);
		moveCmd.run();
		
		
	}
}
