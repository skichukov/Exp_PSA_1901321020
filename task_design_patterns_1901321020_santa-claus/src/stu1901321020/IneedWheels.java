package stu1901321020;

public class IneedWheels implements Command {

	private MagicBoard board;
	
	public IneedWheels(MagicBoard board) {
		this.board = board;
	}
	
	@Override
	public void execute() {
		this.board.setInscription("Трябват ми колела!");

	}

}
