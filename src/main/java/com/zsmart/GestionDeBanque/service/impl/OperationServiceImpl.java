/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.service.impl;

import com.zsmart.GestionDeBanque.bean.Client;
import com.zsmart.GestionDeBanque.bean.Compte;
import com.zsmart.GestionDeBanque.bean.Operation;
import com.zsmart.GestionDeBanque.bean.Retrait;
import com.zsmart.GestionDeBanque.bean.Verement;
import com.zsmart.GestionDeBanque.dao.OperationDao;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zsmart.GestionDeBanque.service.facade.OperationService;

/**
 *
 * @author HP
 */
@Service
public class OperationServiceImpl implements OperationService{
    @Autowired
private OperationDao operationDao; 
    @Override
    public Operation findBySRef(String ref) {
       return operationDao.findBySRef(ref);
    }

    @Override
    public List<Operation> findAll() {
       return operationDao.findAll();
    }

    @Override
    public List<Operation> findByClient(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(Operation operation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@Override
	public Compte consulterCompte(String codeCpte) {
		// TODO Auto-generated method stub
		return operationDao.consulterCompte(codeCpte);
	}
    
    @Override
	public void verser(double mt, String cpte, Long codeEmp) {
		operationDao.addOperation(new Verement(new Date(),mt), cpte, codeEmp);
		Compte cp=operationDao.consulterCompte(cpte);
		cp.setSolde(cp.getSolde()+mt);
	}

	@Override
	public void retirer(double mt, String cpte, Long codeEmp) {
		operationDao.addOperation(new Verement(new Date(),mt), cpte, codeEmp);
		Compte cp=operationDao.consulterCompte(cpte);
		cp.setSolde(cp.getSolde()-mt);
		
	}

	@Override
	public void virement(double mt, String cpte1, String cpte2, Long codeEmp) {
		retirer(mt, cpte1, codeEmp);	
		verser(mt, cpte2, codeEmp);
	}

}
