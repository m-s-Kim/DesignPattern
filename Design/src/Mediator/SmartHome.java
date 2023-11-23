package Mediator;

public class SmartHome implements Mediator {
	public Door door = new Door(this);
	public Window window = new Window(this);
	public HeatBoiler heatBoiler = new HeatBoiler(this);
	public CoolAircon coolAircon = new CoolAircon(this);
	

	@Override
	public void particpantChanged(Partcipant partcipant) {
		if(partcipant == door && !door.isClosed()) {
			coolAircon.off();
			heatBoiler.off();
		}
		
		if(partcipant == window && !window.isClosed()) {
			coolAircon.off();
			heatBoiler.off();
		}
		
		if(partcipant == coolAircon && coolAircon.isRunning()) {
			heatBoiler.off();
			door.close();
			window.close();
		}
		
		if(partcipant == heatBoiler && heatBoiler.isRunning()) {
			coolAircon.off();
			door.close();
			window.close();
		}
		
	}
	
	public void report() {
		System.out.println("\033[H\033[2J[집안상태]");
		System.out.println(door);
		System.out.println(window);
		System.out.println(heatBoiler);
		System.out.println(coolAircon);
		System.out.println();
	}

}
