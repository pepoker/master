/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.pepoker.practicas.test;

import org.junit.Test;
import static org.junit.Assert.*;
import pepoker.practicasJava.NPrimo;

/**
 *
 * @author eduardo
 */
public class NPrimoTest {
    
    public NPrimoTest() {
    }
    
    @Test
    public void testGetNPrimeCon1() {
        assertTrue("El primer primo es 2", NPrimo.getNPrime(1)==2);
        assertFalse("El primer primo es 1", NPrimo.getNPrime(1)==1);
    }
    
    @Test
    public void testGetNPrimeCon1001() {
        assertTrue("El primo 1001 es 7927", NPrimo.getNPrime(1001)==7927);
    }
    
    @Test
    public void testGetNPrimeCon2() {
        assertTrue("El primo 2 es 3", NPrimo.getNPrime(2)==3);
    }
    
    @Test
    public void testGetNPrimeCon12434() {
        assertTrue("El primo 12434 es 133241", NPrimo.getNPrime(12434)==133241);
    }
}
