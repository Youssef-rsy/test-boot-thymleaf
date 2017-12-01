package com.livre.spring.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.livre.spring.entity.Livre;
import com.livre.spring.object.ReturnObject;
import com.livre.spring.service.livreInterface;

@RestController
public class RestlivreController {

	@Autowired
	private livreInterface livre;
	private Livre monlivre;
	private ArrayList<Livre> lst;

	
	@RequestMapping("/ajouterLivre")
	public String ajouterunlivre(Livre livre  ){
		System.out.println(livre.toString());
		livre.setApprove(false);
		this.livre.addBook(livre);
		lst = this.livre.findAll();
		ReturnObject<ArrayList<Livre>> r = new ReturnObject<>();
		return "";
	}
	
	@GetMapping("modifierLivre")
	public String modifierLivre( @RequestParam("id") long id ){
		System.out.println("dans modifer");
		Livre l = this.livre.findBookbyId(id);
		return "";
	}
	
	public String afficherLlivreS( ){
		lst = this.livre.findAll();
		return "";
	}
	

	@GetMapping("SupprimerLivre")
	public String supprimerLivre(@RequestParam("id") Long id  ){
		this.livre.deleteBook(id);
		lst = this.livre.findAll();
		return ""; 
	}
	
	@PostMapping("/editerLivre")
	public String approuverLivre(@RequestParam("id") Long id , Livre livre){
		System.out.println(livre.toString());
		this.livre.updateBook(livre, id);
		lst = this.livre.findAll();
		return "";
	}
	
	
}
