package Mediator;

public class CoolAircon  extends Partcipant{
private boolean bOff = true;
	
	public CoolAircon(Mediator mediator) {
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
		if(bOff) return " 에어콘 꺼짐";
		else return " 에어콘 켜짐";
	}
}
