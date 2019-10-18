import java.util.ArrayList;
import java.util.Random;

import GasStation.GasStation;
import Person.Driver;
import Vehicle.Vehicle;
import Vehicle.VehicleType;
import Vinetka.BusVinetka;
import Vinetka.CarVinetka;
import Vinetka.TruckVinetka;
import Vinetka.VinetkaPeriod;

public class Demo {
	public static void main(String[] args) {
		GasStation lukoil = new GasStation();

		Driver[] drivers = { new Driver("Dido", new Random().nextDouble() * 1000, lukoil),
				new Driver("Niki", new Random().nextDouble() * 100, lukoil),
				new Driver("Krasi", new Random().nextDouble() * 1000, lukoil),
				new Driver("Pav", new Random().nextDouble() * 100, lukoil) };

		ArrayList<Vehicle> vehicles = new ArrayList<>(10);
		System.out.println(addCarInListFor(drivers, vehicles, 0));
	}

	static String addCarInListFor(Driver[] drivers, ArrayList<Vehicle> vehicles, int position) {
		double v = new Random().nextDouble();
		Driver randomDriver = drivers[(int) (Math.random() * drivers.length)];
		int randomPeriod = new Random().nextInt(VinetkaPeriod.values().length);
		if (position <= randomDriver.getVehicles().size()) {
			if (v < 0.333) {
				Vehicle vehicle = new Vehicle(VehicleType.BUS);
				vehicles.add(vehicle);
				randomDriver.getVehicles().add(vehicle);
				randomDriver.getVehicles().get(position).setModel("Mercedes");
			} else {
				if (v > 0.333 && v < 0.667) {
					Vehicle vehicle = new Vehicle(VehicleType.CAR);
					vehicles.add(vehicle);
					randomDriver.getVehicles().add(vehicle);
					randomDriver.getVehicles().get(position).setModel("Lamborghini");
				} else {
					Vehicle vehicle = new Vehicle(VehicleType.TRUCK);
					vehicles.add(vehicle);
					randomDriver.getVehicles().add(vehicle);
					randomDriver.getVehicles().get(position).setModel("IVEKO");
				}
			}
			return randomDriver.getVehicles().get(position).getModel();
		}
		return "nothing";
	}
}