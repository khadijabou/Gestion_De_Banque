/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.bean;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity
@DiscriminatorValue("CCard")
public class CreditCard extends Commande{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  private Long  Card_Number;
  private Long ValeurVérification ;
  private Date Expires_Date;
  private double solde;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(Long Card_Number) {
        this.Card_Number = Card_Number;
    }

    public Long getValeurVérification() {
        return ValeurVérification;
    }

    public void setValeurVérification(Long ValeurVérification) {
        this.ValeurVérification = ValeurVérification;
    }

    public Date getExpires_Date() {
        return Expires_Date;
    }

    public void setExpires_Date(Date Expires_Date) {
        this.Expires_Date = Expires_Date;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditCard)) {
            return false;
        }
        CreditCard other = (CreditCard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.CreditCard[ id=" + id + " ]";
    }
    
}
