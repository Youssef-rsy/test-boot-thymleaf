package com.livre.spring.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.livre.spring.entity.Livre;
import com.livre.spring.service.livreInterface;

@Controller
public class MainControler {
	
	@Autowired
	private livreInterface livre;
	private Livre monlivre;
	private ArrayList<Livre> lst;
	
  @RequestMapping(value="/home")
	public String home(Livre livre , Model model){
	  model.addAttribute("livre", new Livre());
		return "index";
	}
  
  @RequestMapping(value="/lists")
 	public String list(Model model){
	  System.out.println("hello");
	     lst = this.livre.findAll();
	     System.out.println(lst.size());
		model.addAttribute("lst", lst);
 		return "listLivre";
 	}
  
  @RequestMapping(value="/modifier")
	public String m(){
		return "listLivre";
	}
}
