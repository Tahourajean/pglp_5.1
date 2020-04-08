/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq;

import PersonnelSerialization.PersDeserializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class PersDeserializableTest {
    
    public PersDeserializableTest() {
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
     * Test of persoDeserialize method, of class PersDeserializable.
     */
    @Test
    public void testPersoDeserialize() throws IOException, FileNotFoundException, ClassNotFoundException {
        System.out.println("persoDeserialize");
        PersDeserializable instance = new PersDeserializable();
        Personnel p=instance.persoDeserialize();
        if (p==null)
            fail("The test case is a prototype.");
        else
            System.out.println(";on objet:"+p);
                    
    }
    
}
