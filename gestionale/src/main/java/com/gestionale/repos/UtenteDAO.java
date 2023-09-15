package com.gestionale.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionale.entities.Utente;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Integer>{

	List<Utente> getUtenteByUtenteID(int utenteu);

	Utente findByUsername(String username);
	
	Utente findByEmail(String email);

}
