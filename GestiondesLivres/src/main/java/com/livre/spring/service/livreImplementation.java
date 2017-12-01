package com.livre.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livre.spring.dao.livreRepository;
import com.livre.spring.entity.Livre;
@Service
public class livreImplementation implements livreInterface {

	@Autowired
	private livreRepository livrerep;
	
	private Livre livre;
	
	@Override
	public void addBook(Livre livre) {
		// TODO Auto-generated method stub
		livrerep.save(livre);
	}

	@Override
	public void updateBook(Livre livre, long id) {
		// TODO Auto-generated method stub
		this.livre = livrerep.findOne(id);
		this.livre.setAuteur(livre.getAuteur());
		this.livre.setResumer(livre.getResumer());
		this.livre.setTitre(livre.getTitre());
		this.livre.setApprove(livre.getApprove());
		this.livre.setDateedtion(livre.getDateedtion());
		livrerep.saveAndFlush(this.livre);
	}

	@Override
	public Livre findBookbyId(long id) {
		// TODO Auto-generated method stub
		this.livre = livrerep.findOne(id);
		return this.livre;
	}

	@Override
	public Livre findBookbyName(String name) {
		// TODO Auto-generated method stub
		this.livre = livrerep.findLivreByTitre(name);
		return this.livre;
	}

	@Override
	public ArrayList<Livre> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Livre> lst = (ArrayList<Livre>) livrerep.findAll();
		return lst;
	}

	@Override
	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		livrerep.delete(id);
		
	}

	@Override
	public void approveBook(long id) {
		// TODO Auto-generated method stub
		this.livre = livrerep.findOne(id);
		this.livre.setApprove(true);
		livrerep.saveAndFlush(this.livre);
	}

}
