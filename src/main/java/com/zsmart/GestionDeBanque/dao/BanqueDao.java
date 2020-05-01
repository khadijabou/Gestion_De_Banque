/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.dao;

import com.zsmart.GestionDeBanque.bean.Agence;
import com.zsmart.GestionDeBanque.bean.Banque;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface BanqueDao extends JpaRepository<Banque , Long>{
 public List<Banque> findByReference(String reference);

    public List<Banque> findAll();
    

    
}
