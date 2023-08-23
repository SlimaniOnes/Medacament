package com.GestionMed.Entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ordonnance")
public class Ordonnance implements Serializable{
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date createAt;
	private Double totalPrice;
	@JsonBackReference
	@OneToMany(mappedBy="ordonnance")
	List<Medicament> medecaments=new ArrayList<>();

	@ManyToOne
	Patient patient;
	
	public Ordonnance() {
		super();
	}
	
	public Ordonnance(Long id, Date createAt, Double totalPrice, List<Medicament> medecaments, Patient patient) {
		super();
		this.id = id;
		this.createAt = createAt;
		this.totalPrice = totalPrice;
		this.medecaments = medecaments;
		this.patient = patient;
	}



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Medicament> getMedecaments() {
		return medecaments;
	}
	
	
	public void setMedecaments(List<Medicament> medecaments) {
		this.medecaments = medecaments;
	}
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}