/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.dao;

import com.zsmart.GestionDeBanque.bean.Client;
import com.zsmart.GestionDeBanque.bean.Commande;
import com.zsmart.GestionDeBanque.bean.Compte;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface CommandeDao extends JpaRepository<Commande , Long>{
    public Commande findBySRef(String ref);

    public List<Commande> findAll();
    
 
}
