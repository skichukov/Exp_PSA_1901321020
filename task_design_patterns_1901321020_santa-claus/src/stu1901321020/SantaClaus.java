package stu1901321020;

public class SantaClaus {
	
	private static SantaClaus santaClaus;
	private  MagicBoard board;
	private RemoteController controller;
	
	private SantaClaus() {
		
	}
	
	public static SantaClaus getInstance() {
		if(santaClaus == null) {
			santaClaus = new SantaClaus();
		}
		
		return santaClaus;
	}

	public RemoteController getController() {
		return controller;
	}

	public void setController() {
		this.controller = new RemoteController();
	}

	public MagicBoard getBoard() {
		return board;
	}

	public void setBoard() {
		this.board = new MagicBoard();
	}

}
