/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.service.facade;

import com.zsmart.GestionDeBanque.bean.Agence;
import com.zsmart.GestionDeBanque.bean.Banque;
import java.util.List;

/**
 *
 * @author HP
 */
public interface AgenceService {
   public List<Agence> findByLibelle(String libelle);

    public List<Agence> findAll();
   public List<Agence> findByBanque(Banque banque);  
   public int save(Agence agence);
}
