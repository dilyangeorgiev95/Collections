package Vinetka;

import Vehicle.Vehicle;

public class CarVinetka extends Vinetka {
	private static final int CAR_PRICE = 5;
	@Override
	public int getPrice() {
		return super.getPrice()*CAR_PRICE;
	}
	@Override
	public void zalepi(Vehicle vehicle) {
		System.out.println("Zalepena e za kola za 5 sekundi");
		vehicle.setVinetka(this);
	}

}
