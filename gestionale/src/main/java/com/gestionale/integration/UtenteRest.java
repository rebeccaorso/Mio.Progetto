package com.gestionale.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.gestionale.entities.Utente;
import com.gestionale.service.UtenteService;

@RestController
@RequestMapping("api")
public class UtenteRest {


@Autowired
private UtenteService service;

@CrossOrigin
@GetMapping("utente")
public List<Utente> getUtente(){
return service.getUtente();
}

@CrossOrigin
@PostMapping("check-username")
public @ResponseBody boolean checkUsernameAvailability(@RequestBody Utente u) {
    return service.isUsernameAvailable(u.getUsername());
}

@CrossOrigin
@PostMapping("check-email")
public @ResponseBody boolean checkEmailAvailability(@RequestBody Utente u) {
    return service.isEmailAvailable(u.getEmail());
}


@CrossOrigin
@PostMapping("utente")
Utente addUtente(@RequestBody Utente u) {
return service.addUtente(u);
		}

}

