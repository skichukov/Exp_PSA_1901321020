package stu1901321020;

public class DollFactory extends WorkshopFactory {

	@Override
	public Toy createToy(String toyName) {
		if(toyName == "Doll") {
			return new Doll();
		}
		System.out.println("Unknown toy!");
		return null;
		
	}

	@Override
	public void removeToy(Toy toy) {
		// TODO Auto-generated method stub
		
	}

}
