package com.GestionMed.Models;

public class MedicamentModel {
	private String medName;
	private Double price;
	private String categorie;
	private long ordonnanceId;
	
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public long getOrdonnanceId() {
		return ordonnanceId;
	}
	public void setOrdonnanceId(long ordonnanceId) {
		this.ordonnanceId = ordonnanceId;
	}

	
	
}
