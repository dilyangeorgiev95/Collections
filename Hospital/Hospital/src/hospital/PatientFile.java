package hospital;

import staff.Doctor;

public class PatientFile {

	private String name;
	private int age;
	private String phoneNumber;
	private String diagnose;
	private String[] medicine;
	private int stay;
	private Doctor doctor;
	private int room;
	private Bed bed;
	
	public PatientFile(String name, int age, String phoneNumber){
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public void setMedicine(String[] medicine) {
		this.medicine = medicine;
	}

	public int getStay() {
		return stay;
	}

	public void setStay(int stay) {
		this.stay = stay;
	}

	public String[] getMedicine() {
		return medicine;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}
	
}
