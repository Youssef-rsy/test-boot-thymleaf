package com.livre.spring.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAdmin ; 
	private String nom;
	private String prenon;
	private boolean etatActive;
	@OneToMany
	private List<Role> role;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(long idAdmin, String nom, String prenon, boolean etatActive, List<Role> role) {
		super();
		this.idAdmin = idAdmin;
		this.nom = nom;
		this.prenon = prenon;
		this.etatActive = etatActive;
		this.role = role;
	}
	public Admin(String nom, String prenon, boolean etatActive, List<Role> role) {
		super();
		this.nom = nom;
		this.prenon = prenon;
		this.etatActive = etatActive;
		this.role = role;
	}
	public long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenon() {
		return prenon;
	}
	public void setPrenon(String prenon) {
		this.prenon = prenon;
	}
	public boolean isEtatActive() {
		return etatActive;
	}
	public void setEtatActive(boolean etatActive) {
		this.etatActive = etatActive;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	
	
	
	
}
