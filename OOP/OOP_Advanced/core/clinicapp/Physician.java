package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
public class Physician extends User implements  HIPAACompliantUser{
	
	private ArrayList<String> patientNotes;
	
	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public boolean assignPin(int pin) {
		if (pin < 1000 || pin > 9999) {
            return false;
        }
        setPin(pin);
        return true;
    
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		return this.getId().equals(confirmedAuthID);
	}
	
	 public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }



	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}



	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
}
