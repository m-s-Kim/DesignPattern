package Mediator;

public class Door extends Partcipant {
	private boolean bClosed = true;
	
	public Door(Mediator mediator) {
		super(mediator);
	}
	
	public void open() {
		if(!bClosed) return;
		
		bClosed = false;
		mediator.particpantChanged(this);
	}
	
	public void close() {
		if(bClosed) return;
		
		bClosed = true;
		mediator.particpantChanged(this);
	}
	
	public boolean isClosed() {
		return bClosed;
	}

	@Override
	public String toString() {
		if(bClosed) return " 문 닫힘";
		else return " 문 열림";
	}
	

	

}
