package stu1901321020;

import java.util.List;

public class Dwarf implements Observer {
	
	private Observable magicBoard;
	private WorkshopFactory factory;

	public Dwarf() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		if(this.magicBoard == null) {
			System.out.println("No magicBoard set");
			return;
		}
		String lastInscription = this.magicBoard.getUpdate();
		if(lastInscription == "������� �� �����!") {
		    
			System.out.println("����� ������ ������ �������: " + lastInscription + " � �� ����� �� ���� �����.");
			
			return;
		}
		List<Wheel> toys = this.factory.getToys();
		System.out.println("����� ������ ������ �������: " + lastInscription + " � �� ����� �� ���� ������.");
	}

	@Override
	public void setMagicBoard(Observable magicBoard) {
		this.magicBoard = magicBoard;
		
	}
	
	public void setFactory(WorkshopFactory factory) {
		this.factory = factory;
		
	}

}
