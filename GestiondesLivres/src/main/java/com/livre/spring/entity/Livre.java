package com.livre.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String titre;
	private String Auteur;
	private String resumer;
	private Date dateedtion;
	private Boolean approve;
	
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livre(String titre, String auteur, String resumer, Date dateedtion, Boolean approve) {
		super();
		this.titre = titre;
		Auteur = auteur;
		this.resumer = resumer;
		this.dateedtion = dateedtion;
		this.approve = approve;
	}

	public Livre(long id, String titre, String auteur, String resumer, Date dateedtion, Boolean approve) {
		super();
		this.id = id;
		this.titre = titre;
		Auteur = auteur;
		this.resumer = resumer;
		this.dateedtion = dateedtion;
		this.approve = approve;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public String getResumer() {
		return resumer;
	}
	public void setResumer(String resumer) {
		this.resumer = resumer;
	}
	public Date getDateedtion() {
		return dateedtion;
	}
	public void setDateedtion(Date dateedtion) {
		this.dateedtion = dateedtion;
	}
	public Boolean getApprove() {
		return approve;
	}
	public void setApprove(Boolean approve) {
		this.approve = approve;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "titre = "+titre+" auteur = "+Auteur+" resumer = "+resumer+" date = "+dateedtion+" approve = "+approve;
	}
	
}
