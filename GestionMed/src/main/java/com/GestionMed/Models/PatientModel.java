package com.GestionMed.Models;
import java.sql.Date;

public class PatientModel {
	private String nameP;
	
	private Date dateDeNaissance;
	private String adresse;
	private long numTel;
	
	
	
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
	public long getNumTel() {
		return numTel;
	}
	public void setNumTel(long numTel) {
		this.numTel = numTel;
	}
	
	
	
		
	
}