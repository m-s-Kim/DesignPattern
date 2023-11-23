package abstractFactory;

public class LinuxTextEdit extends TextEdit {

	public LinuxTextEdit(String value) {
		super(value);
	}

	@Override
	public void render() {
		System.out.println(
				"LINUX 렌더링"
				+this.value + " 값을 가진"
				+ " TEXTEDIT 그림"
				);		
	}
	
	
	
}
