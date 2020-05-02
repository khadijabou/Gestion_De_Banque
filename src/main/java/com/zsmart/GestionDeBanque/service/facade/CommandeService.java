/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.service.facade;


import com.zsmart.GestionDeBanque.bean.Commande;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CommandeService {
    public Commande findBySRef(String ref);

    public List<Commande> findAll();
    
   public int save(Commande commande);
}
