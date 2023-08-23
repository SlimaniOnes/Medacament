package com.GestionMed.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionMed.Repositories.OrdonnanceRepository;
import com.GestionMed.Entities.Ordonnance;
import com.GestionMed.Services.OrdonnanceService;

@Service
public class OrdonnanceServiceImpl implements OrdonnanceService  {

	@Autowired
	OrdonnanceRepository ordR;
	
	@Override
	public void createOrdonnance(Ordonnance o) {
		this.ordR.save(o);
		
	}

	@Override
	public List<Ordonnance> findOrdonnances() {
		return ordR.findAll();
	}

	@Override
	public Ordonnance findOneOrdonnance(long id ) {
		return this.ordR.findById(id).get();
	}

	@Override
	public void updateOrdonnance( long id,Ordonnance o) {
		
		Ordonnance exist = this.ordR.findById(id).get();
        exist.setCreateAt(o.getCreateAt());
        exist.setTotalPrice(o.getTotalPrice());
     
        exist.setPatient(o.getPatient());

       
		 this.ordR.save(exist);
		
	}

	@Override
	public void deleteOrdonnance(long id) {
		this.ordR.deleteById(id);
		
	}

}