/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.GestionDeBanque.dao;

import com.zsmart.GestionDeBanque.bean.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface EmployeDao extends JpaRepository<Employe , Long>{
    
}
