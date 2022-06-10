package stu1901321020;

public class IneedDolls implements Command {
	
	private MagicBoard board;

	public IneedDolls(MagicBoard board) {
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.setInscription("Трябват ми кукли!");

	}

}
