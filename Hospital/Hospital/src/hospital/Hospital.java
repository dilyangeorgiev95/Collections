package hospital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import departments.Cardiology;
import departments.Deparment;
import departments.Orthopedy;
import departments.Virology;
import patient.Patient;
import staff.Doctor;
import staff.Nurse;

public class Hospital {
	private Random random = new Random();
	private static final int DEPARTMENTS_COUNT = 3;
	
	private static int days = 1;
	private ArrayList<Doctor> doctors;
	private ArrayList<Nurse> nurses;
	private Deparment[] deparments = new Deparment[DEPARTMENTS_COUNT];
		
	public Hospital() {
		this.doctors = new ArrayList<>();
		this.nurses = new ArrayList<>();
		this.deparments[0] = new Cardiology();
		this.deparments[1] = new Virology();
		this.deparments[2] = new Orthopedy();
	}
	
	public void doctorExamination(Patient patient){
		
		Doctor doctor = doctors.get(random.nextInt(doctors.size()));
		String diagnose = doctor.giveDiagnose();
		String[] flueMedicine = {"Coldrex", "Vitamic C", "Morphine"};
		String[] brokenMedicine = {"Panadol baby", "Upsarin", "Morphine"};
		String[] atackMedicine = {"Prozac", "Leponex", "Morphine"};
		
		for (int i = 0; i < deparments.length; i++) {
			if (deparments[i] instanceof Virology && diagnose.equals("Flu") ) {
					if (deparments[i].addPatient(patient)) {
						System.out.println("Deparment: Virology");
						patient.getFile().setDiagnose("Flu");
						System.out.println("Diagnose: " + patient.getFile().getDiagnose());	
						System.out.println("--------------");
						patient.getFile().setMedicine(flueMedicine);
						patient.getFile().setStay(random.nextInt(3)+3);
						patient.getFile().setDoctor(doctor);
					}
						
			}
			else if (deparments[i] instanceof Orthopedy && diagnose.equals("Broken leg")) {
				if (deparments[i].addPatient(patient)) {
					System.out.println("Deparment: Orthopedy");
					patient.getFile().setDiagnose("Broken leg");
					System.out.println("Diagnose: " + patient.getFile().getDiagnose());
					System.out.println("--------------");
					patient.getFile().setMedicine(brokenMedicine);
					patient.getFile().setStay(random.nextInt(3)+3);
					patient.getFile().setDoctor(doctor);
				}
							
			}
			else if (deparments[i] instanceof Cardiology && diagnose.equals("Heart atack")) {
				if (deparments[i].addPatient(patient)) {
					System.out.println("Deparment: Cardiology");
					patient.getFile().setDiagnose("Heart atack");
					System.out.println("Diagnose: " + patient.getFile().getDiagnose());		
					System.out.println("--------------");
					patient.getFile().setMedicine(atackMedicine);
					patient.getFile().setStay(random.nextInt(3)+3);
					patient.getFile().setDoctor(doctor);
				}						
			}
			
		}
		
	}
	public void printInfo(){
		for (int i = 0; i < deparments.length; i++) {
			deparments[i].printRooms();
		}
	}
	
	public void addStaff(){
		
		this.doctors.add(new Doctor("House", "08865466644", "Orthopedy"));
		this.doctors.add(new Doctor("Carter", "08865846644", "Virology"));
		this.doctors.add(new Doctor("D-r Dido", "088626666644", "Cardiology"));
		
		this.nurses.add(new Nurse("Marina", "08965855525", 3));
		this.nurses.add(new Nurse("Cecka", "08965687525", 12));
		this.nurses.add(new Nurse("Vaska", "0896569847525", 8));
	}
	
	public void passDay(){	
		System.out.println("Day " + days);
		System.out.println("*****************");
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		for (int i = 0; i < deparments.length; i++) {		
			for (int j = 0; j < deparments[i].getPatients().size(); j++) {
				if (deparments[i].getPatients().get(j).getFile().getStay() == 0) {	
					temp.add(j);

				}
				else {
					deparments[i].getPatients().get(j).getFile().setStay(deparments[i].getPatients().get(j).getFile().getStay() - 1);
					nurses.get(random.nextInt(nurses.size())).giveMedicine(deparments[i].getPatients().get(j));
					doctors.get(random.nextInt(doctors.size())).doVisitingRound(deparments[i].getPatients().get(j));
				}							
			}
			
			Collections.sort(temp);
			for (int j = 0; j < temp.size(); j++) {
				dischargePatient(deparments[i].getPatients().get(temp.get(temp.size() - j - 1)), deparments[i]);
			}
			temp.clear();
		}
				this.days++;
	}
	
	private void dischargePatient(Patient patient, Deparment dep){
		System.out.println(patient.getName() + " with " + patient.getFile().getDiagnose() + " was discharged and left room " + patient.getFile().getRoom());
		patient.getFile().getBed().leaveBed();
		dep.getPatients().remove(patient);
	}
	
	public void freeBedsReport(){
		int freeBedsCardio = 0;
		int freeBedsVirology = 0;
		int freeBedsOrto = 0;
		for (int i = 0; i < deparments.length; i++) {
			for (int j = 0; j < deparments[i].getRooms().length; j++) {
				if (deparments[i] instanceof Virology) {
					freeBedsVirology += deparments[i].getRooms()[j].getFreeBeds();
					
				}
				else if (deparments[i] instanceof Orthopedy) {
					freeBedsOrto += deparments[i].getRooms()[j].getFreeBeds();
					
				}
				else if (deparments[i] instanceof Cardiology) {
					freeBedsCardio += deparments[i].getRooms()[j].getFreeBeds();
					
				}
				
			}
		}
		
		System.out.println(freeBedsCardio + " free beds in Cardiology.");
		System.out.println(freeBedsOrto + " free beds in Orthopedy.");
		System.out.println(freeBedsVirology + " free beds in Virology.");
		System.out.println("-----------------");
		
	}
	
	public void dischargeNextDayReport(){
		for (int i = 0; i < deparments.length; i++) {
			for (int j = 0; j < deparments[i].getPatients().size(); j++) {
				if (deparments[i].getPatients().get(j).getFile().getStay() == 0) {

					System.out.println(deparments[i].getPatients().get(j).getName() + " will be discharged next day.");
					System.out.println("------------");
				}
				
			}
		}
	}
	
}
