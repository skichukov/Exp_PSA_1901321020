package stu1901321020;

public class AppMain {

	public static void main(String[] args) {
		
		SantaClaus santaClaus = SantaClaus.getInstance();
		santaClaus.setController();
		santaClaus.setBoard();
		RemoteController ctrl = santaClaus.getController();
		MagicBoard board =santaClaus.getBoard();
		
		WorkshopFactory wheelFactory = new WheelFactory();
		WorkshopFactory dollFactory = new DollFactory();
		
		wheelFactory.setToys();
		
		int i = 0;
		while(i  < 20) {
			Toy wheel = wheelFactory.produceToy("Wheel");
		    Toy doll = dollFactory.produceToy("Doll");
		    i++;
		}
		
		Dwarf dw1 = new Dwarf();
		Dwarf dw2 = new Dwarf();
		Dwarf dw3 = new Dwarf();
		
		dw1.setFactory(wheelFactory);
		dw2.setFactory(wheelFactory);
		dw3.setFactory(wheelFactory);
		dw1.setFactory(dollFactory);
		dw2.setFactory(dollFactory);
		dw3.setFactory(dollFactory);
		
		board.addObserver(dw1);
		board.addObserver(dw2);
		board.addObserver(dw3);
		
		Command needWheel = new IneedWheels(board);
		Command needDoll = new IneedDolls(board);
		
		ctrl.setCommand(needWheel);
		ctrl.say();
		
		ctrl.setCommand(needDoll);
		ctrl.say();

	}

}
