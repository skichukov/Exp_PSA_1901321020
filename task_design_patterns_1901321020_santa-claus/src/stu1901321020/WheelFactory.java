package stu1901321020;

import java.util.List;

public class WheelFactory extends WorkshopFactory {

	@Override
	public Toy createToy(String toyName) {
		if(toyName == "Wheel") {
		return new Wheel();
	}
		
		//System.out.println("Unknown toy!");
		return null;
	}

	@Override
	public void removeToy(Toy toy) {
			List<Wheel> toys = getToys();
			toys.remove(toy);
		
	}

}
