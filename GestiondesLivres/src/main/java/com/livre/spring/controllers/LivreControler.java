package com.livre.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.livre.spring.entity.Livre;
import com.livre.spring.service.livreInterface;

@Controller
@RequestMapping("/livre")
public class LivreControler {

	@Autowired
	private livreInterface livre;
	private Livre monlivre;
	private ArrayList<Livre> lst;
	
	@RequestMapping("/ajouterLivre")
	public String ajouterunlivre(Livre livre , Model model){
		System.out.println("titre = "+livre.getTitre());
		livre.setApprove(false);
		this.livre.addBook(livre);
		lst = this.livre.findAll();
		model.addAttribute("lst", lst);
		return "listLivre";
	}
	
	@GetMapping("modifierLivre")
	public String modifierLivre( @RequestParam("id") long id ,Model model){
		System.out.println("dans modifer");
		Livre l = this.livre.findBookbyId(id);
		model.addAttribute("livre",l);
		return "modifierLivre";
	}
	
	public String afficherLlivre(@RequestParam("id") Long id , Model model){
		return "afficherLivre";
	}
	

	@GetMapping("SupprimerLivre")
	public String supprimerLivre(@RequestParam("id") Long id , Model model){
		this.livre.deleteBook(id);
		lst = this.livre.findAll();
		model.addAttribute("lst", lst);
		return "listLivre"; 
	}
	
	@PostMapping("/editerLivre")
	public String approuverLivre(@RequestParam("id") Long id , Livre livre,  Model model){
		System.out.println(livre.toString());
		this.livre.updateBook(livre, id);
		lst = this.livre.findAll();
		model.addAttribute("lst", lst);
		return "listLivre";
	}
	/*
	public Livre findBookbyId(long id);
	public Livre findBookbyName(String name);
	public ArrayList<Livre> findAll();
	public void deleteBook(long id);
	public void approveBook(long id);*/
}
