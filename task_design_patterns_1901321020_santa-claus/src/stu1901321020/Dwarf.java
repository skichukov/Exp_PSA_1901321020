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
		if(lastInscription == "Трябват ми кукли!") {
		    
			System.out.println("Всяко джудже получи команда: " + lastInscription + " и ще вземе по една кукла.");
			
			return;
		}
		List<Wheel> toys = this.factory.getToys();
		System.out.println("Всяко джудже получи команда: " + lastInscription + " и ще вземе по едно колело.");
	}

	@Override
	public void setMagicBoard(Observable magicBoard) {
		this.magicBoard = magicBoard;
		
	}
	
	public void setFactory(WorkshopFactory factory) {
		this.factory = factory;
		
	}

}
