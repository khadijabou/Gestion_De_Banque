package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Agence  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long numAgence;
private String libelle;
@ManyToOne
private Banque banque;
@ManyToOne
private Directeur directeur ;
@OneToMany(mappedBy = "agence")
private Employe employe;
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

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Directeur getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Directeur directeur) {
        this.directeur = directeur;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
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
