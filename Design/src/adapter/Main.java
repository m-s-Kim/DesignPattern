package adapter;

public class Main {
	public static void main(String[] args) {
		// 변경할수 없는 클래스를 원하는 형태로 제작
		Adapter a = new AdapterImpl();
		
		System.out.println(a.halfOf(50f));
	}
}
