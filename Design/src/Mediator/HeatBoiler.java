package Mediator;

public class HeatBoiler extends Partcipant{
	private boolean bOff = true;
	
	public HeatBoiler(Mediator mediator) {
		super(mediator);
	}

	
	public void on() {
		if(!bOff) return;
		
		bOff = false;
		mediator.particpantChanged(this);
	}
	
	public void off() {
		if(bOff) return;
		
		bOff = true;
		mediator.particpantChanged(this);
	}
	
	public boolean isRunning() {
		return !bOff;
	}

	@Override
	public String toString() {
		if(bOff) return " 보일러 꺼짐";
		else return " 보일러 켜짐";
	}

}
