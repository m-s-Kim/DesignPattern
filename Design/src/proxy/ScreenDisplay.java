package proxy;

public class ScreenDisplay implements Display {

	@Override
	public void print(String content) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(content);
	}
	

}
