/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.service.facade;


import com.zsmart.GestionDeBanque.bean.Banque;
import java.util.List;

/**
 *
 * @author HP
 */
public interface BanqueService {
  public List<Banque> findByReference(String reference);

    public List<Banque> findAll();
   public int save(Banque banque);
}
