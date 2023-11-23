package command;

public class ClearCommand implements Command{

	@Override
	public void run() {
	System.out.println("\033[H\033[23"); // 화면 지우는 코드값
//	System.out.println("\\033[H\\033[2h");
	System.out.flush();
	}
	
}
