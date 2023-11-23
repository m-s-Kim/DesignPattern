package abstractFactory;

public class WindowsCheckBox extends CheckBox {

	public WindowsCheckBox(Boolean bChecked) {
		super(bChecked);
	}

	@Override
	void render() {
		System.out.println(
				"WINDOWS 렌더링"
				+ (this.bChecked ? "체크된 ": "체크 안된")
				+ " 체크 박스 그림"
				);
		
	}
	

}
