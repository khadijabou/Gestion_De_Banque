package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Banque  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String nom;
private String reference;
@OneToMany(mappedBy = "banque")
private Client client;
@OneToMany(mappedBy = "banque")
private Agence agence;
public Long getId() {
	return id;
}

public String getNom() {
	return nom;
}

public void setId(Long id) {
	this.id = id;
}
public void setNom(String nom) {
	this.nom = nom;
}

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

}
