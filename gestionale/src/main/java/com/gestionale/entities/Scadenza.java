package com.gestionale.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "scadenza")
public class Scadenza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int scadenza_id;
	protected Date data_scadenza;
	protected int attivita_id;
	
	
	public int getScadenza_id() {
		return scadenza_id;
	}
	public void setScadenza_id(int scadenza_id) {
		this.scadenza_id = scadenza_id;
	}
	public Date getData_scadenza() {
		return data_scadenza;
	}
	public void setData_scadenza(Date data_scadenza) {
		this.data_scadenza = data_scadenza;
	}
	public int getAttivita_id() {
		return attivita_id;
	}
	public void setAttivita_id(int attivita_id) {
		this.attivita_id = attivita_id;
	}

	

}
