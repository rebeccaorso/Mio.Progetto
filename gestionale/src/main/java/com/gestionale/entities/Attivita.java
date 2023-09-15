package com.gestionale.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attivita")
public class Attivita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int attivita_id;
	@Column(length = 50)
	protected String nome_attivita;
	@Column(length = 15)
	protected String stato;
	protected Date data_creazione;
	protected Date data_scadenza;
	protected int utente_id;
	protected int categoria_id;
	
	
	public int getAttivita_id() {
		return attivita_id;
	}
	public void setAttivita_id(int attivita_id) {
		this.attivita_id = attivita_id;
	}
	public String getNome_attivita() {
		return nome_attivita;
	}
	public void setNome_attivita(String nome_attivita) {
		this.nome_attivita = nome_attivita;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Date getData_creazione() {
		return data_creazione;
	}
	public void setData_creazione(Date data_creazione) {
		this.data_creazione = data_creazione;
	}
	public Date getData_scadenza() {
		return data_scadenza;
	}
	public void setData_scadenza(Date data_scadenza) {
		this.data_scadenza = data_scadenza;
	}
	public int getUtente_id() {
		return utente_id;
	}
	public void setUtente_id(int utente_id) {
		this.utente_id = utente_id;
	}
	public int getCategoria_id() {
		return categoria_id;
	}
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	
	

}
