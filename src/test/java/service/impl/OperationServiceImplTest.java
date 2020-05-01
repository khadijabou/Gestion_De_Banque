/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import com.zsmart.GestionDeBanque.service.impl.OperationServiceImpl;
import com.zsmart.GestionDeBanque.bean.Client;
import com.zsmart.GestionDeBanque.bean.Operation;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class OperationServiceImplTest {
    
    public OperationServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findBySRef method, of class OperationServiceImpl.
     */
    @org.junit.Test
    public void testFindBySRef() {
        System.out.println("findBySRef");
        String ref = "";
        OperationServiceImpl instance = new OperationServiceImpl();
        Operation expResult = null;
        Operation result = instance.findBySRef(ref);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class OperationServiceImpl.
     */
    @org.junit.Test
    public void testFindAll() {
        System.out.println("findAll");
        OperationServiceImpl instance = new OperationServiceImpl();
        List<Operation> expResult = null;
        List<Operation> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByClient method, of class OperationServiceImpl.
     */
    @org.junit.Test
    public void testFindByClient() {
        System.out.println("findByClient");
        Client client = null;
        OperationServiceImpl instance = new OperationServiceImpl();
        List<Operation> expResult = null;
        List<Operation> result = instance.findByClient(client);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class OperationServiceImpl.
     */
    @org.junit.Test
    public void testSave() {
        System.out.println("save");
        Operation operation = null;
        OperationServiceImpl instance = new OperationServiceImpl();
        int expResult = 0;
        int result = instance.save(operation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verser method, of class OperationServiceImpl.
     */
    @org.junit.Test
    public void testVerser() {
        System.out.println("verser");
        double mt = 0.0;
        String cpte = "";
        Long codeEmp = null;
        OperationServiceImpl instance = new OperationServiceImpl();
        instance.verser(mt, cpte, codeEmp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirer method, of class OperationServiceImpl.
     */
    @org.junit.Test
    public void testRetirer() {
        System.out.println("retirer");
        double mt = 0.0;
        String cpte = "";
        Long codeEmp = null;
        OperationServiceImpl instance = new OperationServiceImpl();
        instance.retirer(mt, cpte, codeEmp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of virement method, of class OperationServiceImpl.
     */
    @org.junit.Test
    public void testVirement() {
        System.out.println("virement");
        double mt = 0.0;
        String cpte1 = "";
        String cpte2 = "";
        Long codeEmp = null;
        OperationServiceImpl instance = new OperationServiceImpl();
        instance.virement(mt, cpte1, cpte2, codeEmp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
