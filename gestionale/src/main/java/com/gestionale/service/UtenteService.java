package com.gestionale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.gestionale.entities.Utente;
import com.gestionale.repos.UtenteDAO;


public interface UtenteService {
	
	List<Utente> getUtente();
	Utente addUtente(Utente u);

	List<Utente> getUtenteByUtenteID(int utenteID);
	boolean isUsernameAvailable(String username);
	
	List<Utente> getUtenteByEmail(String email);
	boolean isEmailAvailable(String email);
	
	 
	    
}
