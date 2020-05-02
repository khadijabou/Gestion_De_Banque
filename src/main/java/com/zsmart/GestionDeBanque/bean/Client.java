package com.zsmart.GestionDeBanque.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cin;
	private String nom;
	private String prenom;
	private String age;
	private String email;
        @OneToMany(mappedBy = "client")
private Compte compte;
       @OneToMany(mappedBy = "client")
private Commande commande;
    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
	
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}


	public Long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getAge() {
		return age;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long id, String code, String nom, String prenom, String age) {
		super();
		this.id = id;
		this.cin = code;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", code=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				 + "]";
	}

}
