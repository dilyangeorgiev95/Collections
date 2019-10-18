package Vinetka;

import Vehicle.Vehicle;

public class BusVinetka extends Vinetka{

	private static final int BUS_PRICE = 9;

	@Override
	public int getPrice() {
		return super.getPrice()*BUS_PRICE;
	}
	
	@Override
	public void zalepi(Vehicle vehicle) {
		System.out.println("Zalepena e na avtobusa za 20 sekundi");
		vehicle.setVinetka(this);
	}

}
