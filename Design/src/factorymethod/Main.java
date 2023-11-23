package factorymethod;

public class Main {
	public static void main(String[] args) {
		// 객체생성을 위한 패턴
		// 객체생성에 필요한 과정을 템플릿처럼 정해놓고 각 과정을 다양하게 구현이 가능
		// 구체적으로 생성할 클래스를 우연하게 정할 수 있음
		// 개체 생성에 대한 인터페이스와 구현의 분리
		
		
		Factory factory = new ItemFactory();
		
		Item item = factory.create("sword");
		if(item != null ) item.use();
		
		Item item2 = factory.create("shield");
		if(item2 != null ) item2.use();
		
		Item item3 = factory.create("bow");
		if(item3 != null ) item3.use();
		
		Item item4 = factory.create("aadf");
		if(item4 != null ) item4.use();
		
		
		factory.create("bow");
		factory.create("bow");
		
	}
}
