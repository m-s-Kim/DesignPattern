package abstractFactory;

public class LinuxButton extends Button {

	public LinuxButton(String caption) {
		super(caption);
	}

	@Override
	void render() {
		System.out.println(
				"LINUX 렌더링"
				+this.caption
				+ " 버튼을 그림"
				);
		
	}

}
