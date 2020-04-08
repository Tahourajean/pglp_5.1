/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq;

import PersonnelSerialization.PersSerializable;
import java.io.File;
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
public class PersSerializableTest {

    public PersSerializableTest() {
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
     * Test of persoSerialize method, of class PersSerializable.
     */
    @Test
    public void testPersoSerialize() {
        System.out.println("persoSerialize");
        PersSerializable instance = new PersSerializable();
        instance.persoSerialize();
        File f = new File("C:\\Users\\USER\\Desktop\\coursM1\\s2\\PGL\\pglp_5.1\\personnel.txt");
        if (f.isFile()) {
            System.out.println("le test est ok");
        }
        else
        fail("le test a échoué.");
    }

}
