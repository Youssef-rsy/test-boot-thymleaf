package com.livre.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livre.spring.entity.Livre;

@Repository
public interface livreRepository extends JpaRepository<Livre, Long>{

	public Livre findLivreByTitre(String titre);
	
}
