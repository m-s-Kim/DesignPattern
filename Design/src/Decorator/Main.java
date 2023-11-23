package Decorator;

import java.io.LineNumberInputStream;

public class Main {
	public static void main(String[] args) {
		// 기능을 계속 추가할 수 있는 패턴
		// 기능을 실행중에 동적으로 변경 또는 확장 할수 있는 패턴
		Strings strings = new Strings();
		
		strings.add("Hello");
		strings.add("333333333333333");
		strings.add("aaaaaaaaaaaaaaaaaaaa");
		strings.add("11111111111111");
		strings.add("22222222222222");
//		strings.print();
		
		Item decorator  = new SideDecorator(strings, '\"');
		decorator = new LineNumberDecorator(decorator);
		decorator.print();
		decorator = new BoxDecorator(decorator);
		
		decorator.print();
		 
		
		
	}
}
