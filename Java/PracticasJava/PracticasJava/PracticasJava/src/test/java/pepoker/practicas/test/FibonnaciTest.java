/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.pepoker.practicas.test;

import org.junit.Test;
import static org.junit.Assert.*;
import pepoker.practicasJava.Fibonnaci;

/**
 *
 * @author eduardo
 */
public class FibonnaciTest {
    
    public FibonnaciTest() {
    }
    
    @Test
    public void testSumaFibonnaciUntil100Es44(){
        assertTrue("Suma de finobbaci hasta el 100 es 44", Fibonnaci.sumaFibonnaciUntil(100) == 44);
    }
    
    @Test
    public void testSumaFibonnaciUntil100NoEs45() {
        assertFalse("El fibonacci de 100 no es 45",  Fibonnaci.sumaFibonnaciUntil(100) == 45);
    }
    
    @Test
    public void testSumaFibonnaciUntil2000000Es1089154() {
        assertTrue("El fibonacci de 2000000 no es 1089154 ",  Fibonnaci.sumaFibonnaciUntil(2000000) == 1089154);
    }
    
    @Test
    public void testSumaFibonnaciUntil0Es0() {
        assertTrue("El fibonacci de 2000000 no es 1089154 ",  Fibonnaci.sumaFibonnaciUntil(0) == 0);
    }
}
