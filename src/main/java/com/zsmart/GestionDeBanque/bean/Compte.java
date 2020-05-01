package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compte implements Serializable{
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
// communique au client un N° de compte identifiable par une série de chiffre « RIB »
private String rib;
private double  solde;
  private String codeCompte;
   private Date dateCreation;
@ManyToOne
private Client client;

@ManyToOne
private Devise devise ;
@ManyToOne
 private Employe employe;
 @OneToMany(mappedBy="compte")
   private List<Operation> operations;
/**
 * @return the id
 */
public Long getId() {
	return id;
}


public Employe getEmploye() {
	return employe;
}

public void setId(Long id) {
	this.id = id;
}

    public String getCodeCompte() {
        return codeCompte;
    }

    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

public String getRib() {
	return rib;
}

public void setRib(String rib) {
	this.rib = rib;
}


public void setEmploye(Employe employe) {
	this.employe = employe;
}

public double getSolde() {
	return solde;
}

public Client getClient() {
	return client;
}

public Devise getDevise() {
	return devise;
}

public void setSolde(double solde) {
	this.solde = solde;
}

public void setClient(Client client) {
	this.client = client;
}

public void setDevise(Devise devise) {
	this.devise = devise;
}


public Compte() {
	super();
	// TODO Auto-generated constructor stub
}


public Compte(String codeCompte, Date dateCreation, double solde) {
	super();
	this.codeCompte = codeCompte;
	this.dateCreation = dateCreation;
	this.solde = solde;
}

}
