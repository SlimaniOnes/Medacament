package com.GestionMed.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionMed.Repositories.PatientRepository;
import com.GestionMed.Entities.Patient;
import com.GestionMed.Services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patR;
	
	@Override
	public void createPatient(Patient p) {
		// TODO Auto-generated method stub
		this.patR.save(p);
		
	}

	@Override
	public List<Patient> findPatients() {
		// TODO Auto-generated method stub
		return patR.findAll();
	}

	@Override
	public Patient findOnePatient(long id) {
		// TODO Auto-generated method stub
		return this.patR.findById(id).get();
	}

	@Override
	public void updatePatient(Patient p) {
		// TODO Auto-generated method stub
		 this.patR.save(p);
		
	}

	@Override
	public void deletePatient(long id) {
		this.patR.deleteById(id);
		
	}

}