package com.GestionMed.Entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "patient")
public class Patient implements Serializable{
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nameP;
	private Date dateDeNaissance;
	private String adresse;
	private Long numTel;
	@JsonBackReference
	@OneToMany(mappedBy="patient")
	List<Ordonnance> ordonnances=new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNameP() {
		return nameP;
	}
	public void setNameP(String nameP) {
		this.nameP = nameP;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Long getNumTel() {
		return numTel;
	}
	public void setNumTel(Long numTel) {
		this.numTel = numTel;
	}
	public List<Ordonnance> getOrdonnances() {
		return ordonnances;
	}
	public void setOrdonnances(List<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}
	public Patient(Long id, String nameP, Date dateDeNaissance, String adresse, Long numTel,
			List<Ordonnance> ordonnances) {
		super();
		this.id = id;
		
		this.nameP = nameP;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numTel = numTel;
		this.ordonnances = ordonnances;
	}
	public Patient() {
		super();
	}
	
	
	
	
	
}