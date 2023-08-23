package com.GestionMed.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.GestionMed.Entities.Ordonnance;
import com.GestionMed.Models.OrdonnanceModel;
import com.GestionMed.Services.*;
@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*") 
public class OrdonnanceRestController {
	@Autowired
	PatientService patS;
	@Autowired
	OrdonnanceService ordS;
	
	@PostMapping("/ordonnances")
	void createOrdonnance(@RequestBody OrdonnanceModel model) {
		Ordonnance ord= new Ordonnance();	
		ord.setTotalPrice(model.getTotalPrice());
		ord.setCreateAt(model.getCreateAt());
		ord.setPatient(this.patS.findOnePatient(model.getPatientId()));
	this.ordS.createOrdonnance(ord);}
	@GetMapping("/ordonnances")
	List <Ordonnance> Ordonnances(){
		return this.ordS.findOrdonnances();
	}
	@GetMapping("/ordonnances/{id}")
	Ordonnance getOneOrdonnance(@PathVariable long id) {
	return this.ordS.findOneOrdonnance(id)	;
	}
	
	@PutMapping("/ordonnances/{id}")
	void updateOrdonnance(@PathVariable long id, @RequestBody  OrdonnanceModel model) {
		Ordonnance ord = this.ordS.findOneOrdonnance(id);

		ord.setTotalPrice(model.getTotalPrice());
		ord.setCreateAt(model.getCreateAt());
		ord.setPatient(this.patS.findOnePatient(model.getPatientId()));
	    this.ordS.updateOrdonnance(id,ord);
	}
	@DeleteMapping("/ordonnances/{id}")
	void deleteOrdonnance(@PathVariable Long id) {
	this.ordS.deleteOrdonnance (id)	;}
}
