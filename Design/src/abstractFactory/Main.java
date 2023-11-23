package abstractFactory;

public class Main {
	public static void main(String[] args) {
		// 추상적인 것들을 만드는 공장
		// 먼저 만들어야할 컴포넌트들을 추상적으로 정하고 어떤 구체적인 상황이주어지면
		// 각 컴포넌트들을 구체적으로 만듬
		
		
		ComponentFactory factory = new WindowsFactory();
		
		
		
		Button button = factory.createButton("제목");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit = factory.createTextEdit("ddddddddddddd");
		
		
		button.render();
		checkBox.render();
		textEdit.render();
		
		button.clickEvent();
		checkBox.setChecked(true);
		
		
		
		
	}
}
