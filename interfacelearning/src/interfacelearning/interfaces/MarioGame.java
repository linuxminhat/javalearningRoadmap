package interfacelearning.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Mario is Jumping");

	}
	@Override
	public void downn() {
		System.out.println("Mario is going to a hole");
	}

	@Override
	public void left() {
		System.out.println("Mario is turning left");
	
	}

	@Override
	public void right() {
		System.out.println("Mario is turning right");
	}
	
}
