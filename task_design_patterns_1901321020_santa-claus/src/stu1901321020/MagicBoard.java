package stu1901321020;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

	private List<Observer> dwarfs;
	private String insription;
	
	public MagicBoard() {
		this.dwarfs = new ArrayList<>();
	}
	
	public void setInscription(String inscription) {
		this.insription = inscription;
		this.notifyObservers();

	}

	@Override
	public void addObserver(Observer obs) {
		this.dwarfs.add(obs);
		obs.setMagicBoard(this);
	}

	@Override
	public void removeObserver(Observer obs) {
		this.dwarfs.remove(obs);
		obs.setMagicBoard(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : this.dwarfs) {
			obs.update();
		}
		
	}

	@Override
	public String getUpdate() {
		return this.insription;
	}
	
}
