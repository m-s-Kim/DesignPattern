package visitor;

public class Main {
	public static void main(String[] args) {
		// 데이터 구조와 데이터 처리를 분리
		// 데이터 처리 방식을 기존의 소스코드 변겨없이 새로운 크래스 추가만으로 확장 할수 있음
		// 데이터 구조는 Composite pattern을 사용해 표현
		
		ItemList list1 = new ItemList();
		list1.add(new Item(10));
		list1.add(new Item(20));
		list1.add(new Item(40));
		
		ItemList list2 = new ItemList();
		list2.add(new Item(30));
		list2.add(new Item(40));
		list1.add(list2);
		
		ItemList list3 = new ItemList();
		list3.add(new Item(25));
		list2.add(list3);
		
		SumVisitor sum = new SumVisitor();
		list1.accept(sum);
		System.out.println("합계" + sum.getValue());
		
		
		AvgVisitor avg = new AvgVisitor();
		list1.accept(avg);
		System.out.println("평균 "+ avg.getValue());
		
		
		
		
	}
}
