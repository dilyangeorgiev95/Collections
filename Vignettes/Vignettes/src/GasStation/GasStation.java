package GasStation;

import java.util.ArrayList;
import java.util.List;

import Vehicle.VehicleType;
import Vinetka.*;

public class GasStation {
	private static final int VINETKI_REGENERATION = 10;
	private int dailyMoney;
	private List<Vinetka> vinetki = new ArrayList<>();
	
	public GasStation() {
		for(int vinetkaNum = 0; vinetkaNum < VINETKI_REGENERATION;vinetkaNum++) {
			double randomVeh = Math.random();
			if(randomVeh <0.333) {
				this.vinetki.add(new BusVinetka());
				this.vinetki.get(vinetkaNum).setVinetkaColor(this.vinetki.get(vinetkaNum).getVinetkaColor().BUSCOLOR);
			} else {
				if(randomVeh>0.333 && randomVeh < 0.667) {
					this.vinetki.add(new CarVinetka());
					this.vinetki.get(vinetkaNum).setVinetkaColor(this.vinetki.get(vinetkaNum).getVinetkaColor().CARCOLOR);
				} else {
					this.vinetki.add(new TruckVinetka());
					this.vinetki.get(vinetkaNum).setVinetkaColor(this.vinetki.get(vinetkaNum).getVinetkaColor().TRUCKCOLOR);
				}
			}
			double randomPer = Math.random();
			if(randomPer <0.333) {
				this.vinetki.get(vinetkaNum).setPeriod(this.vinetki.get(vinetkaNum).getPeriod().DAY);
			} else {
				if(randomPer>0.333 && randomPer < 0.667) {
					this.vinetki.add(new CarVinetka());
					this.vinetki.get(vinetkaNum).setPeriod(this.vinetki.get(vinetkaNum).getPeriod().MONTH);
				} else {
					this.vinetki.add(new TruckVinetka());
					this.vinetki.get(vinetkaNum).setPeriod(this.vinetki.get(vinetkaNum).getPeriod().YEAR);
				}
			}
			System.out.println("Vinetka nomer " + vinetkaNum + " struva " + vinetki.get(vinetkaNum).getPrice() + " s cvqt " + vinetki.get(vinetkaNum).getVinetkaColor().getColor());
		}
	}
	
	public Vinetka sellVinetka(VehicleType vehType, VinetkaPeriod period) {
		for(int i = 0; i < vinetki.size() ; i++) {
			if(vinetki.get(i).getPeriod().equals(period)) {
				if(vehType.equals(VehicleType.BUS)) {
					return this.vinetki.get(i);
				}
				if(vehType.equals(VehicleType.CAR)) {
					return this.vinetki.get(i);
				}
				if(vehType.equals(VehicleType.TRUCK)) {
					return this.vinetki.get(i);
				}
			}
		}
		return null;
		//vinetkata se maha - mahnata e
		// da ostanat sortirani - sortirani sa
	}

	public int getDailyMoney() {
		return dailyMoney;
	}

	public void setDailyMoney(int dailyMoney) {
		this.dailyMoney = dailyMoney;
	}

	public List<Vinetka> getVinetki() {
		return vinetki;
	}

	public void setVinetki(List<Vinetka> vinetki) {
		this.vinetki = vinetki;
	}
	
	public void sortedVinetki(int numOfVinetka) {
		ArrayList<Vinetka> sortedVinetki = new ArrayList<Vinetka>();
		Vinetka tempVinetka;
		for(int first = 0; first < vinetki.size(); first++) {
			for(int second = 0; second < vinetki.size(); second++) {
				Vinetka currVinetka = this.vinetki.get(numOfVinetka);
				Vinetka nextVinetka = this.vinetki.get(numOfVinetka);
				if(currVinetka.getPrice() > nextVinetka.getPrice()) {
					tempVinetka = currVinetka;
					currVinetka = nextVinetka;
					nextVinetka = tempVinetka;
					sortedVinetki = (ArrayList<Vinetka>) vinetki;
				}
			}
		}
	}
}
