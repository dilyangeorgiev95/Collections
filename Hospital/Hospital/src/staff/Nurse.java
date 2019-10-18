package staff;

import patient.Patient;

public class Nurse extends Staff{
	
	private int experience;

	public Nurse(String name, String phoneNumber, int experience) {
		super(name, phoneNumber);
		this.experience = experience;
	}

	public void giveMedicine(Patient patient){
		System.out.println("My name is " + this.getName() + " and im the nurse. Take this medicine.");
		patient.setMedicine(patient.getFile().getMedicine());
		patient.takeMedicine();
	}
}
