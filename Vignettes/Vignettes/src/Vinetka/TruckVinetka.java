package Vinetka;

import Vehicle.Vehicle;

public class TruckVinetka extends Vinetka{
	private static final int TRUCK_PRICE = 7;
	@Override
	public int getPrice() {
		return super.getPrice()*TRUCK_PRICE;
	}
	@Override
	public void zalepi(Vehicle vehicle) {
		System.out.println("Zalepena e na kolata za 10 sekundi");
		vehicle.setVinetka(this);
	}

}
