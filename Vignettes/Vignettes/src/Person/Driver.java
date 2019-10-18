package Person;
import java.util.ArrayList;
import java.util.List;

import GasStation.GasStation;
import Vehicle.Vehicle;
import Vinetka.Vinetka;
import Vinetka.VinetkaPeriod;

public class Driver {
	private String name;
	private List<Vehicle> vehicles;
	private double money;
	private GasStation gasStation;
	
	public Driver(String name, double money, GasStation gasStation) {
		this.name = name;
		this.money = money;
		this.gasStation = gasStation;
		this.vehicles = new ArrayList<Vehicle>();
	}
	
	public void buyVinetka(VinetkaPeriod period, int vehNum) {
		if(vehNum >=0 && vehNum <vehicles.size()) {
			Vehicle vehicle = this.vehicles.get(vehNum);
			Vinetka vinetka = this.gasStation.sellVinetka(vehicle.getVehicleType(), period);
			if(this.money >= vinetka.getPrice()) {
				this.money -= vinetka.getPrice();
				this.gasStation.setDailyMoney(this.gasStation.getDailyMoney() + vinetka.getPrice());
				vehicle.setVinetka(vinetka);
				vinetka.zalepi(vehicle);
				this.gasStation.getVinetki().remove(vinetka);
				this.gasStation.sortedVinetki(vehNum);
			} else {
				System.out.println("Not enough money");
			}
		}
	}
	
	public void buyVinetkaForAllCars(VinetkaPeriod period) {
		for(int vehNum = 0; vehNum < vehicles.size() ; vehNum++) {
			buyVinetka(period, vehNum);
		}
	}
	
	public void listExpiredVinetki(int day, int month, int year) {
		System.out.println("Az sym " + this.name + " eto mi izteklite winetki:  ");
		for(Vehicle vehicle : vehicles) {
			if(vehicle.getVinetka().isExpired(day, month, year)) {
				System.out.println(vehicle);
			}
		}
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public GasStation getGasStation() {
		return gasStation;
	}

	public void setGasStation(GasStation gasStation) {
		this.gasStation = gasStation;
	}
	
}
