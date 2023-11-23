package bridge;

public class main {
	public static void main(String[] args) {
		// 구현계층과 기능계층 영역 2개존재
		// 시스템과 확장성과 유지보수성 높이는 패턴
		// 기능계층을 통해 기존에 작성ㅇ된 코드 변화 최소화
		var title = "복원용";
		var author = "나";
		String[] content = {"dddd","123","23123"};
		
		Draft draft = new Draft(title, author, content);
		Display display1 = new SimpleDisplay();
		draft.print(display1);
		System.out.println();
		
		Display display2 = new CaptionDisplay();
		draft.print(display2);
		
		System.out.println("===========================");
		
		Publication p = new Publication(title, author, content, "dd", 1000);
		
		p.print(display1);
		
		
	}
}
