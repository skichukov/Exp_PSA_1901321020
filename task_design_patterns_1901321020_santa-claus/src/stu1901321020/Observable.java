package stu1901321020;

public interface Observable {

	void addObserver(Observer obs);
	void removeObserver(Observer obs);
	
	void notifyObservers();
	String getUpdate();
}
