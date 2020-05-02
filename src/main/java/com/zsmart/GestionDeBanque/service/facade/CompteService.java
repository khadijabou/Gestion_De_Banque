/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.service.facade;


import com.zsmart.GestionDeBanque.bean.Client;
import com.zsmart.GestionDeBanque.bean.Compte;
import java.util.List;

/**
 *
 * @author HP
 */
public interface CompteService {
      public List<Compte> findByClient(Client client);   

    public List<Compte> findAll();
    
   public int save(Compte compte);
}
