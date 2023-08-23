package com.GestionMed.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionMed.Entities.Ordonnance;

@Transactional
public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long>  {

}