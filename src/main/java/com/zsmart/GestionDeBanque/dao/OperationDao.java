/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.dao;


import com.zsmart.GestionDeBanque.bean.Client;
import com.zsmart.GestionDeBanque.bean.Compte;
import com.zsmart.GestionDeBanque.bean.Operation;
import com.zsmart.GestionDeBanque.bean.Verement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface OperationDao extends JpaRepository<Operation , Long>{
    public Operation findBySRef(String ref);

    public List<Operation> findAll();  
    public List<Operation> findByClient(Client client);

    public void addOperation(Verement verement, String cpte, Long codeEmp);

    public Compte consulterCompte(String cpte);

   
}
