package com.gestionale.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int utenteID;
	
	@Column(length = 50)
	protected String nome;
	@Column(length = 50)
	protected String cognome;
	protected Date data_nascita;
	@Column(length = 40)
	protected String comune_residenza;
	@Column(length = 15)
	protected String genere;
	@Column(length = 30)
	protected String email;
	@Column(length = 20)
	protected String password;
	@Column (length = 15)
	protected String username;
	
	
	
	public int getUtenteID() {
		return utenteID;
	}
	public void setUtenteID(int utenteID) {
		this.utenteID = utenteID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(Date data_nascita) {
		this.data_nascita = data_nascita;
	}
	public String getComune_residenza() {
		return comune_residenza;
	}
	public void setComune_residenza(String comune_residenza) {
		this.comune_residenza = comune_residenza;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
