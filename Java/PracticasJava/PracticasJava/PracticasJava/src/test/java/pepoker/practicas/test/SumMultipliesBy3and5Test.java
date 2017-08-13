/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.pepoker.practicas.test;

import org.junit.Test;
import static org.junit.Assert.*;
import pepoker.practicasJava.SumMultipliesBy3and5;

/**
 *
 * @author eduardo
 */
public class SumMultipliesBy3and5Test {
    
    public SumMultipliesBy3and5Test() {
    }
    
    @Test
    public void testFailWith11(){
        assertFalse("Error con 11 debe se 33", 33 != SumMultipliesBy3and5.getSumNumberMultipliesBy3and5(11));
    }
    
    @Test
    public void testWith10(){
        assertEquals(23, SumMultipliesBy3and5.getSumNumberMultipliesBy3and5(10));
    }
    
    @Test
    public void testWith11(){
        assertEquals(33, SumMultipliesBy3and5.getSumNumberMultipliesBy3and5(11));
    }
    
    @Test
    public void testWith1000(){
        assertEquals(233168, SumMultipliesBy3and5.getSumNumberMultipliesBy3and5(1000));
    }
}
