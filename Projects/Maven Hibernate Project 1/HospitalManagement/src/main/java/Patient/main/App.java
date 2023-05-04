package Patient.main;

import Patient.model.Patient;

import java.util.*;

import Patient.dao.*;


public class App {
	public static void main(String[] args) {
		PatientDao dao = new PatientDao();	    
	    // Create a new patient entity
	    Patient patient = new Patient();
	    patient.setHname("Inlaks");
	    patient.setPname("lapata");
	    patient.setBedno(201);
//	    patient.setAdmitdate(new Date());
	    patient.setContact(98562354);
	    dao.save(patient);
	    
	    patient.setPname("Sandeeep");
	    dao.update(patient);
	    
	    dao.delete(2);
	}
	
}
