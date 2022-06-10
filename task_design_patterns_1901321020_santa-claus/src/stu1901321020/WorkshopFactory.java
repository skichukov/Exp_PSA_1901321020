package stu1901321020;

import java.util.ArrayList;
import java.util.List;

public abstract class WorkshopFactory {
	
	private List<Wheel> wheels;
	
	public abstract Toy createToy(String toyName);
	public abstract void removeToy(Toy toy);
	
	public void setToys() {
		this.wheels = new ArrayList<>();
	}
	
	public List<Wheel> getToys() {
		return this.wheels;
	}
	
	public Toy produceToy(String toyName) {
		Toy toy = createToy(toyName);
		toy.produce();
		if(toyName == "Wheel") {
			this.wheels.add((Wheel) toy);
		}
		
		return toy;
	}

}
