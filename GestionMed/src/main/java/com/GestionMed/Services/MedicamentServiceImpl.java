package com.GestionMed.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GestionMed.Repositories.MedicamentRepository;
import com.GestionMed.Entities.Medicament;
import com.GestionMed.Services.MedicamentService;

@Service
public class MedicamentServiceImpl	 implements MedicamentService {

			@Autowired
			 MedicamentRepository medR;
			
			@Override
			public void createMedicament(Medicament m) {
				this.medR.save(m);}

			@Override
			public List<Medicament> findMedicaments() {
				return this.medR.findAll();}

			@Override
			public Medicament findOneMedicament(long id) {
				return this.medR.findById(id).get();}

			@Override
			public void deleteMedicament(long id) {
				 this.medR.deleteById(id);}

			@Override
			public void updateMedicament(long id, Medicament m) {
				Medicament exist = this.medR.findById(id).get();
			        exist.setMedName(m.getMedName());
			        exist.setPrice(m.getPrice());
			      exist.setCategorie(m.getCategorie());
			        exist.setOrdonnance(m.getOrdonnance());
			        this.medR.save(exist);
			        }		
			}