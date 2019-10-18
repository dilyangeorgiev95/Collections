package patient;

import hospital.PatientFile;

public class Patient {

	private String name;
	private int age;
	private String phoneNumber;
	private String gender;
	private PatientFile file;
	private String[] medicine;

	public Patient(String name, int age, String phoneNumber, String gender) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}

	public void takeMedicine() {
		for (int i = 0; i < medicine.length; i++) {
			System.out.println(this.name + " took " + this.medicine[i]);
		}
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public PatientFile getFile() {
		return file;
	}

	public void setFile(PatientFile file) {
		this.file = file;
	}

	public void setMedicine(String[] medicine) {
		this.medicine = medicine;
	}

}
