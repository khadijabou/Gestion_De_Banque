/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.service.facade;

import com.zsmart.GestionDeBanque.bean.Client;
import com.zsmart.GestionDeBanque.bean.Compte;
import com.zsmart.GestionDeBanque.bean.Operation;
import java.util.List;

/**
 *
 * @author HP
 */
public interface OperationService {
     public Operation findBySRef(String ref);
     public List<Operation> findAll();  
    public List<Operation> findByClient(Client client);
    public int save(Operation operation ) ;
     public Compte consulterCompte(String cpte);
    /**
     *
     * @param mt
     * @param cpte
     * @param codeEmp
     */
 
 public void verser(double mt,String cpte,Long codeEmp);
	public void retirer(double mt,String cpte,Long codeEmp);
	public void virement(double mt,String cpte1,String cpte2,Long codeEmp);   
}
