/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.bean;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
  private double decouvert;

public CompteCourant() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteCourant(String codeCompte, Date dateCreation, double solde,
		double decouvert) {
  super(codeCompte, dateCreation, solde);
	this.decouvert = decouvert;
}

public double getDecouvert() {
	return decouvert;
}

public void setDecouvert(double decouvert) {
	this.decouvert = decouvert;
}
}
   

