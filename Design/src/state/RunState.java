package state;

public class RunState extends State{

	public RunState(Player player) {
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
		player.talk("뛰다가 앉으면 넘어질수 있지");
		player.setState(new SitDownState(player));
		
	}

	@Override
	public void walk() {
		player.setSepped(5);
		player.talk("힘들자 좀 걷자");
		player.setState(new WalkState(player));
		
	}

	@Override
	public void run() {
		player.talk("말걸지마라 힘들다 후 ");
		
	}

	@Override
	public String getDescription() {
		return "뛰는중";
	}
	
	
	

}
