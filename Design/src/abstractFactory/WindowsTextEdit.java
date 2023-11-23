package abstractFactory;

public class WindowsTextEdit extends TextEdit {

	public WindowsTextEdit(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.println(
				"WINDOWS 렌더링"
				+this.value + " 값을 가진"
				+ " TEXTEDIT 그림"
				);
		
	}
	
	
	

}
