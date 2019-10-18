package Vinetka;

import Vehicle.Vehicle;

public enum VinetkaPeriod {
	DAY(1),MONTH(10),YEAR(60);
	
	private int price;
	private Vehicle vehicle;
	
	private VinetkaPeriod(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
