package com.GestionMed.Services;

import java.util.List;

import com.GestionMed.Entities.Patient;

public interface PatientService {

	void createPatient(Patient p);
	List<Patient> findPatients();
	Patient findOnePatient(long id);
	void updatePatient(Patient p);
	void deletePatient(long id);
}