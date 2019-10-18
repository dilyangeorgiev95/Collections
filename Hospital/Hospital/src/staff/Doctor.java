package staff;

import java.util.Random;

import patient.Patient;

public class Doctor extends Staff{
	
	private String specialization;

	public Doctor(String name, String phoneNumber,String specialization) {
		super(name, phoneNumber);
		this.specialization = specialization;
		
	}
	
	public String giveDiagnose(){
		String[] diagnoses = {"Broken leg", "Flu", "Heart atack"};
		
		return diagnoses[new Random().nextInt(diagnoses.length)];
	}
	
	public void doVisitingRound(Patient patient){
		System.out.println("Doctor " + this.getName() + " visited " + patient.getName() + ". The patient is still Alive.");
		System.out.println("------------------");
	}
	
}
