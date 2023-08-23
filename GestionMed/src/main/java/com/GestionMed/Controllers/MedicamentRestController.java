package com.GestionMed.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.GestionMed.Entities.Medicament;
import com.GestionMed.Models.MedicamentModel;
import com.GestionMed.Services.*;
@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*")
public class MedicamentRestController {
	@Autowired
	MedicamentService medS;
    @Autowired
	OrdonnanceService ordS;
    
	@PostMapping("/medicaments")
	void createMedicament(@RequestBody MedicamentModel model) {
		Medicament med= new Medicament();	
		med.setMedName(model.getMedName());
		med.setPrice(model.getPrice());
		med.setCategorie(model.getCategorie());
		med.setOrdonnance(this.ordS.findOneOrdonnance(model.getOrdonnanceId()));	
	this.medS.createMedicament(med);}
	@GetMapping("/medicaments")
	List <Medicament> Medicaments(){
		return this.medS.findMedicaments();}
	@GetMapping("/medicaments/{id}")
	Medicament getOneMedicament(@PathVariable Long id) {
	return this.medS.findOneMedicament(id)	;}
	
	@PutMapping("/medicaments/{id}")
	void updateMedicament(@PathVariable Long id, @RequestBody  MedicamentModel model) {
		Medicament med = this.medS.findOneMedicament(id);
		med.setMedName(model.getMedName());
		med.setPrice(model.getPrice());
		med.setCategorie(model.getCategorie());
		med.setOrdonnance(this.ordS.findOneOrdonnance(model. getOrdonnanceId()));
		this.medS.updateMedicament(id,med);
	}
	@DeleteMapping("/medicaments/{id}")
	void deleteMedicament(@PathVariable Long id) {
	this.medS.deleteMedicament (id)	;}
	
}
