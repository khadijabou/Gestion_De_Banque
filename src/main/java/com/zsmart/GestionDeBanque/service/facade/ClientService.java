/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.service.facade;


import com.zsmart.GestionDeBanque.bean.Banque;
import com.zsmart.GestionDeBanque.bean.Client;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ClientService {
   public Client findByCin(String cin);

    public List<Client> findAll();
    
   public int save(Client client);
}
