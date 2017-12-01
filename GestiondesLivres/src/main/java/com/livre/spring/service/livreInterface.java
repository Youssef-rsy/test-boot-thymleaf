package com.livre.spring.service;

import java.util.ArrayList;

import com.livre.spring.entity.Livre;

public interface livreInterface {

	public void addBook(Livre livre);
	public void updateBook(Livre livre , long id);
	public Livre findBookbyId(long id);
	public Livre findBookbyName(String name);
	public ArrayList<Livre> findAll();
	public void deleteBook(long id);
	public void approveBook(long id);
	
	
	
}
