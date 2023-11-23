package flyweight;

public class Main {
	public static void main(String[] args) {
		// 어떤 객체를 사용하기 위해 매번 생성ㅎ지 않고 한번만 생성하고 다시 필요해질때
		// 이전에 생성된 객체를 재사용 할수 있음
		// 객체를 생성할때 많은 자원이 소모될경우 플라이 패턴을 적용하여 훨씬 적은 자원만으로 
		// 필요한 객체를 재사용 가능
		Number number = new Number(33321);
		number.print(2, 3);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
