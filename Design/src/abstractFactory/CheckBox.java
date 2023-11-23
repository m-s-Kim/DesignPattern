package abstractFactory;

public abstract class CheckBox {
	protected boolean bChecked;
	
	public CheckBox(Boolean bChecked) {
		this.bChecked = bChecked;
	}
	
	void setChecked(boolean bChecked) {
		this.bChecked = bChecked;
		render();
	}
	
	abstract void render();

}
