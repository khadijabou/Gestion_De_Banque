package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.JoinColumn;

@Entity
public class Operation implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
         private Long id; 
	private String ref;
  private Long numeroOperation;
  @Temporal(javax.persistence.TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="dd-MM-yyyy")
  private Date dateOperation;
  private String ribrecepteur;
  private double montant;
  @ManyToOne
  private Compte compte;
  @ManyToOne
  private Employe employe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Long getNumeroOperation() {
        return numeroOperation;
    }

    public void setNumeroOperation(Long numeroOperation) {
        this.numeroOperation = numeroOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getRibrecepteur() {
        return ribrecepteur;
    }

    public void setRibrecepteur(String ribrecepteur) {
        this.ribrecepteur = ribrecepteur;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

public Operation() {
	super();
	// TODO Auto-generated constructor stub
}
public Operation(Date dateOperation, double montant) {
	super();
	this.dateOperation = dateOperation;
	this.montant = montant;

}}
