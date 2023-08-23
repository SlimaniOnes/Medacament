package com.GestionMed.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.GestionMed.Entities.Patient;
import com.GestionMed.Models.PatientModel;
import com.GestionMed.Services.PatientService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*") 
public class PatientRestController {
	@Autowired
	PatientService patS;
	
	@PostMapping("/patients")
	void createPatient(@RequestBody PatientModel model) {
		Patient pat= new Patient();		
		pat.setNameP(model.getNameP());
		
		pat.setAdresse(model.getAdresse());
		pat.setDateDeNaissance(model.getDateDeNaissance());
		pat.setNumTel(model.getNumTel());	
	this.patS.createPatient(pat);
	}
	@GetMapping("/patients")
	List <Patient> Patients(){
		return this.patS.findPatients();
	}
	@GetMapping("/patients/{id}")
	Patient getOnePatient(@PathVariable long id) {
	return this.patS.findOnePatient(id)	;
	}

	@PutMapping("patients/{id}")
	void updatePatient(@PathVariable long id, @RequestBody  PatientModel model) {
		Patient pat = this.patS.findOnePatient(id);
		pat.setNameP(model.getNameP());
	
		pat.setAdresse(model.getAdresse());
		pat.setDateDeNaissance(model.getDateDeNaissance());
		pat.setNumTel(model.getNumTel());
	    this.patS.updatePatient(pat);
	}
	@DeleteMapping("/patients/{id}")
	void deletePatient(@PathVariable Long id) {
	this.patS.deletePatient (id)	;}
	
}

