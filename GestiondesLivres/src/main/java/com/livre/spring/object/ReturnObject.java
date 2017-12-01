package com.livre.spring.object;

public class ReturnObject<T> {

	private T valeur;
	private Etat etat;
	private String message ;
	public ReturnObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReturnObject(T valeur, Etat etat, String message) {
		super();
		this.valeur = valeur;
		this.etat = etat;
		this.message = message;
	}
	public T getValeur() {
		return valeur;
	}
	public void setValeur(T valeur) {
		this.valeur = valeur;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
