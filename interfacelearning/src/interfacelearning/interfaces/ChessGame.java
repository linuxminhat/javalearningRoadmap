package interfacelearning.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move piece up");
		
	}

	@Override
	public void downn() {
		// TODO Auto-generated method stub
		System.out.println("Move piece downn");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move piece left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move piece right");
	}
	

}
