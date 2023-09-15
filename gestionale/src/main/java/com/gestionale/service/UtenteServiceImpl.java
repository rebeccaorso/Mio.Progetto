package com.gestionale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionale.entities.Utente;
import com.gestionale.repos.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	private UtenteDAO dao;
	
	@Override
	public List<Utente> getUtente() {
		return dao.findAll();
	}

	@Override
	public Utente addUtente(Utente u) {
		return dao.save(u);
	}

	@Override
	public List<Utente> getUtenteByUtenteID(int utenteID) {
		// TODO Auto-generated method stub
		return dao.getUtenteByUtenteID(utenteID);
	}

	@Override
	public boolean isUsernameAvailable(String username) {
	       Utente u = dao.findByUsername(username);
	       return u == null;
	   }



	@Override
	public boolean isEmailAvailable(String email) {
		Utente u = dao.findByEmail(email);
		return u == null;
	}

	@Override
	public List<Utente> getUtenteByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
