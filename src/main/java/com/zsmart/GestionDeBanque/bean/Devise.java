package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Devise  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id ;
	private String nom ;
	private double prix;
	private String unite;
	private String type;
	@OneToMany(mappedBy = "devise")
	 private List<Compte> comptes;
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
		return nom;
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @return the unite
	 */
	public String getUnite() {
		return unite;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
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
		this.nom = nom;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public void setUnite(String unite) {
		this.unite = unite;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
