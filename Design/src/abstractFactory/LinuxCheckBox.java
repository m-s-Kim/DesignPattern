package abstractFactory;

public class LinuxCheckBox extends CheckBox{

	public LinuxCheckBox(Boolean bChecked) {
		super(bChecked);
	}

	@Override
	void render() {
		System.out.println(
				"LINUX 렌더링"
				+ (this.bChecked ? "체크된 ": "체크 안된")
				+ " 체크 박스 그림"
				);
		
	}
	
	
	

}
