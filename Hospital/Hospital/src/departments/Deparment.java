package departments;

import java.util.ArrayList;

import hospital.PatientFile;
import hospital.Room;
import patient.Patient;

public abstract class Deparment {
	
	private static final int ROOMS_COUNT = 10;
	
	private Room[] rooms = new Room[ROOMS_COUNT];
	private ArrayList<Patient> patients;	
	
	public Deparment(){
		for (int i = 0; i < rooms.length; i++) {
			this.rooms[i] = new Room();
		}
		this.patients = new ArrayList<>();
	}

	public boolean addPatient(Patient patient){
		if (patient.getGender().equalsIgnoreCase("Female")) {
			for (int i = 0; i < rooms.length; i++) {				
				if (rooms[i].IsMaleRoom() == null ||!rooms[i].IsMaleRoom()  && !rooms[i].isFull() ) { //TODO check
					for (int j = 0; j < rooms[i].getBeds().length; j++) {
						if (rooms[i].getBeds()[j].isEmpty()) {
							this.createFile(patient);
							rooms[i].getBeds()[j].setPatient(patient);
							rooms[i].setIsMaleRoom(false);
							System.out.println("Room " + rooms[i].getRoomNumber());					
							this.patients.add(patient);							
							patient.getFile().setRoom(rooms[i].getRoomNumber());
							return true;
						}
					}
				}
			}
		}
		else {
			for (int i = 0; i < rooms.length; i++) {			
				if ( rooms[i].IsMaleRoom() == null || rooms[i].IsMaleRoom() && !rooms[i].isFull() ) {
					for (int j = 0; j < rooms[i].getBeds().length; j++) {
						if (rooms[i].getBeds()[j].isEmpty()) {
							this.createFile(patient);
							rooms[i].getBeds()[j].setPatient(patient);
							rooms[i].setIsMaleRoom(true);
							System.out.println("Room " + rooms[i].getRoomNumber());						
							this.patients.add(patient);						
							patient.getFile().setRoom(rooms[i].getRoomNumber());
							return true;
						}
					}
				}
			}
			
		}	
		System.out.println("Sorry mate, the department is full.");
		return false;
	}
	
	public Room[] getRooms() {
		return rooms;
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void createFile(Patient patient){
		patient.setFile((new PatientFile(patient.getName(), patient.getAge(), patient.getPhoneNumber())));
	}
	
	 public void printRooms(){
		 for (int i = 0; i < rooms.length; i++) {
			System.out.println(this.rooms[i].getRoomNumber());
			
		}
	 }
	
}
