package proxy;

public class Main {
	public static void main(String[] args) {
		// 어떤 작업의 실행을 대리인을 통해 실행하도록 하는패턴
		Display display = new BufferDisplay(5);
//		Display screenDisplay = new BufferDisplay(5);
		
		display.print("dddddddddddddddddd");
		display.print("4");
		display.print("3");
		display.print("22");
		display.print("1");
		display.print("0");
		display.print("0");
		display.print("0");
		display.print("0");
		display.print("0");
		display.print("0");
		display.print("0");
		display.print("0");
		display.print("0");
		
		
		
		((BufferDisplay)display).flush();
		
	}
}
