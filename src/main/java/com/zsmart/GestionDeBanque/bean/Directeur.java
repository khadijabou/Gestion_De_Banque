package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Directeur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id ;
private String Nom;
private String prenom;
@Temporal(javax.persistence.TemporalType.DATE)
@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="dd-MM-yyyy")
private Date DateNassace;
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @return the nom
 */
public String getNom() {
	return Nom;
}
/**
 * @return the prenom
 */
public String getPrenom() {
	return prenom;
}
/**
 * @return the dateNassace
 */
public Date getDateNassace() {
	return DateNassace;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @param nom the nom to set
 */
public void setNom(String nom) {
	Nom = nom;
}
/**
 * @param prenom the prenom to set
 */
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
/**
 * @param dateNassace the dateNassace to set
 */
public void setDateNassace(Date dateNassace) {
	DateNassace = dateNassace;
}
public Directeur() {
	super();
	// TODO Auto-generated constructor stub
}
public Directeur(Long id, String nom, String prenom, Date dateNassace) {
	super();
	this.id = id;
	Nom = nom;
	this.prenom = prenom;
	DateNassace = dateNassace;
}
@Override
public String toString() {
	return "Gerant [id=" + id + ", Nom=" + Nom + ", prenom=" + prenom + ", DateNassace=" + DateNassace + "]";
}

}
