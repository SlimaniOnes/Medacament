package com.GestionMed.Services;

import java.util.List;

import com.GestionMed.Entities.Ordonnance;

public interface OrdonnanceService {

	void createOrdonnance(Ordonnance o);
	List<Ordonnance> findOrdonnances();
	Ordonnance findOneOrdonnance(long id);
	void updateOrdonnance(long id,Ordonnance o);
	void deleteOrdonnance(long id);
}