import hospital.Hospital;
import patient.Patient;

public class Demo {
	public static void main(String[] args) {
		
		Patient[] patients = {
				new Patient("Didkata", 25, "0888854652", "Male"),
				new Patient("Goran", 45, "0898852352", "Male"),
				new Patient("Rambo", 31, "0834854652", "Male"),
				new Patient("Queen Marry", 25, "0881234652", "Female"),
				new Patient("Maria", 18, "0886784652", "Female")
		};
		
		
		Hospital mbalHanKrum = new Hospital();
		mbalHanKrum.addStaff();
		for (int i = 0; i < patients.length; i++) {
			mbalHanKrum.doctorExamination(patients[i]);
		}
		mbalHanKrum.freeBedsReport();
		for (int i = 0; i < 10; i++) {		
			mbalHanKrum.passDay();
			mbalHanKrum.dischargeNextDayReport();
			
		}
		mbalHanKrum.freeBedsReport();
		
		
	}
}
