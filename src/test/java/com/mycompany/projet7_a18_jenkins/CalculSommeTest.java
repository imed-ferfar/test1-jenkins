/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projet7_a18_jenkins;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author BaDRi
 */
public class CalculSommeTest {
    
    public CalculSommeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CalculSomme method, of class CalculSomme.
     */
    @org.junit.jupiter.api.Test
    public void testCalculSomme() {
        System.out.println("CalculSomme");
        int valeur1 = 5;
        int valeur2 = 7;
        int expResult = 11;
        int result = CalculSomme.CalculSomme(valeur1, valeur2);
        assertEquals(expResult, result);

    }
    
}
