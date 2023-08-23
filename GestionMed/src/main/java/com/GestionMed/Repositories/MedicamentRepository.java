package com.GestionMed.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionMed.Entities.Medicament;

@Transactional
public interface MedicamentRepository extends JpaRepository<Medicament, Long>  {

}