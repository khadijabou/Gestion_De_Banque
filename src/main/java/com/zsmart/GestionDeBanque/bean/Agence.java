package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Agence  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long numAgence;
private String libelle;
@ManyToOne
private Banque banque;
@ManyToOne
private Directeur gerant ;

public Long getNumAgence() {
	return numAgence;
}

public String getLibelle() {
	return libelle;
}

public void setNumAgence(Long numAgence) {
	this.numAgence = numAgence;
}

public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public Agence(Long numAgence, String libelle, Banque banque) {
	super();
	this.numAgence = numAgence;
	this.libelle = libelle;
	this.banque = banque;
}
public Agence() {
	super();
	// TODO Auto-generated constructor stub
}

}
