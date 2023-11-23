package state;

public class WalkState extends State {

	public WalkState(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void standUp() {
		player.setSepped(0);
		player.talk("멈춰");
		player.setState(new StandUpState(player));
		
	}

	@Override
	public void sitDown() {
		player.setSepped(0);
		player.talk("걷다가 앉으면 넘어질수 있지");
		player.setState(new SitDownState(player));
		
	}

	@Override
	public void walk() {
		player.talk("걷는게 좋지");
		
	}

	@Override
	public void run() {
		player.setSepped(20);
		player.talk("걷다가 뛰면 빨리 뛰지");
		player.setState(new RunState(player));
		
	}

	@Override
	public String getDescription() {
		return "걸어가기";
	}
	
	
	

}
