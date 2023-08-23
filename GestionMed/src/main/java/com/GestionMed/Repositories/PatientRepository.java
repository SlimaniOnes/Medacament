package com.GestionMed.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionMed.Entities.Patient;

@Transactional
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
