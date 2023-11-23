package chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		// 여러개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴
		// 기능을 클래스 별로 분리 하여 구현하므오 클래스 코드가 최적화
		
		Handler handler1 = new ProtocolHandler();
		Handler handler2 = new PortHandler();
		Handler handler3 = new DomainHandler();
		
		handler1.setNext(handler2).setNext(handler3);
		
		String url = "http://www.youtube.com:1007";
		System.out.println("input "+ url);
		
		
		handler1.run(url);
		
	}
}
