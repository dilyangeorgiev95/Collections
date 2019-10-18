package hospital;

import patient.Patient;

public class Bed {
	
	private Patient patient;
	private boolean isEmpty;
	
	public Bed(){
		this.isEmpty = true;
	}

	public Patient getPatient() {
		return patient;
		
	}	
	
	public void setPatient(Patient patient){
		this.patient = patient;
		System.out.println(this.patient.getName() + " was accomodated." );
		patient.getFile().setBed(this);
		this.isEmpty = false;
	}

	public boolean isEmpty() {
		return isEmpty;
	}
	
	public void leaveBed(){
		this.patient = null;
		isEmpty = true;
	}
}
