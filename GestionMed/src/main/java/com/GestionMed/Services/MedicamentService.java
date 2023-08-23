package com.GestionMed.Services;

import java.util.List;

import com.GestionMed.Entities.Medicament;

public interface MedicamentService {
	void createMedicament(Medicament m); 
	List<Medicament> findMedicaments();
	Medicament findOneMedicament(long id);	
	void deleteMedicament(long id);
	void updateMedicament(long id, Medicament m);
}

