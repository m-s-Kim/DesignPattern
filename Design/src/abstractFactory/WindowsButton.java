package abstractFactory;

public class WindowsButton extends Button {

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	void render() {
		System.out.println(
				"WINDOWS 렌더링"
				+this.caption
				+ " 버튼을 그림"
				);
		
		
	}
	
	

}
