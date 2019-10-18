package Vehicle;
import Vinetka.Vinetka;

public class Vehicle {
	private String model;
	private Vinetka vinetka;
	private int year;
	private VehicleType vehicleType;
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	public Vehicle(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public Vinetka getVinetka() {
		return vinetka;
	}

	public void setVinetka(Vinetka vinetka) {
		this.vinetka = vinetka;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
}
